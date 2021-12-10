package lab6;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Game extends JFrame{
    JTextField enter;
    JButton button1 = new JButton("Начать игру");
    JLabel number_of_attempts = new JLabel("");
    JLabel result = new JLabel("");
    JLabel close = new JLabel("");
    Game()
    {
        super("Угадайка"); // Название окна
        Random random = new Random();
        final int[] game_status = {0};
        final int[] attempt = {3};
        final int[] number = {0};
        setSize(400, 400); // Размер окна
        setVisible(true); // Видимость окна
        Container c = getContentPane();
        c.setLayout(null);

        enter = new JTextField(15);
        enter.setToolTipText("");

        enter.setBounds(150, 10, 70, 40);
        button1.setBounds(90,60,200,50);
        result.setBounds(130, 150, 200, 50);
        close.setBounds(130, 190, 200, 50);
        c.add(button1);
        c.add(result);
        c.add(close);
        number_of_attempts.setBounds(130,110,200,50);

        c.add(number_of_attempts);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (game_status[0] == 1)
                {
                    attempt[0] = 3;
                    button1.setText("Начать игру");
                    number_of_attempts.setText("");
                    result.setText("");
                    close.setText("");
                    game_status[0] = 0;
                }
                else
                {
                    c.add(enter);
                    number[0] = random.nextInt(20);
                    System.out.println("Рандомное число: " + number[0]);
                    button1.setText("Закончить игру");
                    number_of_attempts.setText("Попыток осталось: " + attempt[0]);
                    game_status[0] = 1;
                }
            }
        });

        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(attempt[0] != 0)
                {
                    int result1 = Integer.parseInt (enter.getText());
                    if(result1 == number[0]) {
                        JOptionPane.showMessageDialog(Game.this,
                                "Поздравляю, вы угадали. Правильное число было: " + number[0]);
                        System.exit(0);
                    }
                    else {
                        attempt[0] = attempt[0] - 1;
                        number_of_attempts.setText("Попыток осталось: " + attempt[0]);
                        result.setText("Вы не угадали");
                        if(result1 > number[0]) {
                            close.setText("Ваше число больше");
                        }
                        else {
                            close.setText("Ваше число меньше");
                        }
                    }
                }
                if(attempt[0] == 0)
                {
                    int result1 = Integer.parseInt (enter.getText());
                    if(result1 == number[0]) {
                        JOptionPane.showMessageDialog(Game.this,
                                "Поздравляю, вы угадали. Правильное число было: " + number[0]);
                        System.exit(0);
                    }
                    else {
                        JOptionPane.showMessageDialog(Game.this,
                                "Попытки кончились, вы проиграли. Правильное число было: " + number[0]);
                        System.exit(0);
                    }
                }
            }
        });
    }
    public static void main(String[] args) {
        new Game();
    }
}