package Course.Course1.Lessons.JavaLesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends JFrame {

    /**
     * Весь код пока пишем в конструкторе
     */
    public MyWindow() {
        /**
         * Создание окна
         */
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
            }
        });

        /**
         * Создание кнопок с названием
         */
        /*JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");*/

        /**
         * Добавление кнопок в окно (расположение север и юг)
         */
        /*add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);*/

        /**
         * Использовали новый компоновщик, создали 10 кнопок и выровняли по оси Х
         */
        /*setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton("#" + i);
            add(button);
        }*/
        /**
         * Если недостаточно ширины, кнопки переносятся на новую строчку
         */
        /*setLayout(new FlowLayout());
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton("#" + i);
            add(button);
        }*/
        /**
         * Создание сетки 3*3
         */
        /*setLayout(new GridLayout(3,3));
        for (int i = 1; i < 10; i++) {
            JButton button = new JButton("#" + i);
            add(button);
        }*/

        /**
         * Без компановщика элементов
         */
        setLayout(null);
        /*for (int i = 1; i < 10; i++) {
            JButton button = new JButton("#" + i);
            add(button);
        }*/
        /**
         * Создали и добавили текстовое поле с размерами
         */
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 120, 32);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Enter pressed");
            }
        });
        add(textField);

        /**
         * Создали и добавили кнопку с размерами
         */
        JButton button = new JButton("Press here!");
        button.setBounds(20, 60, 120, 32);

        //Добавление слушателя, для того чтобы кнопка работала
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Pressed");
            }
        });

        add(button);


        /**
         * Сделать окно видимым
         */
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
