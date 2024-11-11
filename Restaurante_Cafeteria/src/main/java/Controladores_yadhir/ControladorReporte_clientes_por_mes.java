package Controladores_yadhir;

import Vista.Reporte_clientes_por_mes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorReporte_clientes_por_mes implements ActionListener{
    
    Reporte_clientes_por_mes objReporte_clientes_por_mes;

    public ControladorReporte_clientes_por_mes(Reporte_clientes_por_mes objReporte_clientes_por_mes) {
        this.objReporte_clientes_por_mes = objReporte_clientes_por_mes;
        this.objReporte_clientes_por_mes.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.objReporte_clientes_por_mes.jButton1 == e.getSource()){
            
        }
    }
    
}