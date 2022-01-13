package aula4;
public class Aula4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta("nic", "amarela", 0.4f);
//        c1.modelo = "abcd";
//        c1.setPonta(0.5f);
        //c1.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + "de ponta " + c1.getPonta());
    }
    
}
