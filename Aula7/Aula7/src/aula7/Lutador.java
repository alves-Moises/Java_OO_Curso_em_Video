package aula7;
public class Lutador {
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int vitorias, derrotas, empates, idade;

    public Lutador(String nome, String nacionalidade, float altura, float peso, int idade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.setPeso(peso);  //fazer pelo set (???)
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
        
    public void apresentar(){
        System.out.println("Apresentando...");
        System.out.println("Nome: " + this.getNacionalidade());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("=======================");
    }
    
    public void status(){
        System.out.println("Nome: " + this.getNacionalidade());
        System.out.println("categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("=======================");
    }
    
    public void ganharLuta(){
        System.out.println(this.getNome() + "Ganhou a luta.");
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        System.out.println(this.getNome() + "Perdeu a luta.");
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatar(){
        System.out.println(this.getNome() + "empatou.");
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public int getIdade() {
        return idade;
    }
       
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        String cat;
        if(this.getPeso() < 52.2){
            cat = "Inválido";
        }else{
            if(this.getPeso() <= 70.3){
                cat = "Leve";
            }else{
                if(getPeso() <= 83.9){
                    cat = "Medio";
                }else{
                    if(getPeso() <= 120.2){
                        cat = "Pesado";
                    }else{
                        cat = "Inválido";
                    }
                }
            }
        }
        
        this.categoria = cat;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
