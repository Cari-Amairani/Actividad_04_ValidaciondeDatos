
package model;

/**
 *
 * @author Carina Amairani Dáz Rmaírez 
 */
public class ModelCalculadora {
    
     private float valor1=0;
    private float valor2=0;
    private float total=0;

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
   public float sumar(){
       this.total = this.valor1 + this.valor2;
       return this.total;
   }
    
    public float restar(){
       this.total = this.valor1 - this.valor2;
       return this.total;
   }
    
     public float multiplicacion(){
       this.total = this.valor1 * this.valor2;
       return this.total;
   }
    
      public float diviision(){
       this.total = this.valor1 / this.valor2;
       return this.total;
   }
    
       public float modulo(){
       this.total = this.valor1 % this.valor2;
       return this.total;
   }
}
