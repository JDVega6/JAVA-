/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstagui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author juang
 */
public class ExtendedJFrame extends JFrame implements ActionListener{
    //panel
    private JPanel panel;
    //label
    private JLabel label;
    //ENTRADA DE TEXTO
    private JTextField inpuText;
    //boton
    private JButton button1;
    private JButton button2;

    //hereda los atributos y metodos de JFrame
    public ExtendedJFrame(String title) {
        super(title);
        //instanciar atributos
        panel = new JPanel();
        label = new JLabel("Nombre de etiqueta");
        inpuText = new JTextField();
        button1 = new JButton("Action 1");
        button2 = new JButton("Action 2");
        //panel
        Color color = new Color(194, 210,234);
        panel.setBackground(color);
        
        //label
        label.setBounds(140, 30, 200, 30);
        label.setAlignmentX(CENTER_ALIGNMENT);
        label.setAlignmentY(CENTER_ALIGNMENT);
        
        this.add(label);
        
        //input text
        inpuText.setBounds(50, 60, 300, 30);
        this.add(inpuText);
        
        //button
        button1.setBounds(75, 95, 120, 30);
        button1.addActionListener(this);//se instancia el evento del boton
        this.add(button1);
        
        button2.setBounds(205, 95, 120, 30);
        button2.addActionListener(this);
        this.add(button2);
        
        //añadir panel
        this.add(panel);
    }
    
     public void actionPerformed(ActionEvent e) {
               if(e.getSource() == button1){
                   System.out.println(inpuText.getText());//para tomar lo que hay en el "inputText"
                   inpuText.setText("");
               }else if(e.getSource() == button2){
                   Color cc = new Color(50, 100, 150);
                   System.out.println("boton 2");
                   panel.setBackground(cc);
                   this.repaint();//Esto se pone para refrescar la pagina y que no surjan errores
               }
              }
    
    
}
