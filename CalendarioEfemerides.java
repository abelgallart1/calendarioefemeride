


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abel
 */
import java.util.Timer;
import java.util.TimerTask;

public class CalendarioEfemerides extends javax.swing.JPanel {

    /**
     * Creates new form CalendarioApp
     */
     Timer tiempo=new Timer();
     TimerTask tiempoTarea;
     ArrayList  efemerides;
     
    public CalendarioEfemerides() {
        initComponents();
        
        
        class  Calendario1 extends Calendario{
      
          void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
           super.jButton2ActionPerformed(evt);
      
           boolean encontrado=false;
           Calendar aux=Calendar.getInstance();
           int hora=aux.get(Calendar.HOUR_OF_DAY);
           int min=aux.get(Calendar.MINUTE);
              int segundos=aux.get(Calendar.SECOND);
                    
           for(int i=0;i<efemerides.size();i++)
                {Efemeride e=(Efemeride)efemerides.get(i);
                   if (Integer.parseInt(jTextField2.getText())==e.mes&&
                     Integer.parseInt(label2.getText())==e.dia)    
                   {if (hora!=0||min!=0||segundos!=0)  e.efem=jEditorPane1.getText();
                    else jEditorPane1.setText(e.efem);
                   
                      
                   
                   
                   encontrado=true;}
                }     
           
           if (!encontrado) 
               
               if (hora!=0||min!=0||segundos!=0)                      
               efemerides.add(new Efemeride(Integer.parseInt(jTextField2.getText()),
                                                         Integer.parseInt(label2.getText()),
                                                         jEditorPane1.getText()));
           
               
                   
           try{
              String name="C:/efemeride";
              ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream(name));
              op.writeObject(efemerides);
            }catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"No se pudo guardar los cambios"
                                        ,"Error",javax.swing.JOptionPane.OK_OPTION);      }
                  
            
            if (tiempoTarea!=null){tiempoTarea.cancel();tiempoTarea=null;}
            if (tiempo!=null) {tiempo.cancel();tiempo=null;}
        
          
            tiempoTarea=new TimerTask() {
         
            public void run() {
              boolean encontrado=false;
             for(int i=0;i<efemerides.size();i++)
                {Efemeride e=(Efemeride)efemerides.get(i);
                   if (Integer.parseInt(jTextField2.getText())==e.mes&&
                     Integer.parseInt(label2.getText())==e.dia)    
                {jEditorPane1.setText(e.efem);encontrado=true;}
                                        
                }
            if(!encontrado) jEditorPane1.setText("");
                 
            }
             };
        tiempo=new Timer();        
        tiempo.scheduleAtFixedRate(tiempoTarea, 0,500);
               
          
          }
         
        }    
    
               
        Calendario1 c=new Calendario1();
        efemerides=new ArrayList();
        add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,90, 450,380));
        validate();
        repaint();
        this.setSize(460,300+90);
         try{
              String name="C:/efemeride";
              ObjectInputStream op=new ObjectInputStream(new FileInputStream(name));
              efemerides=(ArrayList)op.readObject();
            }catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"No se encuentra el archivo efemeride"
                                        ,"Error",javax.swing.JOptionPane.OK_OPTION);      
                               }
     
        tiempoTarea=new TimerTask() {
         
            public void run() {
              boolean encontrado=false;
             for(int i=0;i<efemerides.size();i++)
                {Efemeride e=(Efemeride)efemerides.get(i);
                   if (Integer.parseInt(c.jTextField2.getText())==e.mes&&
                     Integer.parseInt(c.label2.getText())==e.dia)    
                {jEditorPane1.setText(e.efem);encontrado=true;}
                                        
                }
            if(!encontrado) jEditorPane1.setText("");
                 
            }
        };
                
        tiempo.scheduleAtFixedRate(tiempoTarea, 0,500);
        
    
    
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setMinimumSize(new java.awt.Dimension(450, 90));
        setPreferredSize(new java.awt.Dimension(400, 90));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEditorPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jEditorPane1MousePressed(evt);
            }
        });
        jEditorPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEditorPane1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jEditorPane1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        
    }// </editor-fold>                        

    private void jEditorPane1MousePressed(java.awt.event.MouseEvent evt) {                                          
     if (tiempoTarea!=null){tiempoTarea.cancel();tiempoTarea=null;}
     if (tiempo!=null) {tiempo.cancel();tiempo=null;}
    
// TODO add your handling code here:
    }                                         

    private void jEditorPane1KeyPressed(java.awt.event.KeyEvent evt) {                                        
     if (tiempoTarea!=null){tiempoTarea.cancel();tiempoTarea=null;}
     if (tiempo!=null) {tiempo.cancel();tiempo=null;}
    
        // TODO add your handling code here:
    }                                       

    
    // Variables declaration - do not modify                     
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   

}
