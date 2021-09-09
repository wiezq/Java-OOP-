package fourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilanMadrid extends JFrame {
    JPanel[] pnl = new JPanel[9];
    String milan = "AC MILAN";
    String madrid = "Real Madrid";
    JButton mButton = new JButton(milan);
    JButton rButton = new JButton(madrid);
    int milanScr = 0;
    int madridScr = 0;
    JLabel resLabel = new JLabel("Result: " + milanScr + " X " + madridScr);
    String last_scorer = "N/A";
    JLabel lstLabel = new JLabel("Last scorer: " + last_scorer);
    String lastWinner = "DRAW";
    Label winLabel = new Label("Winner: " + lastWinner);

    public MilanMadrid() {
        super("Милан и Мадрид");
        setSize(800, 600);
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[1].add(resLabel);
        pnl[3].add(mButton);
        pnl[4].add(lstLabel);
        pnl[5].add(rButton);
        pnl[7].add(winLabel);

        mButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScr++;
                last_scorer = milan;
                if(milanScr > madridScr)
                {
                    lastWinner = milan;
                }
                else {
                    if (milanScr < madridScr) {
                        lastWinner = madrid;
                    }
                    else
                    {
                        lastWinner = "DRAW";
                    }
                }
                resLabel.setText("Result: " + milanScr + " X " + madridScr);
                lstLabel.setText("Last scorer: " + last_scorer);
                winLabel.setText("Winner: " + lastWinner);
            }
        });

        rButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScr++;
                last_scorer = madrid;
                if(milanScr > madridScr)
                {
                    lastWinner = milan;
                }
                else {
                    if (milanScr < madridScr) {
                        lastWinner = madrid;
                    }
                    else
                    {
                        lastWinner = "DRAW";
                    }
                }
                resLabel.setText("Result: " + milanScr + " X " + madridScr);
                lstLabel.setText("Last scorer: " + last_scorer);
                winLabel.setText("Winner: " + lastWinner);
            }
        });


    }

    public static void main(String[] args) {
        new MilanMadrid().setVisible(true);
    }
}
