

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abel
 */
import java.awt.Color;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Component;
import java.awt.event.ActionEvent;

public class Calendario extends javax.swing.JPanel{
  ArrayList  dias=new ArrayList();
  Calendar hoy=Calendar.getInstance();
  Timer timer=new Timer();
  javax.swing.JPanel panel=new javax.swing.JPanel();
     
  javax.swing.JButton jButton2;
  javax.swing.JLabel jLabel1;
  javax.swing.JLabel jLabel2;
  javax.swing.JLabel jLabel3;
  javax.swing.JLabel jLabel4;
  javax.swing.JLabel jLabel5;
  javax.swing.JLabel jLabel6;
  javax.swing.JLabel jLabel7;
  javax.swing.JLabel jLabel8;
  javax.swing.JPanel jPanel1;
  javax.swing.JPanel jPanel2;
  javax.swing.JPanel jPanel3;
  javax.swing.JTextField jTextField1;
  javax.swing.JTextField jTextField2;
  javax.swing.JLabel label1;
  javax.swing.JLabel mes;
  JLabel label=new JLabel();
  JLabel label2=new JLabel();
                   

      

  
    public Calendario() {
 /////////////////////
        
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        mes = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

         jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 7, 5, 5));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("D");
        jPanel2.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("L");
        jPanel2.add(jLabel3);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("M");
        jPanel2.add(jLabel1);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jPanel2.add(jLabel4);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("J");
        jPanel2.add(jLabel6);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("V");
        jPanel2.add(jLabel7);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("S");
        jPanel2.add(jLabel5);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 30));

        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 180));

        label1.setText("Año");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        mes.setText("Mes");
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 30, 30));
         
        
        label.setText("dia: ");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 30, 30));
     
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 30, 30));

        
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 50, 30));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
    
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 30));

        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 400, 20));

        this.add(jPanel1, java.awt.BorderLayout.PAGE_START);


  
////////////////
 
      
        
                Calendar X=Calendar.getInstance();
        X.set(1900,0,1);
        dias.add(X);
        
     for(int a=1900;a<2100;a++)
     for(int m=0;m<12;m++)
       for(int d=1;d<=31;d++) 
       {Calendar aux=Calendar.getInstance();
        
         aux.set(a,m,d);
         dias.add(aux);
    
        String diasemana=aux.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
        }
      panel.setSize(jPanel3.getSize());
      panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
      
      jTextField1.setText(hoy.get(Calendar.YEAR)+"");
      jTextField2.setText(hoy.get(Calendar.MONTH)+1+""); 
      label2.setText(hoy.get(Calendar.DAY_OF_MONTH)+"");
   
       
      
      //////////////
       panel.removeAll();
    panel.validate();
    int a=hoy.get(Calendar.YEAR);
    int m=hoy.get(Calendar.MONTH)+1;
    
   ArrayList diasdelmes=new ArrayList();
    for(int i=0;i<dias.size();i++)
     {Calendar dia=(Calendar)(dias.get(i));
        
     String diasemana=dia.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
     if(a==dia.get(Calendar.YEAR)&&(m-1)==dia.get(Calendar.MONTH))
     { 
         diasdelmes.add(dia);
                   
     }
     
     }
   ArrayList DM=new ArrayList();
   for(int i=0;i<diasdelmes.size();i++)
   {Calendar x=(Calendar)diasdelmes.get(i);
   if (!DM.contains(x)) DM.add(x);
   }  
   diasdelmes=DM;
   
   
   int y=0;
   for(int i=0;i<diasdelmes.size();i++) 
       {Calendar x=(Calendar)diasdelmes.get(i);
       JButton jb=new JButton(""+x.get(Calendar.DAY_OF_MONTH));
      jb.setBackground(Color.white);
       if (x.get(Calendar.YEAR)==hoy.get(Calendar.YEAR)&&
          x.get(Calendar.MONTH)==hoy.get(Calendar.MONTH)&&
          x.get(Calendar.DAY_OF_MONTH)==hoy.get(Calendar.DAY_OF_MONTH)) jb.setBackground(Color.red);
      
       panel.add(jb,new org.netbeans.lib.awtextra.AbsoluteConstraints(x.get(Calendar.DAY_OF_WEEK)*57-57,y*30, 57, 30));          
          if (x.get(Calendar.DAY_OF_WEEK)==7)y++;
       
        jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt,jb);
            }
        }); 
       
       }
        
    panel.validate();
    jPanel3.removeAll();
    jPanel3.add(panel, java.awt.BorderLayout.CENTER);
    jPanel3.validate();
    jPanel2.repaint();jPanel3.repaint();
  
    TimerTask timerTask=new TimerTask() {
            
            public void run() {
                Calendar c=Calendar.getInstance();
                String aux="Hoy es ";
                aux+=c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())+" ,  ";
                aux+=c.get(Calendar.DAY_OF_MONTH)+" de "; 
                aux+=c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())+" del "; 
                aux+=c.get(Calendar.YEAR)+"  hora  "; 
                aux+=c.get(Calendar.HOUR)+":"; 
                aux+=c.get(Calendar.MINUTE)+":"; 
                aux+=c.get(Calendar.SECOND); 
                jLabel8.setText(aux);   
                if (hoy.get(Calendar.DAY_OF_MONTH)!=Calendar.getInstance().get(Calendar.DAY_OF_MONTH)||
                    hoy.get(Calendar.MONTH)!=Calendar.getInstance().get(Calendar.MONTH)||
                    hoy.get(Calendar.YEAR)!=Calendar.getInstance().get(Calendar.YEAR))
                    
                  { jTextField1.setText(Calendar.getInstance().get(Calendar.YEAR)+"");
                    jTextField2.setText(Calendar.getInstance().get(Calendar.MONTH)+1+""); 
                    label2.setText(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"");
                    
                   hoy=Calendar.getInstance();
                   jButton2ActionPerformed(new ActionEvent(jButton2,0,""));
                  } 
            }
        };
        
        timer.scheduleAtFixedRate(timerTask, 0,1000);
      
        
    
    
    }
    
    
    void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    int a=2018;
    int m=10;
    try{
        a=Integer.parseInt(jTextField1.getText());
        if (a<1900||a>2100)throw new Exception();   
        }catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog
                                (null,"Formato Incorrecto del Año"+"\n"+
                                       "debe ser un numero comprendido"+"\n"+
                                       "entre 1900 y 2100" 
                                        ,"Error",javax.swing.JOptionPane.OK_OPTION);      
                            return;
                            } 
    try{
        m=Integer.parseInt(jTextField2.getText());
        if (m<1||m>12)throw new Exception();
        }catch(Exception e){
           javax.swing.JOptionPane.showMessageDialog
                                (null,"Formato Incorrecto del Mes"+"\n"+
                                       "debe ser un numero comprendido"+"\n"+
                                       "entre 1 y 12" 
                                      ,"Error",javax.swing.JOptionPane.OK_OPTION);      
                           return;
                            }
    
   
   panel.removeAll();
   panel.validate();
   
   ArrayList diasdelmes=new ArrayList();
    for(int i=0;i<dias.size();i++)
     {Calendar dia=(Calendar)(dias.get(i));
     if(a==dia.get(Calendar.YEAR)&&(m-1)==dia.get(Calendar.MONTH))
      diasdelmes.add(dia);
     }
  
    ArrayList DM=new ArrayList();
   for(int i=0;i<diasdelmes.size();i++)
   {Calendar x=(Calendar)diasdelmes.get(i);
   if (!DM.contains(x)) DM.add(x);
   }  
   diasdelmes=DM;
   
   int y=0;
  
   for(int i=0;i<diasdelmes.size();i++) 
       {Calendar x=(Calendar)diasdelmes.get(i);
       JButton jb=new JButton(""+x.get(Calendar.DAY_OF_MONTH));
       jb.setBackground(Color.white);
      
       if (jb.getText().equals(label2.getText())) jb.setBackground(Color.yellow);
        
       if (x.get(Calendar.YEAR)==hoy.get(Calendar.YEAR)&&
          x.get(Calendar.MONTH)==hoy.get(Calendar.MONTH)&&
          x.get(Calendar.DAY_OF_MONTH)==hoy.get(Calendar.DAY_OF_MONTH)) jb.setBackground(Color.red);
      
       panel.add(jb,new org.netbeans.lib.awtextra.AbsoluteConstraints(x.get(Calendar.DAY_OF_WEEK)*57-57,y*30, 57, 30));          
          if (x.get(Calendar.DAY_OF_WEEK)==7)y++;
       
          jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt,jb);
            }
        });                 
   
       }
        
    panel.validate();
    jPanel3.removeAll();
    jPanel3.add(panel, java.awt.BorderLayout.CENTER);
    jPanel3.validate();
    jPanel2.repaint();jPanel3.repaint();
    

    }                                        

  private void jButtonActionPerformed(java.awt.event.ActionEvent evt,JButton jb) {                                         
    label2.setText(jb.getText());
    jb.setBackground(Color.yellow);
      
    Component []aux= panel.getComponents();
    
     for(int i=0;i<aux.length;i++)
      {Component c=aux[i];
      if (Integer.parseInt(jTextField1.getText())==hoy.get(Calendar.YEAR)&&
          (Integer.parseInt(jTextField2.getText())-1)==hoy.get(Calendar.MONTH)&&
          Integer.parseInt(((JButton)c).getText())==hoy.get(Calendar.DAY_OF_MONTH)) c.setBackground(Color.red);
      else if(!c.equals(jb))c.setBackground(Color.WHITE);
      
       
      
      
      
      }
    panel.repaint();
  }

}
