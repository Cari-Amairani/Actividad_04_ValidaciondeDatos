
/**
 *
 * @author Carina Amairani Díaz Ramírez 
 */

package main;

import model.ModelCalculadora;
import view.ViewCalculadora;
import controllers.ControllerCalculadora;

public class MainCalculadora {
    
    
    public static void main(String[] args) {
        
        ModelCalculadora modelMessage = new ModelCalculadora();
        ViewCalculadora viewMessage = new ViewCalculadora();
        ControllerCalculadora controllersMessage = new ControllerCalculadora(modelMessage, viewMessage);
        
        controllersMessage.iniciar_vista();
        viewMessage.setVisible(true);
       
    
    }
    
}

