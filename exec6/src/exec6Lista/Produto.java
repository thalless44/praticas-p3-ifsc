package exec6Lista;

public class Produto {
	private String fabricante;
	private Long codBarras;
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Long getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(int i) {
		this.codBarras = (long) i;
	}

}
