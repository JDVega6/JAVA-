/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleresdata;


import java.awt.HeadlessException;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author juang
 */
public class PanelCambioColor extends JFrame implements ActionListener, ItemListener{
    //atributos
    private JPanel panel;
    private JComboBox<String> menu;
    private JButton boton;
    private JButton crear;
    private JButton delete;
    private JButton update;
    
    private Color colorPanel;
    private List<WColor> colores;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    
    //constructor
    public PanelCambioColor(String title){
        super(title);
        panel = new JPanel(new FlowLayout());
        menu = new JComboBox<>();
        
        boton = new JButton("Cambiar color");
        crear = new JButton("Crear dato");
        delete = new JButton("Borrar color");
        update = new JButton("Actualizar color");
        
        l1 = new JLabel("Nombre");
        l2 = new JLabel("Red");
        l3 = new JLabel("Green");
        l4 = new JLabel("Blue");
        
        t1 = new JTextField("nombre....");
        t2 = new JTextField("Red..");
        t3 = new JTextField("Green...");
        t4 = new JTextField("Blue...");
        
        
        
        WColor obj = new WColor();
        colores = new ArrayList<>();
        colores = obj.readColor();
       
        
        if(!colores.isEmpty()){
            colorPanel = new Color(
                colores.get(0).getRed(),
                colores.get(0).getGreen(),
                colores.get(0).getBlue()
            );
            panel.setBackground(colorPanel);
        }
        
        for(WColor c:colores){
            System.out.println(c);
            menu.addItem(c.toString2());
        }
       
        
        //menu.addItemListener(this);
        panel.add(menu);
        
        boton.addActionListener(this);
        panel.add(boton);
        
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(l3);
        panel.add(t3);
        panel.add(l4);
        panel.add(t4);
        
        crear.addActionListener(this);
        panel.add(crear);
        
        delete.addActionListener(this);
        panel.add(delete);
        
        update.addActionListener(this);
        panel.add(update);
        
        
        add(panel);
    }

    //metodos
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            System.out.println(menu.getSelectedIndex());
            panel.setBackground(new Color(
                    colores.get(menu.getSelectedIndex()).getRed(),
                    colores.get(menu.getSelectedIndex()).getGreen(),
                    colores.get(menu.getSelectedIndex()).getBlue()
            ));
        }else if(e.getSource() == crear){
            WColor color = new WColor();
            color.createColor(
                    t1.getText(), 
                    Integer.parseInt(t2.getText()), 
                    Integer.parseInt(t3.getText()), 
                    Integer.parseInt(t4.getText())
            );
            colores = color.readColor();//Se llama a el metodo leer para traer todos lo datos de la tabla incluido el que se acaba de crear
            menu.removeAllItems();// se limpia el menu 
            for(WColor c:colores){//se vuelve a llenar el menu actualizado
                menu.addItem(c.toString2());
            }
            
        }else if(e.getSource() == delete){
            WColor color = new WColor();
            color.deleteColor(
                    Integer.parseInt(t2.getText())
            );
            colores = color.readColor();//Se llama a el metodo leer para traer todos lo datos de la tabla incluido el que se acaba de crear
            menu.removeAllItems();// se limpia el menu 
            for(WColor c:colores){//se vuelve a llenar el menu actualizado
                menu.addItem(c.toString2());
            }
            
        }else if(e.getSource() == update){
            WColor color = new WColor();
            color.updateColor(
                    t1.getText(), 
                    Integer.parseInt(t2.getText()), 
                    Integer.parseInt(t3.getText()), 
                    Integer.parseInt(t4.getText())
                    , 9);
            
            colores = color.readColor();//Se llama a el metodo leer para traer todos lo datos de la tabla incluido el que se acaba de crear
            menu.removeAllItems();// se limpia el menu 
            for(WColor c:colores){//se vuelve a llenar el menu actualizado
                menu.addItem(c.toString2());
            }
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == menu){
            System.out.println();
            for(WColor c:colores)
            {
                if(c.getNombre() == e.getItem())
                    panel.setBackground(
                            new Color(
                                    c.getRed(),
                                    c.getGreen(),
                                    c.getBlue()
                            ));
                    
            }
        }
    }
}
