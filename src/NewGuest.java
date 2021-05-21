
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

public class NewGuest extends javax.swing.JFrame {

    /**
     * Creates new form NewGuest
     */
    String dateCheckIn;
    String dateCheckOut;
    
    public NewGuest() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void getVacantRooms(String type)
    {
        try 
        {
            combo1.removeAllItems();
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT RoomNo FROM rooms WHERE Type = '"+type+"' EXCEPT SELECT RoomNo FROM guest WHERE '"+dateCheckIn+"' BETWEEN CheckInDate AND CheckOutDate OR '"+dateCheckOut+"' BETWEEN CheckInDate AND CheckOutDate AND Type = '"+type+"'");            
            if (!resultSet.isBeforeFirst()) 
            {
                combo1.addItem("No Vacant Room For Selected Date");
            }
            else
            {
                while (resultSet.next()) 
                {
                    combo1.addItem(resultSet.getString("roomno"));
                }
            }
            conn.close();
        } 
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to Connect to Database", "Error Connection", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        defaultRadioButton = new javax.swing.JRadioButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        radioButtonSilver = new javax.swing.JRadioButton();
        radioButtonPlatinum = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        radioButtonGold = new javax.swing.JRadioButton();
        bookNewRoom = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        checkInDate = new com.toedter.calendar.JDateChooser();
        checkOutDate = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showRoomButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        buttonGroup1.add(defaultRadioButton);
        defaultRadioButton.setText("Deafult");
        defaultRadioButton.setEnabled(false);
        defaultRadioButton.setOpaque(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2500, 2500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(150, 201, 61));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 176, 155));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new Color(0.02f, 0.39f, 0.4f, 0.6f));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Room No");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 170, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 730, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name");
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 110, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        jPanel15.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 740, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone Number");
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 140, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 730, 40));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        jPanel15.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 80, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Room");
        jPanel15.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 270, -1));

        radioButtonSilver.setBackground(new Color(0.02f, 0.39f, 0.4f, 0.0f));
        buttonGroup1.add(radioButtonSilver);
        radioButtonSilver.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        radioButtonSilver.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonSilver.setText("Silver Class");
        radioButtonSilver.setBorder(null);
        radioButtonSilver.setEnabled(false);
        radioButtonSilver.setOpaque(false);
        radioButtonSilver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonSilverActionPerformed(evt);
            }
        });
        jPanel15.add(radioButtonSilver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        radioButtonPlatinum.setBackground(new Color(0.02f, 0.39f, 0.4f, 0.0f));
        buttonGroup1.add(radioButtonPlatinum);
        radioButtonPlatinum.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        radioButtonPlatinum.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonPlatinum.setText("Platinum Class");
        radioButtonPlatinum.setBorder(null);
        radioButtonPlatinum.setEnabled(false);
        radioButtonPlatinum.setOpaque(false);
        radioButtonPlatinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPlatinumActionPerformed(evt);
            }
        });
        jPanel15.add(radioButtonPlatinum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("No. Of Guest");
        jPanel15.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 230, -1));

        radioButtonGold.setBackground(new Color(0.02f, 0.39f, 0.4f, 0.0f));
        buttonGroup1.add(radioButtonGold);
        radioButtonGold.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        radioButtonGold.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonGold.setText("Gold Class");
        radioButtonGold.setBorder(null);
        radioButtonGold.setEnabled(false);
        radioButtonGold.setOpaque(false);
        radioButtonGold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonGoldActionPerformed(evt);
            }
        });
        jPanel15.add(radioButtonGold, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        bookNewRoom.setBackground(new java.awt.Color(0, 176, 155));
        bookNewRoom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bookNewRoom.setForeground(new java.awt.Color(255, 255, 255));
        bookNewRoom.setText("Book Room");
        bookNewRoom.setBorder(null);
        bookNewRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNewRoomActionPerformed(evt);
            }
        });
        jPanel15.add(bookNewRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, 230, 50));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, 50));

        combo1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        combo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(150, 201, 61)));
        combo1.setOpaque(false);
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel15.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 650, 40));

        kGradientPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 120, 850, 760));

        jPanel2.setBackground(new Color(0.02f, 0.39f, 0.4f, 0.6f));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkInDate.setDateFormatString("yyyy-MM-dd");
        checkInDate.setVerifyInputWhenFocusTarget(false);
        checkInDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                checkInDateFocusLost(evt);
            }
        });
        checkInDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkInDateMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkInDateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkInDateMousePressed(evt);
            }
        });
        jPanel2.add(checkInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 40));

        checkOutDate.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(checkOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 230, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Check In");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Check Out");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 200, -1));

        showRoomButton.setBackground(new java.awt.Color(0, 176, 155));
        showRoomButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showRoomButton.setForeground(new java.awt.Color(255, 255, 255));
        showRoomButton.setText("Show Rooms");
        showRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRoomButtonActionPerformed(evt);
            }
        });
        jPanel2.add(showRoomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 250, 40));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 560, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guests.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 2030, 1010));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 2280, 1310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Welcome2 obj = new Welcome2();
        this.dispose();
        obj.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void updatestatus(String RoomNo ,String Type) {
        try 
        {
            Class.forName("java.sql.DriverManager");
            com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement) con.createStatement();
            String query = "UPDATE "+Type+" SET status='FULL' WHERE roomno ="+ RoomNo +";";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Updated");
        } 
        catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public Date getCheckInDate()
    {
        SimpleDateFormat a1 = new SimpleDateFormat("yyyy-MM-dd");
        String firstDate = a1.format(checkInDate.getDate());
        String secondDate = a1.format(checkOutDate.getDate());
        Date fromDate = checkInDate.getDate();
        Date toDate = checkOutDate.getDate();
        return fromDate;
    }
    
    private void bookNewRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNewRoomActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
            Statement stmt = con.createStatement();
            String RoomNo = "";
            Object selectedItem = combo1.getSelectedItem();
            if (selectedItem != null) {
                RoomNo = selectedItem.toString();
            }
            String Name = jTextField2.getText();
            String NoOfP = jTextField6.getText();
            String NoOfDays;
            String PhnNo = jTextField3.getText();
            String Roomtype = jTextField1.getText();
//            SimpleDateFormat a1 = new SimpleDateFormat("yyyy-MM-dd");
//            String firstDate = a1.format(checkInDate.getDate());
//            String secondDate = a1.format(checkOutDate.getDate());
            Date fromDate = checkInDate.getDate();
            Date toDate = checkOutDate.getDate();
            long diffInMillies = Math.abs(toDate.getTime() - fromDate.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            NoOfDays = String.valueOf(diff);
            //RoomNo=Roomtype+RoomNo;      

            String type = " ";
            if (radioButtonGold.isSelected()) {
                type = "GOLD";
            } else if (radioButtonSilver.isSelected()) {
                type = "SILVER";
            } else if (radioButtonPlatinum.isSelected()) {
                type = "PLATINUM";
            }

            if (PhnNo.length() >= 10 && PhnNo.length() <= 11) {
                String query = "INSERT INTO guest (`RoomNo`, `Name`, `Occupants`, `Days`, `Type`, `PhoneNo`, `CheckInDate`, `CheckOutDate`, `BookingDate`) VALUES('" + (RoomNo) + "','" + (Name) + "','" + (NoOfP) + "','" + (NoOfDays) + "','" + (type) + "','" + (PhnNo) + "','" + (dateCheckIn) + "','" + (dateCheckOut) + "',sysdate());";
                stmt.executeUpdate(query);
                //updatestatus(RoomNo,type);
                JOptionPane.showMessageDialog(null, "Guest Inserted");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid number");
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "error");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Connection", JOptionPane.WARNING_MESSAGE);
        }
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");

        jTextField6.setText(" ");

        radioButtonGold.setSelected(false);
        radioButtonSilver.setSelected(false);
        combo1.removeAllItems();

        radioButtonPlatinum.setSelected(false);


    }//GEN-LAST:event_bookNewRoomActionPerformed

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_jTextField2ActionPerformed

    private void radioButtonGoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonGoldActionPerformed
        combo1.removeAllItems();
        if (radioButtonGold.isSelected()) {
            jTextField1.setText("GOLD");
            getVacantRooms("Gold");
        }
    }//GEN-LAST:event_radioButtonGoldActionPerformed

    private void radioButtonSilverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonSilverActionPerformed
        combo1.removeAllItems();
        if (radioButtonSilver.isSelected()) {
            jTextField1.setText("SLVR");
            getVacantRooms("Silver");
        } 
    }//GEN-LAST:event_radioButtonSilverActionPerformed

    private void radioButtonPlatinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonPlatinumActionPerformed
        combo1.removeAllItems();
        if (radioButtonPlatinum.isSelected()) {
            jTextField1.setText("PLAT");
            getVacantRooms("Platinum");
        }
    }//GEN-LAST:event_radioButtonPlatinumActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void checkInDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkInDateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInDateMouseExited

    private void checkInDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checkInDateFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInDateFocusLost

    private void checkInDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkInDateMousePressed
// TODO add your handling code here:
    }//GEN-LAST:event_checkInDateMousePressed

    private void checkInDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkInDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInDateMouseClicked

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void showRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRoomButtonActionPerformed
        // TODO add your handling code here:
        radioButtonSilver.setEnabled(false);
        radioButtonGold.setEnabled(false);
        radioButtonPlatinum.setEnabled(false);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date checkIn =  this.checkInDate.getDate();
        Date checkOut =  this.checkOutDate.getDate();
        Date today = new Date();
        System.out.println(today+" "+checkIn);
        System.out.println(checkIn.compareTo(today));
        dateCheckIn = dateFormat.format(this.checkInDate.getDate());
        dateCheckOut = dateFormat.format(this.checkOutDate.getDate());
        String dateToday = dateFormat.format(today);
        //Date date = checkInDate.getDate();
        if(dateCheckOut.compareTo(dateCheckIn) > 0)
        {
            if(dateCheckIn.compareTo(dateToday) >= 0)
            {
                System.out.println(checkIn+" "+checkOut);
                defaultRadioButton.setSelected(true);
                jTextField1.setText("");
                combo1.removeAllItems();
                radioButtonSilver.setEnabled(true);
                radioButtonGold.setEnabled(true);
                radioButtonPlatinum.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid CheckIn Date");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Check Out Date Must Be After Check In Date");
        }
    }//GEN-LAST:event_showRoomButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewGuest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookNewRoom;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser checkInDate;
    private com.toedter.calendar.JDateChooser checkOutDate;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JRadioButton defaultRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton radioButtonGold;
    private javax.swing.JRadioButton radioButtonPlatinum;
    private javax.swing.JRadioButton radioButtonSilver;
    private javax.swing.JButton showRoomButton;
    // End of variables declaration//GEN-END:variables
}
