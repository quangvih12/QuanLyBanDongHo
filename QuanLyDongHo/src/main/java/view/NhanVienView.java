/*
 * Created by JFormDesigner on Tue Nov 15 12:03:02 ICT 2022
 */

package view;

import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.table.*;

import com.formdev.flatlaf.FlatIntelliJLaf;
import model.nhanvien.NhanVien;
import service.NhanVienService;
import viewmodel.NhanVienViewModel;

import java.awt.*;
import java.util.List;
import java.util.UUID;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author nguyenntt
 */
public class NhanVienView extends JFrame {
    DefaultTableModel model;
    NhanVienService service = new NhanVienService();
    public NhanVienView() {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        loadTable();
    }

    private void btnAdd(ActionEvent e) {
        // TODO add your code here
        NhanVien nv = new NhanVien(
                UUID.randomUUID().hashCode(),
                txtMaNV.getText(),
                txtTen.getText(),
                "",
                txtHoDem.getText(),
                txtGioiTinh.getText(),
                txtNgaySinh.getText(),
                txtDiaChi.getText(),
                txtSDT.getText(),
                "",
                "",
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
        service.add(nv);
        loadTable();
    }

    private void btnUpdate(ActionEvent e) {
        // TODO add your code here
        NhanVien nv = new NhanVien(
                UUID.randomUUID().hashCode(),
                txtMaNV.getText(),
                txtTen.getText(),
                "",
                txtHoDem.getText(),
                txtGioiTinh.getText(),
                txtNgaySinh.getText(),
                txtDiaChi.getText(),
                txtSDT.getText(),
                "",
                "",
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
        service.update(nv,txtMaNV.getText());
        loadTable();
    }

    public void loadTable() {
        model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        List<NhanVienViewModel> list = service.get();
        for (NhanVienViewModel nv : list) {
            model.addRow(new Object[] {
                    nv.getMaNV(),
                    nv.getHoTen(),
                    nv.getNgaySinh(),
                    nv.getGioiTinh(),
                    nv.getSoDT(),
                    nv.getDiaChi()
            });
        }
    }

    private void tblNhanVienMouseClicked(MouseEvent e) {
        // TODO add your code here
        txtMaNV.setText(tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(),0).toString());
    }

    private void btnClear(ActionEvent e) {
        // TODO add your code here
        txtMaNV.setText(null);
        txtHoDem.setText(null);
        txtTen.setText(null);
        txtGioiTinh.setText(null);
        txtNgaySinh.setText(null);
        txtDiaChi.setText(null);
        txtDiaChi.setText(null);
        txtSDT.setText(null);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label8 = new JLabel();
        txtMaNV = new JTextField();
        txtHoDem = new JTextField();
        txtGioiTinh = new JTextField();
        txtTen = new JTextField();
        txtNgaySinh = new JTextField();
        txtDiaChi = new JTextField();
        txtSDT = new JTextField();
        scrollPane1 = new JScrollPane();
        tblNhanVien = new JTable();
        btnAdd = new JButton();
        btnUpdate = new JButton();
        btnClear = new JButton();
        panel2 = new JPanel();
        label10 = new JLabel();

        //======== this ========
        setTitle("Qu\u1ea3n l\u00fd nh\u00e2n vi\u00ean");
        var contentPane = getContentPane();

        //======== tabbedPane1 ========
        {
            tabbedPane1.setPreferredSize(new Dimension(1863, 1133));

            //======== panel1 ========
            {

                //---- label1 ----
                label1.setText("M\u00e3 nh\u00e2n vi\u00ean:");

                //---- label2 ----
                label2.setText("Gi\u1edbi t\u00ednh:");

                //---- label3 ----
                label3.setText("H\u1ecd \u0111\u1ec7m:");

                //---- label4 ----
                label4.setText("T\u00ean:");

                //---- label5 ----
                label5.setText("\u0110\u1ecba ch\u1ec9:");

                //---- label6 ----
                label6.setText("S\u1ed1 \u0111i\u1ec7n tho\u1ea1i:");

                //---- label8 ----
                label8.setText("Ng\u00e0y sinh:");

                //======== scrollPane1 ========
                {

                    //---- tblNhanVien ----
                    tblNhanVien.setModel(new DefaultTableModel(
                        new Object[][] {
                        },
                        new String[] {
                            "M\u00e3 NV", "H\u1ecd t\u00ean", "Ng\u00e0y sinh", "Gi\u1edbi t\u00ednh", "S\u1ed1 \u0110T", "\u0110\u1ecba ch\u1ec9"
                        }
                    ));
                    tblNhanVien.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            tblNhanVienMouseClicked(e);
                        }
                    });
                    scrollPane1.setViewportView(tblNhanVien);
                }

                //---- btnAdd ----
                btnAdd.setText("Th\u00eam");
                btnAdd.addActionListener(e -> btnAdd(e));

                //---- btnUpdate ----
                btnUpdate.setText("C\u1eadp nh\u1eadt");
                btnUpdate.addActionListener(e -> btnUpdate(e));

                //---- btnClear ----
                btnClear.setText("Clear");
                btnClear.addActionListener(e -> btnClear(e));

                //======== panel2 ========
                {
                    panel2.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
                    panel2.setLayout(null);

                    //---- label10 ----
                    label10.setText("Photo");
                    panel2.add(label10);
                    label10.setBounds(new Rectangle(new Point(130, 180), label10.getPreferredSize()));

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel2.getComponentCount(); i++) {
                            Rectangle bounds = panel2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel2.setMinimumSize(preferredSize);
                        panel2.setPreferredSize(preferredSize);
                    }
                }

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1841, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(label3, GroupLayout.Alignment.LEADING)
                                                .addComponent(label4, GroupLayout.Alignment.LEADING))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(label2, GroupLayout.Alignment.LEADING)
                                                .addComponent(label8, GroupLayout.Alignment.LEADING)
                                                .addComponent(label5, GroupLayout.Alignment.LEADING)
                                                .addComponent(label6, GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNgaySinh)
                                        .addComponent(txtHoDem)
                                        .addComponent(txtTen)
                                        .addComponent(txtGioiTinh)
                                        .addComponent(txtDiaChi)
                                        .addComponent(txtSDT)
                                        .addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMaNV, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                            .addGap(289, 289, 289)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(btnAdd)
                                .addComponent(btnUpdate))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
                            .addGap(319, 319, 319))
                );
                panel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnAdd, btnUpdate});
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(btnAdd)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtMaNV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtHoDem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label4))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtGioiTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label2))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label8))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label5))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label6))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
                panel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {btnAdd, btnUpdate});
            }
            tabbedPane1.addTab("Nh\u00e2n vi\u00ean", panel1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 1853, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label8;
    private JTextField txtMaNV;
    private JTextField txtHoDem;
    private JTextField txtGioiTinh;
    private JTextField txtTen;
    private JTextField txtNgaySinh;
    private JTextField txtDiaChi;
    private JTextField txtSDT;
    private JScrollPane scrollPane1;
    private JTable tblNhanVien;
    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnClear;
    private JPanel panel2;
    private JLabel label10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
