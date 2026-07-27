package exercicioLivro;

public class Livro {
	//instance fields	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private double preco;
	private int paginas;
	//Constructor
	public Livro(String titulo, String autor, int anoPublicacao, double preco, int paginas) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAnoPublicacao(anoPublicacao);
		this.setPreco(preco);
		this.setPaginas(paginas);
	}
	
	// GETTERS E SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public double calcularPrecoPorPagina() {
		if (this.paginas > 0) {
			return this.preco / this.paginas;
		}
		return 0.0; // Evita divisão por zero
	}
	
	@Override
	public String toString() {
		return String.format("%s | Autor: %s | Ano: %d | Preço: R$%.2f | Páginas: %d",
				titulo, autor, anoPublicacao, preco, paginas);
	}
	
	

}
