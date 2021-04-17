package reviso;

public class Cliente {
	// Propriedades ou atributos
	private String nome;
	private String estado;
	private double valorCompra;
	private double valorComDesconto;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}





	// Métodos
	double calcularDesconto(double percentualDesconto) {
		return valorCompra * percentualDesconto/100;
	}
}
