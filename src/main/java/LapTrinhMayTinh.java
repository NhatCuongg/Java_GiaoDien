
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class LapTrinhMayTinh extends JFrame{
    private JTextField txDisplay;
    private JButton btReset;
    private JButton[] bt = new JButton[16];
    private String[] str = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};

    public LapTrinhMayTinh(){
        setTitle("May tinh");
        taogiaodien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void taogiaodien() {
        JPanel p1 = new JPanel();
        p1.add(txDisplay = new JTextField());
        txDisplay.setPreferredSize(new Dimension(200, 30));
        p1.add(btReset = new JButton("c"));

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 4, 5, 5));
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton(str[i]);
            p2.add(bt[i]);
        }

        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        LapTrinhMayTinh frm = new LapTrinhMayTinh();
        frm.setVisible(true);
    }
}
