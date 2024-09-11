
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class TinhToanDonGian extends JFrame{
    private JLabel lb1, lb2, lb3;
    private JTextField tx1, tx2, txKQ;
    private JButton btCong, btTru, btNhan, btChia;
    TinhToanDonGian(){
        setTitle("Tinh toan don gian");
        TaoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void TaoGiaoDien(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(lb1 = new JLabel("so 1"));
        p1.add(tx1 = new JTextField());
        p1.add(lb2 = new JLabel("so 2"));
        p1.add(tx2 = new JTextField());
        p1.add(lb3 = new JLabel("Ket qua"));
        p1.add(txKQ = new JTextField());
        
        JPanel p2 = new JPanel();
        p2.add(btCong = new JButton("Cong"));
        p2.add(btTru = new JButton("Tru"));
        p2.add(btNhan = new JButton("Nhan"));
        p2.add(btChia = new JButton("Chia"));
        
        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
    
    //Phep tinh cong
        btCong.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(tx1.getText());
                double y = Double.parseDouble(tx2.getText());
                double kq = x + y;
                txKQ.setText(String.valueOf(kq));              
            }
        });

        btTru.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(tx1.getText());
                double y = Double.parseDouble(tx2.getText());
                double kq = x - y;
                txKQ.setText(String.valueOf(kq));              
            }
        });
        
        btNhan.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(tx1.getText());
                double y = Double.parseDouble(tx2.getText());
                double kq = x * y;
                txKQ.setText(String.valueOf(kq));              
            }
        });
        
        btChia.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(tx1.getText());
                double y = Double.parseDouble(tx2.getText());
                double kq = x / y;
                txKQ.setText(String.valueOf(kq));              
            }
        });
    }
    public static void main(String[] args){
        TinhToanDonGian frm = new TinhToanDonGian();
        frm.setVisible(true);
    }
}
