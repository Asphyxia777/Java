package pract7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class onStack {
    private Stack<Integer> bufferStack;
    private Stack<Integer> firstPlayer;
    private Stack<Integer> secondPlayer;
    private BufferedReader reader;
    private String[] buffer;
    private String input;
    private Integer bufferNumber;
    private boolean playStatus = true;

    public onStack() throws IOException {
        firstPlayer = new Stack<>();
        secondPlayer = new Stack<>();
        pushStack(firstPlayer);
        pushStack(secondPlayer);
    }

    public void play() {
        int counter = 0;
        while (playStatus) {
            if (firstPlayer.empty()) {
                playStatus = false;
                System.out.println("second " + counter);

            } else if (secondPlayer.empty()) {
                playStatus = false;
                System.out.println("first " + counter);

            }
            else if (counter == 106)
            {
                playStatus = false;
                System.out.println("botva");
            }
            else {
                if (firstPlayer.peek() == 0 && secondPlayer.peek() == 9) {
                    endTurn(firstPlayer,true);
                    counter++;
                } else if (firstPlayer.peek() == 9 && secondPlayer.peek() == 0) {
                    endTurn(secondPlayer,false);
                    counter++;
                } else {
                    if (firstPlayer.peek() > secondPlayer.peek()) {
                        endTurn(firstPlayer,true);
                        counter++;
                    } else {
                        endTurn(secondPlayer,false);
                        counter++;
                    }
                }
            }
        }
    }
    public void endTurn(Stack<Integer> stack,boolean firstplayerIsWinner)
    {
        if (firstplayerIsWinner) {
            stack.push(firstPlayer.pop());
            stack.push(secondPlayer.pop());
        }
        else
        {
            stack.push(secondPlayer.pop());
            stack.push(firstPlayer.pop());
        }
    }
    public void pushStack(Stack<Integer> stack) throws IOException {
        bufferStack= new Stack<>();
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter cards for player");
        input = reader.readLine();
        buffer=input.split(" ");
        for (String name : buffer) {
            bufferNumber = Integer.parseInt(name);
            bufferStack.push(bufferNumber);
        }
        while(!bufferStack.empty())
        {
            stack.push(bufferStack.pop());
        }
        bufferStack.clear();

    }
}

