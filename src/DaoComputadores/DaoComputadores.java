/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DaoComputadores;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUMBERTO
 */
public interface DaoComputadores {
    
    public boolean GuardarComputador (String pComputador, String nMarca,String aAccesorios, String tComputador );
    // pvehiculo = placa del vehiculo 
    public boolean GuardarComputador (String[]vehiculo);
    public DefaultTableModel MostrarComputadores ();
    public void ActualizarComputador (int codigo);
    public void EliminarComputador (int codigo);    
    
    
}
