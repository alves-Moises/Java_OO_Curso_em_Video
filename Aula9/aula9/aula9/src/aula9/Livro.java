package aula9;

public class Livro implements Publicacao {
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		Autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	String titulo, Autor;
	int totPaginas, pagAtual;
	boolean aberto;
	Pessoa leitor;
	
	
	public String detalhes() {
		return "Livro \n[titulo=" + titulo + "\n, Autor=" + Autor + ", \ntotPaginas=" + totPaginas + ", \npagAtual=" + pagAtual
				+ ", \naberto=" + aberto + ", \nleitor=" + leitor.getNome() + "]";
	}


	@Override
	public void abrir() {
		this.aberto = true;
	}


	@Override
	public void fechar() {	
		this.aberto = false;
	}


	@Override
	public void folhear(int p) {
		if(p > this.totPaginas) {
		this.pagAtual = p;
		}else {
			System.out.println("Página não existe");
		}
	}


	@Override
	public void avancarPag() {
		this.pagAtual++;
	}


	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
	
	
	
	
	
}
