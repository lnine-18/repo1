package com.company.day05.package1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add2 extends JFrame implements ActionListener {
    private JTextField txtNumber1 = new JTextField(10);
    private JLabel lblFuHao = new JLabel("+");
    private JTextField txtNumber2 = new JTextField(10);
    private JButton btnEqual = new JButton("=");
    private JTextField txtsum = new JTextField(10);

    public Add2() {
        setTitle("两个数相加的程序");
        initialize();
    }

    public void initialize() {
        setLayout(new FlowLayout());
        add(txtNumber1);
        add(lblFuHao);
        add(txtNumber2);
        add(btnEqual);
        add(txtsum);
        btnEqual.addActionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Add2 add = new Add2();
        add.setSize(500, 100);
        add.setVisible(true);
        add.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEqual) {
            if (txtNumber1.getText().trim().equals("") || txtNumber2.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(Add2.this, "加数与被加数都不能为空", "提示信息", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            double a, b, sum;
            try {
                a = Double.valueOf(txtNumber1.getText());
                b = Double.valueOf(txtNumber2.getText());
                sum = a + b;
                txtsum.setText(String.valueOf(sum));
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(Add2.this, "加数与被加数都必须是数字", "提示信息", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }
}