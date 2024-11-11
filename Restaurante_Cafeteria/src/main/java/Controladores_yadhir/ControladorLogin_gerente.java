package Controladores_yadhir;

import Vista.Login_gerente;
import Vista.Login_principal;
import Vista.Vista_reportes_basicos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin_gerente implements ActionListener{
    
    Login_gerente objLogin_gerente;

    public ControladorLogin_gerente(Login_gerente objLogin_gerente) {
        this.objLogin_gerente = objLogin_gerente;
        this.objLogin_gerente.jButton1.addActionListener(this);
        this.objLogin_gerente.jButton2.addActionListener(this);
        this.objLogin_gerente.jPasswordField1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.objLogin_gerente.jButton1 == e.getSource()){
            //boton de regresar//
            new Login_principal().setVisible(true);
            this.objLogin_gerente.dispose();
        }
        if(this.objLogin_gerente.jButton2 == e.getSource()){
            //boton de aceptar//
            new Vista_reportes_basicos().setVisible(true);
            this.objLogin_gerente.dispose();
        }
        if(this.objLogin_gerente.jPasswordField1 == e.getSource()){
            //contraseña//
        }
    }
    
}
