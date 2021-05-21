
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AmtCalculator extends javax.swing.JFrame {
    String roomNo, type, name, days, phoneNo, checkInDate, checkOutDate, bookingDate, occupants;
    double roomTotal = 0, finalTotal = 0, gst=0;
    SimpleDateFormat a1 = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    String today = a1.format(date);
    
    public AmtCalculator() {
        initComponents();
        tf1.setVisible(false);
        tf2.setVisible(false);
        tf3.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jButton5.setVisible(false);
        ta1.setVisible(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    void getGuestList()
    {
        combo1.removeAllItems();
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = con.createStatement();
            ResultSet r = stmt.executeQuery("SELECT * FROM guest WHERE '"+today+"' BETWEEN CheckInDate AND CheckOutDate AND CheckedOut = 0");
            while (r.next()) {
                combo1.addItem(r.getString("RoomNO")+"("+r.getString("Type")+" )- "+r.getString("Name"));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            JOptionPane.showMessageDialog(null, "Failed to Connect to Database", "Error ", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<>();
        showBill = new javax.swing.JButton();
        tf3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1800, 1100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(150, 201, 61));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 176, 155));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new Color(0.30f, 0.18f, 0.10f, 1.0f));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta1.setBackground(new java.awt.Color(189, 160, 100));
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ta1.setForeground(new java.awt.Color(255, 255, 255));
        ta1.setRows(5);
        ta1.setText("\n");
        ta1.setToolTipText("");
        ta1.setBorder(null);
        jScrollPane1.setViewportView(ta1);

        jPanel15.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 450, 140));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Number");
        jPanel15.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 250, 30));

        tf1.setBackground(new java.awt.Color(189, 160, 100));
        tf1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf1.setForeground(new java.awt.Color(255, 255, 255));
        tf1.setBorder(null);
        jPanel15.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 620, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, -1));

        tf2.setBackground(new java.awt.Color(189, 160, 100));
        tf2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf2.setForeground(new java.awt.Color(255, 255, 255));
        tf2.setBorder(null);
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        jPanel15.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 620, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. Of Days");
        jPanel15.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Roomtype");
        jPanel15.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jButton2.setBackground(new java.awt.Color(189, 160, 100));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GET DETAILS");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 620, 50));

        jButton3.setBackground(new java.awt.Color(189, 160, 100));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 270, 50));

        combo1.setBackground(new java.awt.Color(189, 160, 100));
        combo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        combo1.setForeground(new java.awt.Color(255, 255, 255));
        combo1.setBorder(null);
        combo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                combo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                combo1MouseExited(evt);
            }
        });
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel15.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 620, -1));

        showBill.setBackground(new java.awt.Color(189, 160, 100));
        showBill.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showBill.setForeground(new java.awt.Color(255, 255, 255));
        showBill.setText("SHOW BILL");
        showBill.setBorder(null);
        showBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBillActionPerformed(evt);
            }
        });
        jPanel15.add(showBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 150, 140));

        tf3.setBackground(new java.awt.Color(189, 160, 100));
        tf3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf3.setForeground(new java.awt.Color(255, 255, 255));
        tf3.setBorder(null);
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        jPanel15.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 620, 40));

        jButton5.setBackground(new java.awt.Color(189, 160, 100));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Checkout");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 320, 50));

        kGradientPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 680, 730));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkout.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2140, 1040));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2140, 1040));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getGuestList();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Welcome2 obj = new Welcome2();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    String resbill = "0";

    void billofRestaurant() {
        String a = (String) combo1.getSelectedItem();
        try {
            Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "Select * from restaurant where roomno='" + a + "';";

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                resbill = rs.getString("resbill");

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        String selectedRoom = (String) combo1.getSelectedItem();
        selectedRoom = selectedRoom.substring(0, 3);
        System.out.println(selectedRoom);
        try {
            Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "Select * from guest where RoomNO='" + selectedRoom + "';";

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                name = rs.getString("Name");
                days = rs.getString("Days");
                type = rs.getString("Type");
                roomNo = rs.getString("RoomNO");
                phoneNo = rs.getString("PhoneNO");
                checkInDate = rs.getString("CheckInDate");
                checkOutDate = rs.getString("CheckOutDate");
                bookingDate = rs.getString("BookingDate");
                occupants = rs.getString("Occupants");
                tf1.setText(" " + name);
                tf2.setText(" " + days);
                tf3.setText("" + type);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);

    }//GEN-LAST:event_combo1ActionPerformed

    private void combo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo1MouseClicked

    }//GEN-LAST:event_combo1MouseClicked

    private void combo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo1MouseEntered

    }//GEN-LAST:event_combo1MouseEntered
    
    private void showBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBillActionPerformed
        jButton5.setVisible(true);
        ta1.setVisible(true);
        double day = Double.parseDouble(days);
        if (type.equals("SILVER")) {
            roomTotal = 2000 * day;
        } else if (type.equals("GOLD")) {
            roomTotal = 3500 * day;
        } else if (type.equals("PLATINUM")) {
            roomTotal = 5000 * day;
        }
        gst = (roomTotal/100)*18;
        finalTotal = roomTotal+gst;

        ta1.setText(
                "Mr/Mrs " + name + "\n" +
                "Room(" +type+ ") * " +days+ " = " +roomTotal+ "\n" +
                "CGST(9%) = " +gst/2+ "\n" +
                "SGST(9%) = " +gst/2+ "\n" +
                "Total = " +finalTotal
        );

    }//GEN-LAST:event_showBillActionPerformed

    private void combo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo1MouseExited

    }//GEN-LAST:event_combo1MouseExited
    
    void updateCheckOutStatus() {
        String n = (String) combo1.getSelectedItem();
        String m = tf2.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "UPDATE guest SET CheckedOut = 1 WHERE RoomNO = '"+roomNo+"' AND CheckInDate ='"+checkInDate+"';";
            stmt.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    void generateBill()
    {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = con.createStatement();
            String query = "INSERT INTO bill VALUES('" + roomNo + "','" + name + "','"  + checkInDate + "','" + checkOutDate + "','" + roomTotal + "','" + gst + "','" + finalTotal + "');";
            stmt.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Thanks ' RECORD ADDED'");

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        generateBill();
        updateCheckOutStatus();
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        combo1.setSelectedIndex(-1);
        ta1.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AmtCalculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton showBill;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
