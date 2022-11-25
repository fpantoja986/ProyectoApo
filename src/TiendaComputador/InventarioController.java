/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TiendaComputador;

import DaoComputadores.DaoInventario;

/**
 *
 * @author HUMBERTO
 */
public class InventarioController  implements DaoInventario{

    private static InventarioController instancia;

    private InventarioController() {
    }
    
    public static InventarioController getInstancia(){
        if(instancia==null){
            instancia=new InventarioController();
        }
        return instancia;
    }
    
    @Override
    public int Inventario(String[][] computadores) {
        int ganador;
        if(Integer.parseInt(computadores[5][0]) > Integer.parseInt(computadores[5][1])){
            ganador=0;
        }else{
            ganador=1;
        }
        return ganador;
    }

}
