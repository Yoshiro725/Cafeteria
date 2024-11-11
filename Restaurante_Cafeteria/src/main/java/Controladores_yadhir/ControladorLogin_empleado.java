package Controladores_yadhir;

import Vista.Login_empleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin_empleado implements ActionListener{
    
    Login_empleado objLogin_empleado;

    public ControladorLogin_empleado(Login_empleado objLogin_empleado) {
        this.objLogin_empleado = objLogin_empleado;
        this.objLogin_empleado.jButton1.addActionListener(this);
        this.objLogin_empleado.jButton2.addActionListener(this);
        this.objLogin_empleado.jPasswordField1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.objLogin_empleado.jButton1 == e.getSource()){
            //boton de regresar//
            
        }
        if(this.objLogin_empleado.jButton2 == e.getSource()){
            //boton de aceptar//
            
        }
        if(this.objLogin_empleado.jPasswordField1 == e.getSource()){
            //contraseña//
        }
    }
    
}
