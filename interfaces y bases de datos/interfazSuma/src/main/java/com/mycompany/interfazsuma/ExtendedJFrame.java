/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfazsuma;

import java.awt.HeadlessException;
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
    private JLabel label2;
    //ENTRADA DE TEXTO
    private JTextField inpuText;
    private JTextField inpuText2;
    private JTextField inpuText3;
    //boton
    private JButton button1;
    
    

    public ExtendedJFrame(String title) throws HeadlessException {
        super(title);
        
        //intanciar los atributos
        panel = new JPanel();
        label = new JLabel("SUMA");
        label2 = new JLabel("=");
        inpuText = new JTextField();
        inpuText2 = new JTextField();
        inpuText3 = new JTextField();
        button1 = new JButton("sumar");
        
        
        //label 
        label.setBounds(150, 30, 40, 30);
        this.add(label);
        
        label2.setBounds(190, 30, 50, 85);
        this.add(label2);
        
        //inpuTexts
        inpuText.setBounds(50, 60, 50, 30);
        inpuText2.setBounds(120, 60, 50, 30);
        inpuText3.setBounds(220, 60, 50, 30);
        this.add(inpuText);
        this.add(inpuText2);
        this.add(inpuText3);
        
        //boton
        button1.setBounds(50, 95, 120, 30);
        button1.addActionListener(this);
        this.add(button1);
        
        
        this.add(panel);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
           int x = Integer.parseInt(inpuText.getText());
           int y = Integer.parseInt(inpuText2.getText());
           
           String z = String.valueOf(x+y);
           
           inpuText3.setText(z);
           
        }
    }
}
