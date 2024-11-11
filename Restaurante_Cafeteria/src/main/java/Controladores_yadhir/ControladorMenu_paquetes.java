package Controladores_yadhir;

import Vista.Menu_paquetes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenu_paquetes implements ActionListener{
    
    Menu_paquetes objMenu_paquetes;

    public ControladorMenu_paquetes(Menu_paquetes objMenu_paquetes) {
        this.objMenu_paquetes = objMenu_paquetes;
        this.objMenu_paquetes.jButton1.addActionListener(this);
        this.objMenu_paquetes.jButton2.addActionListener(this);
        this.objMenu_paquetes.jButton3.addActionListener(this);
        this.objMenu_paquetes.jButton4.addActionListener(this);
        this.objMenu_paquetes.jComboBox1.addActionListener(this);
        this.objMenu_paquetes.jComboBox2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.objMenu_paquetes.jButton1 == e.getSource()){
            //escoger paquete 1//
        }
        if(this.objMenu_paquetes.jButton2 == e.getSource()){
            //escoger paquete 2//
        }
        if(this.objMenu_paquetes.jButton3 == e.getSource()){
            //atras//
        }
        if(this.objMenu_paquetes.jButton4 == e.getSource()){
            //comprar mas//
        }
        if(this.objMenu_paquetes.jComboBox1 == e.getSource()){
            
        }
        if(this.objMenu_paquetes.jComboBox2 == e.getSource()){
            
        }
    }
    
}