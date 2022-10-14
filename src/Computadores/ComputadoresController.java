/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Computadores;

/**
 *
 * @author HUMBERTO
 */
import DaoComputadores.DaoComputadores;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PERSONAL
 */
public class ComputadoresController implements DaoComputadores {
    
    private static ComputadoresController instancia;
    private String computadores[][];
    private int pComputador;
    
    public static ComputadoresController getInstance(){
        if(instancia == null)
            instancia = new ComputadoresController();
        return instancia;
    }
   
    private ComputadoresController (){
        this.computadores=new String[3][15];
        this.pComputador=0;
    }
    
    @Override 
    public boolean GuardarComputador (String pcomputador,String nmarca, String tcomputador){
        
        computadores[0][pComputador]=pcomputador;
        computadores[1][pComputador]=pcomputador;
        computadores[2][pComputador]=pcomputador;
        pComputador ++;

        return true;
    }
    
    @Override 
    public boolean GuardarComputador (String [] computador){
        computadores[0][pComputador]= computador[0];
        computadores[1][pComputador]= computador[1];
        computadores[2][pComputador]= computador[2];
        pComputador++;
        return true;
    }
    
   @Override
   public DefaultTableModel MostrarComputadores(){
       DefaultTableModel marca = new DefaultTableModel();
       
       // creamos los encabezados de la tabla
       marca.addColumn("codigo");
       marca.addColumn("marca");
       marca.addColumn("Tipo");
       
       // agregamos filas al modelo 
       
       for(int i=0;i<15;i++){
           String[] computador = new String [3];
           for (int j=0;j<3;j++){
               if (computadores[j][i] != null)
                   computador[j]=computadores[j][i];
           }
           marca.addRow(computador);
       }
       return marca;
   }
    @Override 
    public void ActualizarComputador(int codigo){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void EliminarComputador (int codigo){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    
   