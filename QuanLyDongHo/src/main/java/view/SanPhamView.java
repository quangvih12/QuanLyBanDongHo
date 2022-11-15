/*
 * Created by JFormDesigner on Tue Nov 15 11:24:35 ICT 2022
 */

package view;

import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author nguyenntt
 */
public class SanPhamView extends JFrame {
    public SanPhamView() {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        tblSanPham = new JTable();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label8 = new JLabel();
        label9 = new JLabel();
        panel2 = new JPanel();

        //======== this ========
        setTitle("Qu\u1ea3n l\u00fd s\u1ea3n ph\u1ea9m");
        var contentPane = getContentPane();

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {

                //---- label1 ----
                label1.setText("M\u00e3 s\u1ea3n ph\u1ea9m:");

                //---- label2 ----
                label2.setText("T\u00ean s\u1ea3n ph\u1ea9m:");

                //---- label3 ----
                label3.setText("S\u1ed1 l\u01b0\u1ee3ng c\u00f2n:");

                //---- label4 ----
                label4.setText("\u0110\u01a1n gi\u00e1:");

                //---- label5 ----
                label5.setText("Th\u1eddi gian b\u1ea3o h\u00e0nh:");

                //---- label6 ----
                label6.setText("D\u00f2ng s\u1ea3n ph\u1ea9m");

                //---- label7 ----
                label7.setText("M\u00e0u s\u1eafc");

                //---- label8 ----
                label8.setText("N\u01a1i s\u1ea3n xu\u1ea5t:");

                //---- label9 ----
                label9.setText("Th\u01b0\u01a1ng hi\u1ec7u");

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(tblSanPham, GroupLayout.DEFAULT_SIZE, 1851, Short.MAX_VALUE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGap(104, 104, 104)
                                            .addComponent(label1)
                                            .addGap(18, 18, 18)
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(104, 104, 104)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                        .addComponent(label4)
                                                        .addComponent(label3)
                                                        .addComponent(label5)
                                                        .addComponent(label6)
                                                        .addComponent(label7)
                                                        .addComponent(label8)
                                                        .addComponent(label9))
                                                    .addGap(18, 18, 18))
                                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(label2)
                                                    .addGap(48, 48, 48)))
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 1350, Short.MAX_VALUE)))
                            .addContainerGap())
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2))
                            .addGap(66, 66, 66)
                            .addComponent(label3)
                            .addGap(18, 18, 18)
                            .addComponent(label4)
                            .addGap(18, 18, 18)
                            .addComponent(label5)
                            .addGap(18, 18, 18)
                            .addComponent(label6)
                            .addGap(73, 73, 73)
                            .addComponent(label7)
                            .addGap(73, 73, 73)
                            .addComponent(label8)
                            .addGap(18, 18, 18)
                            .addComponent(label9)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                            .addComponent(tblSanPham, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }
            tabbedPane1.addTab("S\u1ea3n ph\u1ea9m", panel1);

            //======== panel2 ========
            {

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGap(0, 1863, Short.MAX_VALUE)
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGap(0, 1101, Short.MAX_VALUE)
                );
            }
            tabbedPane1.addTab("Thu\u1ed9c t\u00ednh s\u1ea3n ph\u1ea9m", panel2);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 1133, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTable tblSanPham;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label8;
    private JLabel label9;
    private JPanel panel2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
