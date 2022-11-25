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
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
 

/**
 *
 * 
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
        this.computadores=new String[5][100];
        this.pComputador=0;
    }
    
    @Override 
    public boolean GuardarComputador (String pcomputador,String ncomputador,String acomputador, String tcomputador){
        
        computadores[0][pComputador]=pcomputador;
        computadores[1][pComputador]=ncomputador;
        computadores[2][pComputador]=acomputador;
        computadores[3][pComputador]=tcomputador;
        pComputador ++;

        return true;
    }
    
    @Override 
    public boolean GuardarComputador (String [] computador){
        computadores[0][pComputador]= computador[0];
        computadores[1][pComputador]= computador[1];
        computadores[2][pComputador]= computador[2];
        computadores[3][pComputador]= computador[3];
        pComputador++;
        return true;
    }
    
   
    @Override
   public DefaultTableModel MostrarComputadores(){
       DefaultTableModel marca = new DefaultTableModel();
       
       // creamos los encabezados de la tabla
       marca.addColumn("codigo");
       marca.addColumn("marca");
       marca.addColumn("accesorios");
       marca.addColumn("tipo");
       
       // agregamos filas al modelo 
       
       for(int i=0;i<15;i++){
           String[] computador = new String [4];
           for (int j=0;j<4;j++){
               if (computadores[j][i] != null)
                   computador[j]=computadores[j][i];
           }
           marca.addRow(computador);
       }
       return marca;
   }

    @Override
     public boolean ActualizarComputador(String[] computador) {
        int fila=0;
        for(int i=0;i<pComputador;i++){
            if(computadores[0][i]==computador[0]){
                fila=i;
                break;
            }
        }
        computadores[0][fila]=computador[0];
        computadores[1][fila]=computador[1];
        computadores[2][fila]=computador[2];
        computadores[3][fila]=computador[3];
        return true;
    }
    
    @Override
    public void EliminarComputador (int codigo){
        
         if( pComputador>=1)
       {
            
            int seleccion = JOptionPane.showConfirmDialog(null," desea eliminar: "+computadores[1][codigo], "",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            System.out.println(seleccion);
            if(seleccion==0)
            {
                for (int i=codigo;i<100;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                
                        if(computadores[j][i] !=null)
                        {
                            computadores[j][i]=computadores[j][codigo+1];   
                        }         
                    }
                    codigo++;            
                }
                pComputador--;
                JOptionPane.showMessageDialog(null,"se ha eliminado la compra");
            }       
       }      
       else
       {
            JOptionPane.showMessageDialog(null, "no computadores por eliminar");   
        }
    }
    @Override
    public boolean GuardarArchivo() {
        FileWriter fw;
        String datos="";
        boolean gDatos=false;
        
        for(int i=0;i<pComputador;i++){
            
            for(int j=0;j<4;j++){
                
                if(computadores[j][i] != null)
                    datos+=computadores[j][i]+"-";
            }
            datos+="\n";
        }
        
        try{
            JFileChooser guardar = new JFileChooser();
            guardar.showSaveDialog(null);
            guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            //String archivo = ""+guardar.getSelectedFile();
            String ruta = ""+guardar.getCurrentDirectory();
            String nombre = guardar.getSelectedFile().getName();
            
            fw=new FileWriter(ruta+"\\"+nombre+".txt");
            fw.write(datos);
            fw.close();
            gDatos=true;
        } catch (IOException ex) {
            Logger.getLogger(ComputadoresController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gDatos;
        
    }

   

    
}

    

      