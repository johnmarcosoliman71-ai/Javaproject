package com.mycompany.javajframeprogram;

import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        GREYPANEL = new javax.swing.JPanel();
        LOGINTEXT = new javax.swing.JLabel();
        USERNAME = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PASSWORDLABEL = new javax.swing.JLabel();
        TEXTFIELD = new javax.swing.JTextField();
        PASSWORD = new javax.swing.JPasswordField();
        LOGINBUTTON = new javax.swing.JButton();
        REGESTERBUTTON = new javax.swing.JButton();
        BLUEPANNEL = new javax.swing.JPanel();
        HOTELROOMTEXT = new javax.swing.JLabel();
        HOTELROOMTEXT1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        GREYPANEL.setBackground(new java.awt.Color(210, 210, 210));

        LOGINTEXT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LOGINTEXT.setText("LOG IN");

        javax.swing.GroupLayout GREYPANELLayout = new javax.swing.GroupLayout(GREYPANEL);
        GREYPANEL.setLayout(GREYPANELLayout);
        GREYPANELLayout.setHorizontalGroup(
            GREYPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GREYPANELLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LOGINTEXT)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        GREYPANELLayout.setVerticalGroup(
            GREYPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GREYPANELLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LOGINTEXT)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        USERNAME.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        USERNAME.setText("USERNAME:");

        PASSWORDLABEL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PASSWORDLABEL.setText("PASSWORD:");

        TEXTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTFIELDActionPerformed(evt);
            }
        });

        LOGINBUTTON.setText("LOG IN");
        LOGINBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINBUTTONActionPerformed(evt);
            }
        });

        REGESTERBUTTON.setText("REGISTER");
        REGESTERBUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGESTERBUTTONMouseClicked(evt);
            }
        });

        BLUEPANNEL.setBackground(new java.awt.Color(124, 135, 255));
        BLUEPANNEL.setLayout(new java.awt.GridBagLayout());

        HOTELROOMTEXT.setBackground(new java.awt.Color(255, 255, 255));
        HOTELROOMTEXT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        HOTELROOMTEXT.setForeground(new java.awt.Color(255, 255, 255));
        HOTELROOMTEXT.setText("HOTEL ROOM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 6, 0, 0);
        BLUEPANNEL.add(HOTELROOMTEXT, gridBagConstraints);

        HOTELROOMTEXT1.setBackground(new java.awt.Color(255, 255, 255));
        HOTELROOMTEXT1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HOTELROOMTEXT1.setForeground(new java.awt.Color(255, 255, 255));
        HOTELROOMTEXT1.setText("RESERVATION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 119, 14);
        BLUEPANNEL.add(HOTELROOMTEXT1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(USERNAME)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TEXTFIELD))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PASSWORDLABEL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(REGESTERBUTTON)
                                        .addGap(41, 41, 41)
                                        .addComponent(LOGINBUTTON))
                                    .addComponent(PASSWORD)))))
                    .addComponent(GREYPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BLUEPANNEL, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GREYPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USERNAME)
                    .addComponent(TEXTFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PASSWORDLABEL)
                    .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LOGINBUTTON)
                    .addComponent(REGESTERBUTTON))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(BLUEPANNEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TEXTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTFIELDActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_TEXTFIELDActionPerformed

    private void LOGINBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINBUTTONActionPerformed
        
    }//GEN-LAST:event_LOGINBUTTONActionPerformed

    private void REGESTERBUTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGESTERBUTTONMouseClicked
        Signin sign = new Signin();
        sign.setVisible(true);
        sign.pack();
        sign.setLocationRelativeTo(null);
        sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_REGESTERBUTTONMouseClicked

    
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BLUEPANNEL;
    private javax.swing.JPanel GREYPANEL;
    private javax.swing.JLabel HOTELROOMTEXT;
    private javax.swing.JLabel HOTELROOMTEXT1;
    private javax.swing.JButton LOGINBUTTON;
    private javax.swing.JLabel LOGINTEXT;
    private javax.swing.JPasswordField PASSWORD;
    private javax.swing.JLabel PASSWORDLABEL;
    private javax.swing.JButton REGESTERBUTTON;
    private javax.swing.JTextField TEXTFIELD;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
