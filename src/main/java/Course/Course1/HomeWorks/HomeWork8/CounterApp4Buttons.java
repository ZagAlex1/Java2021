package Course.Course1.HomeWorks.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp4Buttons extends JFrame {

    private int value;
    private JLabel infoLabel;
    private int windowHeight = 200;
    private int windowWidth = 500;

    public CounterApp4Buttons(int x, int y) {
        setBounds(x, y, windowWidth, windowHeight);
        setTitle(" Счетчик ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 25);

        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font);                                        //Женя как сделать, чтобы поля label и infoLabel всегда были по середине.
        label.setHorizontalAlignment(SwingConstants.CENTER);        //Независимо от ширины окна. У меня только кнопки удалось зафиксировать.
        label.setVerticalAlignment(SwingConstants.NORTH);
        label.setBounds(windowWidth - 370, 60, 230, windowHeight-95);
        add(label);

        infoLabel = new JLabel();
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoLabel.setBounds(windowWidth - 370,0,230,windowHeight-135);
        add(infoLabel);


        setLayout(null);

        JButton tenDecrementButton = new JButton("<<");
        tenDecrementButton.setFont(font);
        tenDecrementButton.setBounds(0, 0, 65, windowHeight - 35);
        add(tenDecrementButton);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.setBounds(65, 0, 65, windowHeight - 35);
        add(decrementButton);

        JButton tenIncrementButton = new JButton(">>");
        tenIncrementButton.setFont(font);
        tenIncrementButton.setBounds(windowWidth - 75, 0, 65, windowHeight - 35);
        add(tenIncrementButton);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.setBounds(windowWidth - 140, 0, 65, windowHeight - 35);
        add(incrementButton);



        tenDecrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -= 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        tenIncrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value += 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        setVisible(true);

    }

    private void validateRange() {
        if (Math.abs(value) > 100) {
            infoLabel.setText("Value out of range");
        } else {
            infoLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new CounterApp4Buttons(400, 400);
    }


}
