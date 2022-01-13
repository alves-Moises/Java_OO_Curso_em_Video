
package aula5;
public class ContaBanco {
    public int numConta;
    private boolean cc;
    protected boolean cp;
    private boolean status;
    private String dono;
    private float saldo;

    void ContaBanco(String nome, String tipo) {
        this.dono = nome;
        this.saldo = 0;
        status = false;

        if("cc".equals(tipo)){
            this.cc = true; this.cp = false;
        }else{
            this.cc = false; this.cp = true;
        }
    }                     
    
    void abrirConta(String nome, int numconta, String tipoConta){
        //cc: + 50 no saldo 
        //cp: + 150 no saldo
        this.setDono(nome);
        this.setNumConta(numconta);
        this.setStatus(true);
        
        if("cc".equals(tipoConta)){
            this.setSaldo(50);
            this.cc = true; this.cp = false;
            System.out.println("Conta corrente aberta com sucesso.");
            
        }else{
            this.setSaldo(50);
            this.cp = true; this.cc = false;
            System.out.println("Conta poupança aberta com sucesso.");
        }
    }
    
    public void fecharConta(){
        // saldo precisa estar zerado
        // saldo sem débito *
        boolean regular = true;
        
        if(getSaldo() > 0){
            System.out.println("Não é possível realizar a operação pois há saldo em conta.");
            regular = false;
        }
        if(getSaldo() < 0){
            System.out.println("Não é possível fechar a conta pois há débito na conta.");
            regular = false;
        }
        if(regular){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");       
        }
    }
    
    public void sacar(float valor){
        //status precisa ser verdadeiro
        //saldoi precisa ser maior 
        if(this.status){
            if(valor >= getSaldo()){
                setSaldo(this.getSaldo() - valor);
                System.out.println("Você sacou: " + valor);
                System.out.println("Novo saldo: " + this.getSaldo());
            }
            else{
                System.out.println("Saldo insuficiente.");
            }
        }
        else{
            System.out.println("Não é possível realizar o saque, pois sua conta está desativada.");
        }
    }
    
    public void depositar(float valor){
       if(this.isStatus()){
           setSaldo(getSaldo() + valor);
           System.out.println("Você depositou: " + valor);
           System.out.println("Novo saldo: " + getSaldo());
       }else{
           System.out.print("Não é possível depositar. Sua conta está desativada.");
       }        
    }
    
    public void pagarMensalidade(){
        //paga 12 reais cc
        //paga 20 cp
        if (isStatus()){
            if(this.cc == true){
                setSaldo(getSaldo() - 12.0f);
            }else{
                setSaldo(getSaldo() - 20.0f);
            }
        }else{
            System.out.println("impossível pagar desativado.");
        }
    }

    // ========== Get ==================
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        String tipo;
        if (this.cc == true){
            tipo = "conta corrente";
        }else{
            tipo = "conta poupança";
        }
        return tipo;
    }
    
    public boolean isStatus() {
        return status;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }


    // ========= Set =============
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void estadoAtual() {
        System.out.println("============================");
        System.out.println("COnta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono : " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        
    }
}