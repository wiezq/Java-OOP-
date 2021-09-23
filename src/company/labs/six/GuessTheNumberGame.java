package labs.six;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessTheNumberGame extends JFrame {
    JPanel[] pnl = new JPanel[3];
    JLabel message = new JLabel("Guess the number from 0 to 20");
    JTextField tf = new JTextField(2);
    JButton button = new JButton("Угадать");
    private int guessed_number = (int) (Math.random() * 21);
    private int tries = 0;

    public GuessTheNumberGame() {
        super("Угадайте число от 0 до 20");
        System.out.println(guessed_number);
        setSize(800, 600);
        setLayout(new GridLayout(3, 1));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[0].add(message);
        pnl[1].add(tf);
        pnl[2].add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tries++;
                int tri = Integer.parseInt(tf.getText().trim());
                if (tri == guessed_number) {
                    JOptionPane.showMessageDialog(null, "Поздравляем вы угадали число: " + guessed_number);
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    System.exit(1);
                } else {
                    JOptionPane.showMessageDialog(null, "Неправильно, попробуйте еще раз");
                    if (tries == 3) {
                        JOptionPane.showMessageDialog(null, "Попытки закончились, вы проиграли");
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        System.exit(1);
                    }
                }

            }
        });


    }

    public static void main(String[] args) {
        new GuessTheNumberGame().setVisible(true);
    }
}
