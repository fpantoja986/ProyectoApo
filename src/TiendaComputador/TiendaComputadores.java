/*

 */
package TiendaComputador;

import ComputadoresVista.AgregarComputador;
import MenuPrincipal.MenuPrincipal;

/**
 *
 * @author HUMBERTO
 */
public class TiendaComputadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //validaciones de textto
        AgregarComputador form =new  AgregarComputador();
        form.setVisible(true);
        
        MenuPrincipal menuprincipal = MenuPrincipal.getInstance();
        menuprincipal.setVisible(true);
    }
    
}


