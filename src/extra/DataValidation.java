/**
 *
 * @author Ami
 */
package extra;

import javax.swing.JOptionPane;

public class DataValidation {
    
    public int string2Int(String value){
    
    int result = 0;
        try{
            result = Integer.parseInt(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
        }
        return result;
}
     public int string2Float(String value){
    
    int result = 0;
        try{
            result = Integer.parseInt(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
        }
        return result;
}
      public int string2Double(String value){
    
    int result = 0;
        try{
            result = Integer.parseInt(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
        }
        return result;
}
}
