/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parthreads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.ButtonModel;
import javax.swing.JFrame;


public class Atm2 extends javax.swing.JFrame {

             final static int ServerPort = 1234;
    static String operation2="";
    static String money2="";
    
    
    static boolean flag=false;
        static boolean flag2=true;

    static int a;
    static Atm2 n ;
static String oper="";
static String FromText="";
 static DataOutputStream dos;
    static DataInputStream dis;
    static Socket s;
static Scanner scn;
Thread sendMessage;


    /**
     * Creates new form login
     */
    public Atm2() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabellogin = new javax.swing.JLabel();
        Withdraw = new javax.swing.JButton();
        Deposit = new javax.swing.JButton();
        Check = new javax.swing.JButton();
        transationBut = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        usd = new javax.swing.JRadioButton();
        eur = new javax.swing.JRadioButton();
        rad1 = new javax.swing.JRadioButton();
        rad3 = new javax.swing.JRadioButton();
        rad2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atm 2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(170, 170, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("password:");

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton6.setBackground(new java.awt.Color(0, 102, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("login");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Username:");

        jButton8.setBackground(new java.awt.Color(192, 57, 43));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("cancel");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabellogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabellogin.setForeground(new java.awt.Color(236, 241, 241));
        jLabellogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabellogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelloginMouseClicked(evt);
            }
        });

        Withdraw.setBackground(new java.awt.Color(26, 55, 77));
        Withdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Withdraw.setForeground(new java.awt.Color(246, 242, 212));
        Withdraw.setText("Withdraw");
        Withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawActionPerformed(evt);
            }
        });

        Deposit.setBackground(new java.awt.Color(26, 55, 77));
        Deposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Deposit.setForeground(new java.awt.Color(246, 242, 212));
        Deposit.setText("Deposit");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        Check.setBackground(new java.awt.Color(26, 55, 77));
        Check.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Check.setForeground(new java.awt.Color(246, 242, 212));
        Check.setText("Balance");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        transationBut.setBackground(new java.awt.Color(26, 55, 77));
        transationBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transationBut.setForeground(new java.awt.Color(246, 242, 212));
        transationBut.setText("Transaction ");
        transationBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transationButActionPerformed(evt);
            }
        });

        convert.setBackground(new java.awt.Color(26, 55, 77));
        convert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        convert.setForeground(new java.awt.Color(246, 242, 212));
        convert.setText("converter");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(26, 55, 77));
        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(246, 242, 212));
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        usd.setBackground(new java.awt.Color(170, 170, 170));
        buttonGroup1.add(usd);
        usd.setText("EG->US");

        eur.setBackground(new java.awt.Color(170, 170, 170));
        buttonGroup1.add(eur);
        eur.setText("EG->EUR");

        rad1.setBackground(new java.awt.Color(170, 170, 170));
        rad1.setText("Client1");
        rad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad1ActionPerformed(evt);
            }
        });

        rad3.setBackground(new java.awt.Color(170, 170, 170));
        rad3.setText("Client3");

        rad2.setBackground(new java.awt.Color(170, 170, 170));
        rad2.setText("Client2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabellogin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPasswordField1)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(transationBut, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(usd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clear)
                                        .addComponent(eur))
                                    .addContainerGap()))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rad1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad3)
                                .addGap(22, 22, 22))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(162, 162, 162))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(transationBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usd)
                                    .addComponent(eur))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rad1)
                                    .addComponent(rad2)
                                    .addComponent(rad3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabellogin)))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabelloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelloginMouseClicked
       
    }//GEN-LAST:event_jLabelloginMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
                Sendd("login",jTextField2.getText(),jPasswordField1.getText());
          
    }//GEN-LAST:event_jButton6ActionPerformed

    private void WithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawActionPerformed
        
                Sendd("Withdraw",t1.getText(),"0");

    }//GEN-LAST:event_WithdrawActionPerformed

    
    public void Sendd(String oper,String FromText,String x){


        String msg2=oper+"#"+FromText+"#"+x;
         sendMessage = new Thread(new Runnable()
		{
			@Override
			public void run() {
				while (true) {


					try {
						// write on the output stream
						dos.writeUTF(msg2);
                                                break;
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
        		sendMessage.start();
                        
        }
    
    
    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        
                   
                         Sendd("Depoist",t1.getText(),"0");

    }//GEN-LAST:event_DepositActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        
        Sendd("Check","0","0");

    }//GEN-LAST:event_CheckActionPerformed

    private void transationButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transationButActionPerformed
       
        if (rad1.isSelected()) {
            Sendd("transation",t1.getText(),"client 1");
        }
        else if(rad2.isSelected()) {
         Sendd("transation",t1.getText(),"client 2");
        }
          else if(rad3.isSelected()) {
         Sendd("transation",t1.getText(),"client 3");
        }
 
    }//GEN-LAST:event_transationButActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
if (usd.isSelected()) {
            Sendd("usd",t1.getText(),"0"); 
        }
else if(eur.isSelected()){
                    Sendd("eur",t1.getText(),"0"); 
        }

 
    }//GEN-LAST:event_convertActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        t1.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void rad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rad1ActionPerformed

    /**
     * @param args the command line arguments
     */
    //interrupt n4elo
    public static void main(String args[])throws IOException, InterruptedException, UnknownHostException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Atm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                n= new Atm2();
                n.setVisible(true);
                Withdraw.setVisible(false);
                Deposit.setVisible(false);
                Check.setVisible(false);
                convert.setVisible(false);
                transationBut.setVisible(false);
                clear.setVisible(false);
                t1.setVisible(false);
                n.setSize(400,344);
                usd.setVisible(false);
                eur.setVisible(false);
                rad1.setVisible(false);
                rad2.setVisible(false);
                rad3.setVisible(false);
                
            }
        });
        
		
		// establish the connection
		 s = new Socket("localhost", ServerPort);
		
		// obtaining input and out streams
		 dis = new DataInputStream(s.getInputStream());
		 dos = new DataOutputStream(s.getOutputStream());

		
		// readMessage thread from server
		Thread readMessage = new Thread(new Runnable()
		{
			@Override
			public void run() {
                                String msg=null;
				while (true) {
					try {
						// read the message sent to this client
						msg = dis.readUTF();
                                                 
                                                System.out.println(msg);
                                                
                                        } catch (IOException e) {

						e.printStackTrace();
					}
                                       if (msg.equals("Login Success")) {
                                                Withdraw.setVisible(true);
                                                    Deposit.setVisible(true);
                                                    Check.setVisible(true);
                                                    convert.setVisible(true);
                                                    transationBut.setVisible(true);
                                                    clear.setVisible(true);
                                                    t1.setVisible(true);
                                                    jLabel6.setVisible(false);
                                                    jLabel2.setVisible(false);
                                                    jTextField2.setVisible(false);
                                                    jPasswordField1.setVisible(false);
                                                    jButton6.setVisible(false);
                                                    jButton8.setVisible(false);
                                                    usd.setVisible(true);
                                                    eur.setVisible(true);
                                                     rad1.setVisible(true);
                                                    rad3.setVisible(true);
                                                    n.setSize(400,360);
                                                            }
				}
			}
		});

		readMessage.start();
                System.out.println(Atm2.oper);
                
       
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Check;
    public static javax.swing.JButton Deposit;
    public static javax.swing.JButton Withdraw;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JButton clear;
    public static javax.swing.JButton convert;
    public static javax.swing.JRadioButton eur;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabellogin;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPasswordField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JRadioButton rad1;
    public static javax.swing.JRadioButton rad2;
    public static javax.swing.JRadioButton rad3;
    public static javax.swing.JTextField t1;
    public static javax.swing.JButton transationBut;
    public static javax.swing.JRadioButton usd;
    // End of variables declaration//GEN-END:variables
}
