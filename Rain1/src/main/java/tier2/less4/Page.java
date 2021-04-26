package tier2.less4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Page extends JFrame{
    JPanel jpNorth = new JPanel(new GridLayout());
    JPanel jpSouth = new JPanel(new GridLayout());

    JButton button1 = new JButton("SEND");
    JTextArea area1 = new JTextArea();
    JScrollPane scroll = new JScrollPane(area1);
    JTextField textF = new JTextField();



        Page(){
        super("Super chat");
        setSize(400, 400);

        area1.setLineWrap(true);//авто перенос текста
        area1.setEditable(false);//запрет редактирования текста(который уже отправили)


        jpNorth.add(scroll);
        jpSouth.add(textF);
        jpSouth.add(button1);

        add(jpNorth);//добавляем в окно панель
        add("South", jpSouth);//добавляем в окно панель


        button1.addActionListener(e -> {
            sendMessage();
        });
        textF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();//проверяет нажали ли мы enter
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void sendMessage() {
        String out = textF.getText();
        area1.append( "отправлен : "+ out + "\n");
        textF.setText("");//убирает написанный текс из строки
    }
}
