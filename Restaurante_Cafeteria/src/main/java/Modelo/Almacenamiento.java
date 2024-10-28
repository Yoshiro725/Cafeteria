/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author gokum
 */
public interface Almacenamiento {
        
    public void Create();
    
    public ArrayList Read();
    
    public void Update();
    
    public void Delete();
}
