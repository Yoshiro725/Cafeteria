package Controladores_yadhir;

import Vista.Reporte_platillo_popular;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorReporte_platillo_popular implements ActionListener{
    
    Reporte_platillo_popular objReporte_platillo_popular;

    public ControladorReporte_platillo_popular(Reporte_platillo_popular objReporte_platillo_popular) {
        this.objReporte_platillo_popular = objReporte_platillo_popular;
        this.objReporte_platillo_popular.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.objReporte_platillo_popular.jButton1 == e.getSource()){
            
        }
    }
    
}
