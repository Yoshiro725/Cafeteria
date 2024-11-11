package Controladores_yadhir;

import Vista.Inicio_clientes;
import Vista.Menu_colaboraciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenu_colaboraciones implements ActionListener{
    
    Menu_colaboraciones objMenu_colaboraciones;

    public ControladorMenu_colaboraciones(Menu_colaboraciones objMenu_colaboraciones) {
        this.objMenu_colaboraciones = objMenu_colaboraciones;
        this.objMenu_colaboraciones.jButton5.addActionListener(this);
        this.objMenu_colaboraciones.jButton6.addActionListener(this);
        this.objMenu_colaboraciones.jButton7.addActionListener(this);
        this.objMenu_colaboraciones.jButton8.addActionListener(this);
        this.objMenu_colaboraciones.jComboBox3.addActionListener(this);
        this.objMenu_colaboraciones.jComboBox4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.objMenu_colaboraciones.jButton5 == e.getSource()){
            //escoger paquete 1//
        }
        if(this.objMenu_colaboraciones.jButton6 == e.getSource()){
            //escoger paquete 2//
        }
        if(this.objMenu_colaboraciones.jButton7 == e.getSource()){
            //atras//
            new Inicio_clientes().setVisible(true);
            this.objMenu_colaboraciones.dispose();
        }
        if(this.objMenu_colaboraciones.jButton8 == e.getSource()){
            //comprar mas//
        }
        if(this.objMenu_colaboraciones.jComboBox3 == e.getSource()){
            
        }
        if(this.objMenu_colaboraciones.jComboBox4 == e.getSource()){
            
        }
    }
    
}