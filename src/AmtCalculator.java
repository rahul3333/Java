
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AmtCalculator extends javax.swing.JFrame {
    public AmtCalculator() {

        initComponents();
        tf1.setVisible(false);
        tf2.setVisible(false);
        tf3.setVisible(false);
        tf4.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        jButton5.setVisible(false);
        ta1.setVisible(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void getGuestList()
    {
        combo1.removeAllItems();
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = con.createStatement();
            ResultSet r = stmt.executeQuery("select * from guest");
            while (r.next()) {
                combo1.addItem(r.getString("RoomNO"));
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
        tf4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<>();
        showBill = new javax.swing.JButton();
        tf3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(150, 201, 61));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 176, 155));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ta1.setForeground(new java.awt.Color(255, 0, 0));
        ta1.setRows(5);
        ta1.setText("\n");
        ta1.setToolTipText("");
        ta1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(150, 201, 61)));
        jScrollPane1.setViewportView(ta1);

        jPanel15.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 450, 140));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 176, 155));
        jLabel4.setText("Room Number");
        jPanel15.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 30));

        tf1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf1.setForeground(new java.awt.Color(255, 0, 0));
        tf1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        jPanel15.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 580, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 176, 155));
        jLabel2.setText("Name");
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        tf2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf2.setForeground(new java.awt.Color(255, 0, 0));
        tf2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        jPanel15.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 580, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 176, 155));
        jLabel3.setText("No. Of Days");
        jPanel15.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 176, 155));
        jLabel1.setText("Roomtype");
        jPanel15.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        tf4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf4.setForeground(new java.awt.Color(255, 0, 0));
        tf4.setText("0");
        tf4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        tf4.setFocusCycleRoot(true);
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        jPanel15.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 580, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 176, 155));
        jLabel5.setText("Restaurant Bill");
        jPanel15.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, -1));

        jButton2.setBackground(new java.awt.Color(0, 176, 155));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GET DETAILS");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 240, 50));

        jButton3.setBackground(new java.awt.Color(0, 176, 155));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 150, 50));

        combo1.setBackground(new java.awt.Color(0, 176, 155));
        combo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo1.setForeground(new java.awt.Color(255, 0, 0));
        combo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
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
        jPanel15.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, -1));

        showBill.setBackground(new java.awt.Color(0, 176, 155));
        showBill.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        showBill.setForeground(new java.awt.Color(255, 255, 255));
        showBill.setText("SHOW BILL");
        showBill.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        showBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBillActionPerformed(evt);
            }
        });
        jPanel15.add(showBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 170, 50));

        tf3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf3.setForeground(new java.awt.Color(255, 0, 0));
        tf3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        jPanel15.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 580, 40));

        jButton5.setBackground(new java.awt.Color(0, 176, 155));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("DONE");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 670, 150, 50));

        kGradientPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 920, 770));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2310, 1120));

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

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed
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
                tf4.setText(" " + resbill);

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    String roomno, type, name, NumberofDays, phnno, fromdate, todate, bookedon, NoofP;
    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        String a = (String) combo1.getSelectedItem();
        try {
            Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "Select * from guest where RoomNO='" + a + "';";

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                name = rs.getString("Name");
                NumberofDays = rs.getString("NumberofDays");
                type = rs.getString("type");
                roomno = rs.getString("RoomNO");
                phnno = rs.getString("PhoneNO");
                fromdate = rs.getString("fromdate");
                todate = rs.getString("todate");
                bookedon = rs.getString("bookedon");
                NoofP = rs.getString("NoofP");
                tf1.setText(" " + name);

                tf2.setText(" " + NumberofDays);

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
        tf4.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel5.setVisible(true);

    }//GEN-LAST:event_combo1ActionPerformed

    private void combo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo1MouseClicked

    }//GEN-LAST:event_combo1MouseClicked

    private void combo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo1MouseEntered

    }//GEN-LAST:event_combo1MouseEntered
    double total = 0, finaltotal = 0;
    private void showBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBillActionPerformed
        jButton5.setVisible(true);
        ta1.setVisible(true);
        double day, res;
        day = Double.parseDouble(tf2.getText());
        res = Double.parseDouble(tf4.getText());
        String name = tf1.getText();
        String type = tf3.getText();
        if (type.equals("SILVER")) {
            total = 2000 * day;
        } else if (type.equals("GOLD")) {
            total = 3500 * day;
        } else if (type.equals("PLATINUM")) {
            total = 5000 * day;
        }

        finaltotal = total + res;

        ta1.setText("Mr/Mrs " + name + " Your Bill is \n" + finaltotal);

    }//GEN-LAST:event_showBillActionPerformed

    private void combo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo1MouseExited

    }//GEN-LAST:event_combo1MouseExited
    void deleterecordofguest_res() {
        String n = (String) combo1.getSelectedItem();
        String m = tf2.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "Delete from guest  where RoomNO = '" + n + "';";
            stmt.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void changestatus() {
        String Type = tf3.getText();
        String RoomNo = (String) combo1.getSelectedItem();
        try 
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "UPDATE " +Type+ " set status = 'EMPTY' WHERE roomno = "+RoomNo+";";
            stmt.executeUpdate(query);
            } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
        
//        if(Type.equals("GOLD"))
//        {}
//        else if(Type.equals("Silver"))
//        {}
//        else if(Type.equals("PLATINUM"))
//        {}
//        
//        if (t.equals("GOLD")) {
//            try {
//                Class.forName("java.sql.DriverManager");
//                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
//                Statement stmt = (Statement) con.createStatement();
//                String query = "update gold set roomno =LEFT(roomno,2) where roomno like '%" + c + "%';";
//
//                stmt.executeUpdate(query);
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, e.getMessage());
//            }
////for checkout query will be "update gold set roomno =LEFT(roomno,2) where roomno='"+RoomNo+"';";
//        }
//        if (t.equals("SILVER")) {
//            try {
//                Class.forName("java.sql.DriverManager");
//                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/projectwork", "root", "1234");
//                Statement stmt = (Statement) con.createStatement();
//                String query = "update silver set roomno =LEFT(roomno,2) where roomno like '%" + c + "%';";
//
//                stmt.executeUpdate(query);
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, e.getMessage());
//            }
//        }
//        if (t.equals("PLATINUM")) {
//
//            try {
//                Class.forName("java.sql.DriverManager");
//                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/projectwork", "root", "1234");
//                Statement stmt = (Statement) con.createStatement();
//                String query = "update platinum set roomno =LEFT(roomno,2) where roomno like '%" + c + "%';";
//
//                stmt.executeUpdate(query);
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, e.getMessage());
//            }
//        }

    }


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projectwork", "root", "1234");
            Statement stmt = con.createStatement();
            String query = "insert into bill values('" + roomno + "','" + name + "','" + NoofP + "','" + NumberofDays + "','" + type + "','" + phnno + "','" + fromdate + "','" + todate + "','" + resbill + "','" + total + "','" + finaltotal + "');";
            stmt.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Thanks ' RECORD ADDED'");

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        changestatus();
        deleterecordofguest_res();
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("0");
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
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
