package pract7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class onQueue {
    private Queue<Integer> firstPlayer;
    private Queue<Integer> secondPlayer;
    private String[] buffer;
    private String input;
    private Integer bufferNumber;
    private BufferedReader reader;
    private boolean playStatus=true;
    public onQueue() throws IOException
    {
        firstPlayer=new LinkedList<>();
        secondPlayer= new LinkedList<>();
        pushQueue(firstPlayer);
        pushQueue(secondPlayer);
        play();
    }
    public void pushQueue(Queue<Integer> stack) throws IOException
    {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter cards for player");
        input = reader.readLine();
        buffer=input.split(" ");
        for (String name : buffer)
        {
            bufferNumber=Integer.parseInt(name);
            stack.add(bufferNumber);
        }

    }
    public void endTurn(Queue<Integer>buff,boolean firstPlayerIsWinner)
    {
        if (firstPlayerIsWinner) {
            buff.add(firstPlayer.poll());
            buff.add(secondPlayer.poll());
        }
        else
        {
            buff.add(secondPlayer.poll());
            buff.add(firstPlayer.poll());
        }
    }
    public void play()
    {
        int counter=0;
        while (playStatus)
        {
            if (firstPlayer.isEmpty())
            {
                playStatus = false;
                System.out.println("second "+counter);

            }
            else if (secondPlayer.isEmpty())
            {
                playStatus = false;
                System.out.println("first "+counter);
            }
            else if (counter==106)
            {
                playStatus = false;
                System.out.println("botva");
            }
            else
            {
                if (firstPlayer.peek()==0 && secondPlayer.peek()==9)
                {
                    endTurn(firstPlayer,true);
                }
                else if (firstPlayer.peek()==9 && secondPlayer.peek()==0)
                {
                    endTurn(secondPlayer,false);
                }
                else
                {
                    if(firstPlayer.peek()>secondPlayer.peek())
                    {
                        endTurn(firstPlayer,true);
                    }
                    else
                    {
                        endTurn(secondPlayer,false);
                    }
                }
                counter++;
            }
        }
    }
}