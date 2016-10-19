
package Funcionalidad;

import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Archivo {
    
    public void abrir()    {
        JFileChooser selector_a = new JFileChooser();
        selector_a.showOpenDialog(selector_a);
        String ruta = selector_a.getSelectedFile().getAbsolutePath();
        
        try
        {
           FileReader lector_a = new FileReader(ruta);
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"error"+ e);
        }
    }
    
    public void salir()    {
        System.exit(0);
    }
    
}
