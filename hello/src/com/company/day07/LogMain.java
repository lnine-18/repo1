package com.company.day07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.Calendar;


public class LogMain extends JFrame {
    //定义界面上的所有组件
    //pUp面板用于盛放年、月、日、查询、保存、删除等小组件
    JPanel pUp = new JPanel();
    JPanel pCenter = new JPanel();
    JLabel lblYear = new JLabel("年");
    JLabel lblMonth = new JLabel("月");
    JLabel lblDay = new JLabel("日");
    JComboBox cbxYear = new JComboBox();//年下拉列表
    JComboBox cbxMonth = new JComboBox();//月下拉列表
    JComboBox cbxDay = new JComboBox();//日下拉列表
    JButton btnQuery = new JButton("查询");
    JButton btnSave = new JButton("保存");
    JButton btnDelete = new JButton("删除");
    JTextArea jtaContent = new JTextArea(20, 50);//输入、显示日记内容
    JScrollPane scrollPane;//scrollPane用于盛放文本区组件jtaContent
    String filePath ="Log\\";//log是日记文件保存的文件夹
    //在log文件夹下根据年份来建立子文件夹，文件名为“月日.txt”，log位于工程名文件夹下
    public LogMain() {
        //在构造方法中把各个组件添加到合适的位置
        super("我的日记本");
        pUp.add(lblYear);
        pUp.add(cbxYear);
        pUp.add(lblMonth);
        pUp.add(cbxMonth);
        pUp.add(lblDay);
        pUp.add(cbxDay);
        pUp.add(btnQuery);
        pUp.add(btnSave);
        pUp.add(btnDelete);
        scrollPane = new JScrollPane(jtaContent);
        pCenter.add(scrollPane);
        this.add(pUp, BorderLayout.NORTH);
        this.add(pCenter, BorderLayout.CENTER);
        //将cbxYear组件添加2019-2029年
        for (int i = 2019; i <= 2029; i++) {
            cbxYear.addItem(String.valueOf(i));
        }
        //让cbxYear默认选择当前年
        Calendar calendar = Calendar.getInstance();
        cbxYear.setSelectedItem(String.valueOf(calendar.get(Calendar.YEAR)));
        for (int i = 1; i <= 12; i++) {
            cbxMonth.addItem(String.valueOf(i));
        }//将cbxMonth组件添加到1-12月
        cbxMonth.setSelectedItem(String.valueOf(calendar.get(Calendar.MONTH) + 1));//将cbxMonth默认选择当前月
        //将cbxDay组件添加天数列表
        for (int i = 1; i <= getDay(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1); i++) {
            cbxDay.addItem(String.valueOf(i));
        }
        //让cbxDay默认选择当前日
        cbxDay.setSelectedItem(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
        //下面开始添加事件
        //1 cbxYear的onChange事件。年变化后，日下拉列表也要发生变化
        cbxYear.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int year = Integer.parseInt(cbxYear.getSelectedItem().toString());
                int month = Integer.parseInt(cbxMonth.getSelectedItem().toString());
                //将cbxDay组件添加天数列表，添加之前要先清除原来的数据，因为原来已经有数据了；
                cbxDay.removeAllItems();
                for (int i = 1; i <= getDay(year, month); i++) {
                    cbxDay.addItem(String.valueOf(i));
                }
            }
        });
        //2 cbxMonth 的onchange事件。月变化后，日下拉列表也要发生变化
        cbxMonth.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int year = Integer.parseInt(cbxYear.getSelectedItem().toString());
                int month = Integer.parseInt(cbxMonth.getSelectedItem().toString());
                //将cbxDay组件添加天数列表
                cbxDay.removeAllItems();
                for (int i = 0; i <= getDay(year, month); i++) {
                    cbxDay.addItem(String.valueOf(i));
                }
            }
        });
        //3 为“查询”按钮添加事件
        btnQuery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileName = filePath + cbxYear.getSelectedItem().toString() + "\\" + cbxMonth.getSelectedItem().toString() + cbxDay.getSelectedItem().toString() + ".txt";
                File path = new File(filePath + cbxYear.getSelectedItem().toString() + "\\");
                if (path.exists()) {
                    try {
                        if (!loadFile(fileName)) {
                            //如果文件不存在，提示日记不存在并清空文本区域原来的内容
                            JOptionPane.showMessageDialog(LogMain.this, cbxYear.getSelectedItem().toString() + "年" + cbxMonth.getSelectedItem().toString() + "月" + cbxDay.getSelectedItem().toString() + "号没有日记");
                            jtaContent.setText("");
                        } else {
                            JOptionPane.showMessageDialog(LogMain.this, "查询成功");
                        }
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(LogMain.this, "查询失败：" + e1.getMessage());
                    }
                } else {
                    //文件夹不存在，先创建文件夹，再加载文件
                    path.mkdir();
                    try {
                        if (!loadFile(fileName)) {
                            JOptionPane.showMessageDialog(LogMain.this, cbxYear.getSelectedItem().toString() + "年" + cbxMonth.getSelectedItem().toString() + "月" + cbxDay.getSelectedItem().toString() + "号没有日记");
                            jtaContent.setText("");
                        } else {
                            JOptionPane.showMessageDialog(LogMain.this, "查询成功");
                        }
                    } catch (IOException e1) {
                        System.out.println("读取文件数据失败：" + e1.getMessage());
                        JOptionPane.showMessageDialog(null, "查询失败：" + e1.getMessage());
                    }
                }
            }
        });
        //4为“删除”按钮添加事件
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //判断该年份的目录是否存在，每年一个目录
                String fileName = filePath + cbxYear.getSelectedItem().toString() + "\\" + cbxMonth.getSelectedItem().toString() + cbxDay.getSelectedItem().toString() + ".txt";
                File file = new File(fileName);
                if (file.exists()) {
                    //文件存在，删除文件
                    if (file.delete())
                        JOptionPane.showMessageDialog(null, "删除成功");
                    else
                        JOptionPane.showMessageDialog(null, "删除失败");
                }
                jtaContent.setText("");//删除文件同时要清空界面文本区中的内容
            }
        });
        //5为”保存"按钮添加事件
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileName = filePath + cbxYear.getSelectedItem().toString() + "\\" + cbxMonth.getSelectedItem().toString() + cbxDay.getSelectedItem().toString() + ".txt";
                File file = new File(fileName);
                try {
                    saveFile(fileName);
                    JOptionPane.showMessageDialog(null, "保存成功");
                } catch (IOException e1) {
                    System.out.println("保存文件失败：" + e1.getMessage());
                    JOptionPane.showMessageDialog(null, "保存失败");
                }
            }
        });
        this.setSize(600, 450);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        LogMain main = new LogMain();
    }

    //getDay(int year,int month)方法是根据参数year、month来得到该年月所拥有的总天数
    public int getDay(int year, int month) {
        int dnum = 0;//保存月里的天数
        boolean isleap = false;//是否是闰年，先默认不是闰年
        if (year < 1000 || year > 9999 || month < 1 || month > 12) {
            System.out.println("输入的日期不合法");
            return 0;
        }
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))//是闰年
            isleap = true;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dnum = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dnum = 30;
                break;
            case 2:
                if (isleap)
                    dnum = 29;
                else
                    dnum = 28;
                break;
        }
        return dnum;
    }
    public boolean loadFile(String fileName) throws IOException{
        BufferedReader reader=null;
        File file=new File(fileName);
        if (!file.exists())
            return false;
        reader=new BufferedReader(new FileReader(file));
        String content="";
        jtaContent.setText("");
        while((content=reader.readLine())!=null){
            //用readLine（）读入数据时，碰到“\r\n"就停止读入，即没有读入”\r\n"
            jtaContent.append(content+"\n");
        }
        reader.close();
        return true;
    }
    public void saveFile(String fileName) throws IOException{
        BufferedWriter writer=null;
        File file=new File(fileName);
        if (!file.exists())
            file.createNewFile();
        writer=new BufferedWriter(new FileWriter(file));
        writer.write(jtaContent.getText().replaceAll("\n","\r\n"));
        writer.close();
    }
}