package Controladores_yadhir;

import Vista.Reporte_ingresos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorReporte_ingresos implements ActionListener{
    
    Reporte_ingresos objReporte_ingresos;

    public ControladorReporte_ingresos(Reporte_ingresos objReporte_ingresos) {
        this.objReporte_ingresos = objReporte_ingresos;
        this.objReporte_ingresos.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.objReporte_ingresos.jButton1 == e.getSource()){
            
        }
    }
    
}
