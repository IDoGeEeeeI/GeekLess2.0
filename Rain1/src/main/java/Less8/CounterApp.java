package Less8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;
    private int sav;
    private boolean chek=false;

    public CounterApp(int initialValue) {
        setBounds(1000, 200, 320,320 );
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        JButton reset = new JButton("reset value");
        reset.setFont(font);
        add(reset,BorderLayout.SOUTH );

        JButton save = new JButton("save value");
        save.setFont(font);
        add(save,BorderLayout.NORTH );




        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            value=0;
            counterValueView.setText(String.valueOf(value));
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (chek==false){
                    sav=value;
                    chek=true;
                    counterValueView.setText(String.valueOf(value));
                }
                else  {
                    counterValueView.setText(String.valueOf(sav));
                    chek=false;
                }
            }
        });

        setVisible(true);
    }
}
