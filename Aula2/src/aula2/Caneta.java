package aula2;
/**
 *
 * @author moise
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    boolean tampada;
    
    
    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
                
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Nõa posso rabiscar");
        }else{
            System.out.println("Estou rabiscando...");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
}
