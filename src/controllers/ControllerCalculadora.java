
/**
 *
 * @author Carina Amairani Díaz Ramírez
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelCalculadora;
import view.ViewCalculadora;
import extra.DataValidation;

public class ControllerCalculadora implements ActionListener {
    
     private ModelCalculadora modelMessage;
     private ViewCalculadora viewMessage;
     private DataValidation dataValidation = new DataValidation();

    public ControllerCalculadora(ModelCalculadora modelMessage, ViewCalculadora viewMessage) {
        this.modelMessage = modelMessage;
        this.viewMessage = viewMessage;
        
        this.viewMessage.jB_Suma.addActionListener(this);
        this.viewMessage.jB_Resta.addActionListener(this);
        this.viewMessage.jB_Multiplicacion.addActionListener(this);
        this.viewMessage.jB_Division.addActionListener(this);
        this.viewMessage.jB_Modulo.addActionListener(this);
        
        this.viewMessage.jB_Limpiar.addActionListener(this);
    }
    
    public void iniciar_vista(){
        viewMessage.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        modelMessage.setValor1(dataValidation.string2Double(viewMessage.jTF_Valor1.getText()));
        modelMessage.setValor2(dataValidation.string2Double(viewMessage.jTF_Valor2.getText()));
        
    if(e.getSource()==viewMessage.jB_Suma) modelMessage.sumar();
    if(e.getSource()==viewMessage.jB_Resta) modelMessage.restar();
    if(e.getSource()==viewMessage.jB_Multiplicacion) modelMessage.multiplicacion();
    if(e.getSource()==viewMessage.jB_Division) modelMessage.diviision();
    if(e.getSource()==viewMessage.jB_Modulo) modelMessage.modulo();
    if(e.getSource()==viewMessage.jB_Limpiar) ;
    
    viewMessage.jL_Total.setText(String.valueOf(modelMessage.getTotal()));
    
    if(e.getSource() == viewMessage.jB_Limpiar){
        viewMessage.jTF_Valor1.setText("");
        viewMessage.jTF_Valor2.setText("");
        viewMessage.jL_Total.setText("");
    }
   
    }
    
    private void initComponets() {
         viewMessage.setVisible(true);
        viewMessage.setVisible(true);
    }
}

