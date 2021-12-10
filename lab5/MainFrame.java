package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private final JLabel imgLabel;
    private int imgNum = 1;
    JButton button1 = new JButton("Начать анимацию"); // Первая кнопка
    JButton button2 = new JButton("Прервать анимацию"); // Вторая кнопка
    JLabel status = new JLabel("Анимация выключена");
    private MainFrame(){
        super("Покадровая анимация"); // Название окна
        setSize(600, 500); // Размер окна
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.png")), SwingConstants.CENTER);
        getContentPane().add(imgLabel);
        Container c = getContentPane();
        c.setLayout(null);
        button1.setBounds(20, 10, 170, 40);
        c.add(button1);
        button2.setBounds(390, 10, 170, 40);
        c.add(button2);
        status.setBounds(220, 10, 140, 40);
        c.add(status);
        imgLabel.setBounds(40, 20, 500, 500);
        c.add(imgLabel);
        Timer timer = new Timer(100, e -> nextImg());
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                status.setText("Анимация включена");
                timer.start();
            }
        });

        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                status.setText("Анимация выключена");
                timer.stop();
            }
        });

    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".png")));
        if(imgNum == 12) imgNum = 0;

    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);
    }
}
