package aula5;
public class Aula5 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("jubb", 1111, "cc");
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("ASDASD", 222, "cp");
        p2.estadoAtual();

        p1.depositar(100);
        p2.depositar(500);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p1.sacar(150);
        p1.fecharConta();
    }
    
}
