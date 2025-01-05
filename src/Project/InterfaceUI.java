package Project;

import java.awt.Color;
import javax.swing.*;

import java.util.Random;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InterfaceUI extends javax.swing.JFrame {
    Random random = new Random();
    
    boolean truck = true;
    boolean activate_transport = true;
    
    final int SIZE = 3;
    int transport_queue = 0;
    int front_transport_queue = -1;
    int rear_transport_queue = -1;
    
    int logNo = 0;
    double balance = 10000.0;
    
    int[] times = {10000, 9000, 8000, 7000, 6000, 5000, 11000, 12000, 13000, 14000};
    
    public InterfaceUI() {
        initComponents();
        whenSelectTableWerehouse();
        whenDoubleClickTableCustomer();
        auto_control_value();
        auto_customer_order();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Warehouse");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setMargin(new java.awt.Insets(210, 14, 3, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Transport");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Customer");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setMargin(new java.awt.Insets(210, 14, 3, 14));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Operation Log");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 199, 19));
        jLabel3.setText("$");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("10,000.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 450));

        jTabbedPane1.setBackground(new java.awt.Color(52, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(52, 51, 51));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setDoubleBuffered(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setText("Warehouse");

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Crude Oil", "500.00", "75.45", "Barrels", "37725.00", "+0.00"},
                {"2", "NGV", "200.00", "510.75", "Tons", "102150.00", "+0.00"},
                {"3", "LPG", "50.00", "570.20", "Tons", "28510.00", "+0.00"},
                {"4", "Gasoline", "90.00", "850.75", "Tons", "76567.50", "+0.00"},
                {"5", "Jet Fuel", "70.00", "920.30", "Tons", "64421.00", "+0.00"},
                {"6", "Diesel", "150.00", "680.65", "Tons", "102097.50", "+0.00"},
                {"7", "Fuel Oil", "320.00", "480.25", "Barrels", "153680.00", "+0.00"}
            },
            new String [] {
                "ID", "Type", "Quantity", "Price", "Units", "Value", "Change"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Buy Goods");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Sell Goods");
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setText("Quantity :");

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel9.setText("Management");

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Max");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Max");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Add");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Delete");
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton11.setEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel2.setText("Transport ");

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel10.setText("Truck No.1");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setText("Cargo");

        jLabel14.setText("NONE");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel15.setText("Weight");

        jLabel16.setText("0.0");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setText("Value");

        jLabel18.setText("0.0");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel19.setText("Delivery");

        jLabel20.setText("NONE");

        jLabel21.setText("100%");

        jLabel25.setText("0%");

        jProgressBar1.setForeground(new java.awt.Color(51, 153, 255));

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel24.setText("Queue : ");

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jLabel29.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel21)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel15))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel19))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jLabel25)))
                .addGap(22, 22, 22))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable4.setBackground(new java.awt.Color(204, 204, 204));
        jTable4.setFont(new java.awt.Font("Yu Gothic UI", 1, 10)); // NOI18N
        jTable4.setForeground(new java.awt.Color(0, 0, 0));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Queue", "Cargo", "Weight", "Value", "Delivery", "Remark"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setGridColor(new java.awt.Color(0, 0, 0));
        jTable4.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable4.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(268, 268, 268))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Operation Log");

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Log No.", "Type", "Quantity", "Value", "Delivery", "Time", "Remark"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(20);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable2.getColumnModel().getColumn(1).setMinWidth(100);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        jTable6.setBackground(new java.awt.Color(204, 204, 204));
        jTable6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTable6.setForeground(new java.awt.Color(0, 0, 0));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No", "Name", "Cargo", "Volume", "Price/Units", "Value", "Phone Number", "Address", "Payment", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable6.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(jTable6);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel7.setText("Customer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("tab4", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -40, 720, 490));
        jTabbedPane1.getAccessibleContext().setAccessibleName("tab1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String textFieldInput1 = jTextField2.getText();
            Double quantity = Double.parseDouble(textFieldInput1);
            
            if (quantity > 0) {
                int selectedRow = jTable1.getSelectedRow(); 
            
                if (selectedRow != -1) {
                    String goods = (String) jTable1.getValueAt(selectedRow, 1);

                    String string_price = (String) jTable1.getValueAt(selectedRow, 3);
                    Double price = Double.parseDouble(string_price);

                    Double double_value = quantity * price;
                    String format_value = String.format("%.2f", double_value);
                    Double value = Double.parseDouble(format_value);
                    
                    int result = JOptionPane.showConfirmDialog(null, "Goods : " + goods + "\nPrice/Unit : " + price + " $\nValue : " + value + " $\n\nDo you want to buy it?", "Buy Goods", JOptionPane.YES_NO_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                        if (balance >= value) {
                            if (!isFull(front_transport_queue, rear_transport_queue)) {
                                enQueue_Transport(goods, quantity, value, "Werehouse", "");
                                jTextField2.setText("");
                                balance -= value;
                                jLabel5.setText(String.format("%,.2f", balance));
                                JOptionPane.showMessageDialog(this, "Added " + goods + " to transport queue.", "Buy Goods", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(this, "Transport Queue is Full!", "Transport Queue", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Not enough money.", "Buy Goods", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                } else {
                    JOptionPane.showMessageDialog(this, "Please select goods.", "Werehouse Table", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a value more than 0.", "Quantity Input", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Quantity Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String textFieldInput1 = jTextField2.getText();
            Double quantity = Double.parseDouble(textFieldInput1);
            
            if (quantity > 0) {
                int selectedRow = jTable1.getSelectedRow(); 
            
                if (selectedRow != -1) {
                    String goods = (String) jTable1.getValueAt(selectedRow, 1);
                    
                    String string_quantity = (String) jTable1.getValueAt(selectedRow, 2);
                    Double goods_quantity = Double.parseDouble(string_quantity);
                    
                    String string_price = (String) jTable1.getValueAt(selectedRow, 3);
                    Double price = Double.parseDouble(string_price);

                    Double double_value = quantity * price;
                    String format_value = String.format("%.2f", double_value);
                    Double value = Double.parseDouble(format_value);
                    
                    int result = JOptionPane.showConfirmDialog(null, "Goods : " + goods + "\nPrice/Unit : " + price + " $\nValue : " + value + " $\n\nDo you want to sell it?", "Sell Goods", JOptionPane.YES_NO_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                        if (quantity <= goods_quantity) {
                            if (!isFull(front_transport_queue, rear_transport_queue)) {
                                enQueue_Transport(goods, quantity, value, "Market", "");
                                jTextField2.setText("");
                                updateTableWerehouse(goods_quantity - quantity, selectedRow, 2);
                                JOptionPane.showMessageDialog(this, "Added " + goods + " to transport queue.", "Sell Goods", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(this, "Transport Queue is Full!", "Transport Queue", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Not enought cargo.", "Werehouse Table", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                } else {
                    JOptionPane.showMessageDialog(this, "Please select goods.", "Werehouse Table", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a value more than 0.", "Quantity Input", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Quantity Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int selectedRow = jTable1.getSelectedRow(); 
        
        if (selectedRow != -1) {
            String string_price = (String) jTable1.getValueAt(selectedRow, 3);
            Double price = Double.parseDouble(string_price);
        
            double value = Math.floor(balance / price);
            
            if (value > 0) {
                jTextField2.setText(String.format("%.2f", value));
            } else {
                JOptionPane.showMessageDialog(this, "Not enough money.", "Werehouse Table", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select goods.", "Werehouse Table", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int selectedRow = jTable1.getSelectedRow(); 
        
        if (selectedRow != -1) {
            String string_quantity = (String) jTable1.getValueAt(selectedRow, 2);
        
            jTextField2.setText(string_quantity);
        } else {
            JOptionPane.showMessageDialog(this, "Please select goods.", "Werehouse Table", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        JTextField type = new JTextField(10);  
        JTextField price = new JTextField(10);  
        JTextField unit = new JTextField(10);  

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter Type:"));
        panel.add(type);
        panel.add(new JLabel("Enter Price:"));
        panel.add(price);
        panel.add(new JLabel("Enter Unit:"));
        panel.add(unit);

        int result = JOptionPane.showConfirmDialog(null, panel, "Add Type To Werehouse", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION) {
            try {
                String string_price = price.getText();
                Double table_price = Double.parseDouble(string_price);
                
                String table_type = type.getText();
                String table_unit = unit.getText();
                
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        
                Object[] log = {model.getRowCount() + 1, table_type, "0.00", string_price, table_unit, "0.00", "+0.00"};
        
                model.addRow(log);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Price Input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int selectedRow = jTable1.getSelectedRow(); 
        
        String string_quantity = (String) jTable1.getValueAt(selectedRow, 2);
        Double quantity = Double.parseDouble(string_quantity);
        
        if (quantity > 0) {
            int result = JOptionPane.showConfirmDialog(null, "This row have quantity\n\nDo you want remove this row?", "Werehouse", JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.OK_OPTION) {
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
                
                model.removeRow(selectedRow);
                
                for (int i = selectedRow ; i < model.getRowCount() ; i++) {
                    jTable1.setValueAt(i + 1, i, 0);
                }
            }
        } else {
            int result = JOptionPane.showConfirmDialog(null, "Do you want remove this row?", "Werehouse", JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.OK_OPTION) {
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
                
                model.removeRow(selectedRow);
                
                for (int i = selectedRow ; i < model.getRowCount() ; i++) {
                    jTable1.setValueAt(i + 1, i, 0);
                }
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void whenSelectTableWerehouse() {
        jTable1.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = jTable1.getSelectedRow(); 
                    
                    if (selectedRow != -1) {
                        jButton6.setEnabled(true);
                        jButton8.setEnabled(true);
                        jButton11.setEnabled(true);
                        
                        String string_quantity = (String) jTable1.getValueAt(selectedRow, 2);
                        Double quantity = Double.parseDouble(string_quantity);
                        
                        if (quantity > 0) {
                            jButton7.setEnabled(true);
                            jButton9.setEnabled(true);
                        } else {
                            jButton7.setEnabled(false);
                            jButton9.setEnabled(false);
                        }
                    } else {
                        jButton6.setEnabled(false);
                        jButton11.setEnabled(false);
                    } 
                }
            }
        });
    }
    
    private void whenDoubleClickTableCustomer() {
        jTable6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { 
                    int row = jTable6.rowAtPoint(e.getPoint());

                    if (row >= 0) { 
                        String cargo = (String) jTable6.getValueAt(row, 2);
                    
                        int row_product = findRowIndex(jTable1, cargo, 1);

                        String string_quantity = (String) jTable1.getValueAt(row_product, 2);
                        Double quantity = Double.parseDouble(string_quantity);

                        Object string_volume = jTable6.getValueAt(row, 3);
                        Double volume = Double.valueOf((Integer) string_volume);
                        
                        if (!(jTable6.getValueAt(row, 9).equals("Complete"))) {
                            if (jTable6.getValueAt(row, 9).equals("Pending")) {
                                String unit = (String) jTable1.getValueAt(row_product, 4);
                                String price_customer = (String) jTable6.getValueAt(row, 4);

                                String price = (String) jTable1.getValueAt(row_product, 3);

                                String string_value = String.format("%.2f", Double.parseDouble((String) jTable6.getValueAt(row, 5)));
                                Double value_customer = Double.parseDouble(string_value);

                                String string_value_customer = String.format("%.2f", volume * Double.parseDouble(price));
                                Double value_werehouse = Double.parseDouble(string_value_customer);

                                String format_profit = String.format("%.2f", value_customer - value_werehouse);
                                Double profit = Double.parseDouble(format_profit);

                                int result = JOptionPane.showConfirmDialog(null, "                Customer Order : " + jTable6.getValueAt(row, 0) + 
                                                                                     "\n\n------------------ Customer ------------------\nName : " + jTable6.getValueAt(row, 1) + 
                                                                                     " \nCargo : " + jTable6.getValueAt(row, 2) + 
                                                                                     "\nVolume : "+ string_volume + " " + unit +
                                                                                     "\nPrice/Unit : " + price_customer + " $" +
                                                                                     "\nValue : " + String.format("%,.2f", value_customer) + " $" +
                                                                                     "\nPhone Number : " + jTable6.getValueAt(row, 6) +
                                                                                     "\nAddress : " + jTable6.getValueAt(row, 7) +
                                                                                     "\nPayments : " + jTable6.getValueAt(row, 8) +
                                                                                     "\n--------------- Werehouse -------------------\nQuantity : " + quantity + " "+ unit +
                                                                                     "\nMarket Price/Unit : " + price + " $" +
                                                                                     "\nMarket Value : " + String.format("%,.2f", value_werehouse) + " $" +
                                                                                     "\n----------------------------------------------------" +
                                                                                     "\nChange : " + (String.format("%.2f", Double.parseDouble(price_customer) - Double.parseDouble(price))) + " per unit" +
                                                                                     "\nProfit : " + String.format("%,.2f", profit) + " $" +
                                                                                     "\n\nDo you want to sell it?", 
                                                                                     "Customer Order", JOptionPane.YES_NO_OPTION);

                                if (result == JOptionPane.YES_OPTION) {
                                    if (quantity >= volume) {
                                        if (jTable6.getValueAt(row, 8).equals("Bank Transfer")) {
                                            balance += value_customer;
                                            jLabel5.setText(String.format("%,.2f", balance));
                                        }

                                        enQueue_Transport(cargo, volume, value_customer, (String) jTable6.getValueAt(row, 7), (String) jTable6.getValueAt(row, 8));
                                        updateTableWerehouse(quantity - volume, row_product, 2);
                                        JOptionPane.showMessageDialog(null, "Added " + cargo + " to transport queue.", "Customer Order", JOptionPane.INFORMATION_MESSAGE);
                                        jTable6.setValueAt("In Transit", row, 9);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Not enought products.", "Customer", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "This order are in transit.", "Customer", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "This order completed.", "Customer", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                }
            }
        });
    }


    public void transport(int row) {
        if (truck) {
            truck = false;
            
            String queue = (String) jTable4.getValueAt(row, 0);
            String cargo = (String) jTable4.getValueAt(row, 1);
            String String_weight = (String) jTable4.getValueAt(row, 2);
            Double weight = Double.parseDouble(String_weight);
            String value = (String) jTable4.getValueAt(row, 3);
            String delivery = (String) jTable4.getValueAt(row, 4);
            String remark = (String) jTable4.getValueAt(row, 5);
            
            jPanel8.setBackground(Color.red);
            jLabel29.setText(queue);
            jLabel14.setText(cargo);
            jLabel16.setText(String_weight);
            jLabel18.setText(value);
            jLabel20.setText(delivery);
             
            SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
                @Override
                protected Void doInBackground() throws Exception {
                    for (int i = 0; i <= weight; i++) {
                        Thread.sleep(70); 
                        int progress = (int) ((i / (double) weight) * 100);
                        publish(progress); 
                    }
                    return null;
                }

                @Override
                protected void process(java.util.List<Integer> chunks) {
                    for (int progress : chunks) {
                        jProgressBar1.setValue(progress);
                    }
                }
                
                @Override
                protected void done() {
                    jProgressBar1.setValue(0);
                    truck = true;
                    jPanel8.setBackground(new Color(51, 153, 255));
                    jLabel14.setText("NONE");
                    jLabel16.setText("0.0");
                    jLabel18.setText("0.0");
                    jLabel20.setText("NONE");
                    jLabel29.setText("0");
                    
                    int index_old_value = findRowIndex(jTable1, cargo, 1);
                    String String_old_value = (String) jTable1.getValueAt(index_old_value, 2);
                    Double old_value = Double.parseDouble(String_old_value);
                    
                    if (delivery.equals("Werehouse")) {
                        deQueue_Transport();
                        updateTableWerehouse(old_value + weight, index_old_value, 2);
                        addLog(cargo, Double.toString(weight), value, "Werehouse", remark);
                    } else if (delivery.equals("Market")) {
                        deQueue_Transport();
                        balance += Double.parseDouble(value);
                        jLabel5.setText(String.format("%,.2f", balance));
                        addLog(cargo, Double.toString(weight), value, "Market", remark);
                    }
                    
                    if (remark.equals("Cash on Delivery") || remark.equals("Bank Transfer")) {
                        int row_product = findRowIndex(jTable6, value, 5);
                        
                        if (remark.equals("Cash on Delivery")) {
                            balance += Double.parseDouble(value);
                            jLabel5.setText(String.format("%,.2f", balance));
                        }
                        
                        deQueue_Transport();
                        jTable6.setValueAt("Complete", row_product, 9);
                        addLog(cargo, Double.toString(weight), value, delivery, remark);
                    }
                }
            };

            worker.execute();
        }
    }
    
    public boolean isEmpty(int front) {
        return (front == -1);
    }

    public boolean isFull(int front, int rear) {
        return ((rear + 1) % SIZE == front);
    }
    
    public void enQueue_Transport(String cargo, double weight, double value, String delivery, String remark) {
        if (!isFull(front_transport_queue, rear_transport_queue)) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable4.getModel();
            
            if (front_transport_queue == -1) {
                front_transport_queue = 0;
            }
            
            rear_transport_queue = (rear_transport_queue + 1) % SIZE;
       
            model.setValueAt(Integer.toString(++transport_queue), rear_transport_queue, 0);
            model.setValueAt(cargo, rear_transport_queue, 1);
            model.setValueAt(String.format("%.2f", weight), rear_transport_queue, 2);
            model.setValueAt(String.format("%.2f", value), rear_transport_queue, 3);
            model.setValueAt(delivery, rear_transport_queue, 4);
            model.setValueAt(remark, rear_transport_queue, 5);
            
            if (activate_transport) {
                queue_to_transport();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Transport Queue is Full!", "Transport Queue", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void queue_to_transport() {
        activate_transport = false;

        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                while (front_transport_queue != -1) {
                    transport(front_transport_queue);
                    
                    Thread.sleep(500);
                }
                return null; 
            }

            @Override
            protected void done() {
                activate_transport = true; 
            }
        };

        worker.execute(); 
    }

    public void deQueue_Transport() {
        if (!isEmpty(front_transport_queue)) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable4.getModel();

            model.setValueAt("", front_transport_queue, 0);
            model.setValueAt("", front_transport_queue, 1);
            model.setValueAt("", front_transport_queue, 2);
            model.setValueAt("", front_transport_queue, 3);
            model.setValueAt("", front_transport_queue, 4);
            model.setValueAt("", front_transport_queue, 5);
            
            if (front_transport_queue == rear_transport_queue) {
                front_transport_queue = rear_transport_queue = -1; 
                transport_queue = 0;
            } else {
                front_transport_queue = (front_transport_queue + 1) % SIZE; 
            }
        }
    }
    
    public void updateTableWerehouse(double value, int row, int column) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
       
        model.setValueAt(String.format("%.2f", value), row, column);
        
        String String_price = (String) model.getValueAt(row, 3);
        Double price = Double.parseDouble(String_price);
        
        model.setValueAt(String.format("%,.2f%n", value * price), row, 5);
    }
    
    public void addLog(String type, String quantity, String value, String delivery, String remark) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable2.getModel();
        
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        Object[] log = {++logNo, type, quantity, value, delivery, formattedTime, remark};
        
        model.addRow(log);
    }
    
    public int findRowIndex(JTable table, String searchValue, int columnIndex) {
        for (int row = 0; row < table.getRowCount(); row++) {
            Object valueAt = table.getValueAt(row, columnIndex);
            if (searchValue.equals(valueAt)) {
                return row; 
            }
        }
        return -1; 
    }
    
    private void auto_customer_order() {
        String[] names = {"John Smith", "Jane Doe", "Michael Johnson", "Emily Davis", 
                          "David Wilson", "Sophia Brown", "Chris Taylor", "Olivia Harris", 
                          "James White", "Emma Lee"};
        
        String[] addresses = {"123 Main St, New York, NY", "456 Maple Ave, Los Angeles, CA", 
                              "789 Oak Dr, Chicago, IL", "101 Pine Ln, Houston, TX", 
                              "202 Cedar Rd, Phoenix, AZ", "303 Birch St, Philadelphia, PA", 
                              "404 Elm St, San Antonio, TX", "505 Willow Ln, Dallas, TX", 
                              "606 Aspen Dr, San Diego, CA", "707 Redwood Ave, Austin, TX"};
        
        String[] phones = {"(517) 654-1234", "(804) 237-5678", 
                              "(629) 391-4823", "(702) 148-9056", 
                              "(458) 759-2641", "(345) 876-1923", 
                              "(902) 546-1237", "(301) 238-9801", 
                              "(679) 763-4509", "(214) 927-5746"};
        
        String[] payment = {"Bank Transfer", "Cash on Delivery"};
        
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            private boolean keepRunning = true;  
            int order = 0;

            @Override
            protected Void doInBackground() throws Exception {
                while (keepRunning) {  
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable6.getModel();
                    javax.swing.table.DefaultTableModel model1 = (javax.swing.table.DefaultTableModel) jTable1.getModel();
                    
                    int random_time = random.nextInt(10);
                    int random_index = random.nextInt(10);
                    int random_payment = random.nextInt(2);
                    int random_cargo = random.nextInt(model1.getRowCount());
                    int random_volume = random.nextInt(500) + 20;
                    
                    String string_price = (String) jTable1.getValueAt(random_cargo, 3);
                    Double random_value = random.nextDouble(20)+15;
                    String format_value = String.format("%.2f", random_value);
                    Double price = Double.parseDouble(string_price) + Double.parseDouble(format_value);
                    String format_price = String.format("%.2f", price);
        
                    Object[] log = {++order, names[random_index], jTable1.getValueAt(random_cargo, 1), random_volume, format_price, String.format("%.2f", random_volume * Double.parseDouble(format_price)), phones[random_index], addresses[random_index], payment[random_payment], "Pending"};

                    model.addRow(log);
                    
                    Thread.sleep(times[random_time]+30000);  
                }
                return null; 
            }
        };

        worker.execute();
    }
    
    private void auto_control_value() {
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            private boolean keepRunning = true;  

            @Override
            protected Void doInBackground() throws Exception {
                while (keepRunning) {  
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
                    
                    int random_time = random.nextInt(10);
                    int random_total = random.nextInt(6);
                    
                    for (int i = 0 ; i <= random_total ; i++) {
                        int random_index_row = random.nextInt(model.getRowCount());
                        int random_type = random.nextInt(2);
                        
                        Double random_value = random.nextDouble(20);
                        String format_value = String.format("%.2f", random_value);
                        Double value = Double.parseDouble(format_value);
                        
                        String string_quantity = (String) jTable1.getValueAt(random_index_row, 2);
                        Double quantity = Double.parseDouble(string_quantity);
                        
                        String string_old_value = (String) jTable1.getValueAt(random_index_row, 3);
                        Double old_value = Double.parseDouble(string_old_value);
                        
                        if (random_type == 0) {
                            jTable1.setValueAt(String.format("%.2f", old_value + value), random_index_row, 3);
                            jTable1.setValueAt(String.format("%.2f", (old_value + value) * quantity), random_index_row, 5);
                            jTable1.setValueAt("+" + Double.toString(value), random_index_row, 6);
                            
                        } else {
                            if (old_value - value > 0) {
                                jTable1.setValueAt(String.format("%.2f", old_value - value), random_index_row, 3);
                                jTable1.setValueAt(String.format("%.2f", (old_value - value) * quantity), random_index_row, 5);
                                jTable1.setValueAt("-" + Double.toString(value), random_index_row, 6);
                            }
                        }
                    }
                    
                    Thread.sleep(times[random_time]);  
                }
                return null; 
            }
        };

        worker.execute();
    }
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfaceUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
