
import java.io.*;
import com.opencsv.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.apache.commons.lang3.*;
/**
 *
 * @author HP
 */
public class NewMenu extends javax.swing.JFrame {

     JLabel l=new JLabel();
     Entry[] entry;  
     String[] vaStore;
     String[] pending;
     int ctr;
      List <String[]> nextRecord3;
         /** Creates new form NewMenu */
    public NewMenu() {
        this.pending = new String[3];
        this.vaStore = new String[3];
        initComponents();
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jButton4.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        entry=new Entry[50];
        int h;
        for(h=0;h<entry.length;h++)
        {
        entry[h]=new Entry();
        }
    l.setText("Paste your schedule to this excel sheet. Donot overwrite column names. Save the file.");
    l.setBounds(0,0,500,30);
    jDialog1.setBounds(0, 0, 500, 200);
        jDialog1.add(l);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Main Menu");

        jButton1.setText("View Schedule");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Schedule");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Calculate Schedule");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton4.setText("No");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Yes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantity");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter the model name and quantity of last produced product.");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Model");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(316, 316, 316)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))))
                .addGap(105, 105, 105))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(498, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(107, 107, 107)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addGap(29, 29, 29)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(312, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(222, 222, 222)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 jButton5.setVisible(false);
        jButton6.setVisible(false);
        jTextField1.setVisible(false);
         jTextField2.setVisible(false);
         jButton4.setVisible(false);
         jLabel2.setVisible(false);
         jLabel3.setVisible(false);
          jLabel4.setVisible(false);
          jLabel5.setVisible(false);
               if (Desktop.isDesktopSupported()) {
    try {
         jDialog1.setVisible(true);
        File myFile = new File("schedule.csv");
        Desktop.getDesktop().open(myFile);
    } catch (IOException ex) {
        System.out.println("ERROR! The file requested couldn't be opened. ");
    }
}
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jTextField1.setVisible(false);
         jTextField2.setVisible(false);
         jButton4.setVisible(false);
         jLabel2.setVisible(false);
         jLabel3.setVisible(false);
          jLabel4.setVisible(false);
          jLabel5.setVisible(false);
        if (Desktop.isDesktopSupported()) {
    try {
        File myFile = new File("result.csv");
        Desktop.getDesktop().open(myFile);
    } catch (IOException ex) {
        System.out.println("ERROR! The file requested couldn't be opened. ");
    }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try { 
		// Create an object of filereader 
		// class with CSV file as a parameter. 
		FileReader filereader = new FileReader("schedule.csv"); 
                FileReader filereader2 = new FileReader("model.csv");
                FileReader filereader3 = new FileReader("schedule.csv");
                
                
		// create csvReader object passing 
		// file reader as a parameter 
		CSVReader csvReader = new CSVReader(filereader); 
		String[] nextRecord; 
                CSVReader csvReaderT=new CSVReader(filereader3);
                csvReaderT.readAll();
               CSVReader csvReaderC=new CSVReader(filereader2);
                if(csvReaderT.getLinesRead()<2)
                {
                   System.out.println("ERROR");
                }
                else if(csvReaderT.getLinesRead()>51)
                {
                     System.out.println("ERROR MAX REACHED");
                }
		// we are going to read data line by line 
               else
                {  
                    List <String[]> get2=csvReaderC.readAll();
                     int k=0; int in=0;
                     
		while ((nextRecord = csvReader.readNext()) != null)
                { 
                   
                    if(nextRecord.length==1)
                        break;
                                 if(k>0 && in<entry.length)
                             {
                        entry[in].setModel(nextRecord[0]);
                        entry[in].qty=Integer.parseInt(nextRecord[1]);
                        
                                for(String[] va : get2)
                                {
                                    
                                  if(nextRecord[0].equals(va[0]))
                                  {
                                      entry[in].ct=Integer.parseInt(va[1]);
                                      break;
                                  }
                                        
                                }
                                
                                in++;
                            }
                    k++;
                 
                 
                        }                  
         FileReader filereader4 = new FileReader("result.csv");
         CSVReader csvreaderX = new CSVReader(filereader4);
         nextRecord3= csvreaderX.readAll();
         if(csvreaderX.getLinesRead()==0)
         {
             ctr=0;
             try {
             entry[0].getOptimum(entry,ctr,pending);
         } catch (IOException ex) {
             Logger.getLogger(NewMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
              l.setText("Schedule Successfully calculated. Click on view schedule to view results.");
         jDialog1.setVisible(true);
         pending[0]=null;
         pending[1]=null;
         pending[2]=null;
         }
         else
         {
             
         int count=0;
         for(String[] va2 : nextRecord3)
         {
             if(va2[0].isEmpty()==false)
             {
                 vaStore=va2;
                 count++;
             }
             
         }
        jLabel2.setText("Was the last machine produced "+ vaStore[0]+" with quantity "+vaStore[2]+" ?");
         jButton5.setVisible(true);
        jButton6.setVisible(true);
        jTextField1.setVisible(true);
         jTextField2.setVisible(true);
         jButton4.setVisible(true);
         jLabel2.setVisible(true);
         jLabel3.setVisible(true);
          jLabel4.setVisible(true);
          jLabel5.setVisible(true);
           jLabel3.setEnabled(false);
          jLabel4.setEnabled(false);
          jLabel5.setEnabled(false);
           jButton6.setEnabled(false);
           jButton5.setEnabled(true);
        jTextField1.setEnabled(false);
         jTextField2.setEnabled(false);
                }
                }
      }
	catch (Exception e) { 
		e.printStackTrace(); 
	};
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ctr=Integer.parseInt(vaStore[1]);
         try {
             entry[0].getOptimum(entry,ctr,pending);
         } catch (IOException ex) {
             Logger.getLogger(NewMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
          l.setText("Schedule Successfully calculated. Click on view schedule to view results.");
         jDialog1.setVisible(true);
           pending[0]=null;
         pending[1]=null;
         pending[2]=null;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       String tempm=jTextField1.getText();
       int flag=0;
       for(String[] vaStore2 : nextRecord3)
       {
           if(vaStore2[0].equals(tempm))
           {
               flag=1;
               ctr=Integer.parseInt(vaStore2[1]);
               if(Integer.parseInt(vaStore2[2])!=Integer.parseInt(jTextField2.getText()))
               {
                   pending[0]=vaStore2[0];
                   pending[1]=String.valueOf(ctr);
                   pending[2]=String.valueOf(Integer.parseInt(vaStore2[2])-Integer.parseInt(jTextField2.getText()));
                 
               }
               break;
           }
                              
       }
       if(flag==0)
       {
               l.setText("Please Enter Valid model Number.");
               jDialog1.setVisible(true);
           }
       if(flag==1)
       {
         System.out.print(Arrays.toString(pending));
         try {
             entry[0].getOptimum(entry,ctr,pending);
         } catch (IOException ex) {
             Logger.getLogger(NewMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
          l.setText("Schedule Successfully calculated. Click on view schedule to view results.");
         jDialog1.setVisible(true);
           pending[0]=null;
         pending[1]=null;
         pending[2]=null;
    }//GEN-LAST:event_jButton6ActionPerformed
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jButton6.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(NewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
