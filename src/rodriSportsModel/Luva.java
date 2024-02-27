package rodriSportsModel;

public class Luva extends Material {

	private String marca;
	private String localUso;
	private int tamanho;

	public Luva(int id, int tipoMaterial, String nomeMaterial, String dataFabricacao, float preco) {
		super(id, tipoMaterial, nomeMaterial, dataFabricacao, preco);

	}

	public void buscar() {

		super.buscar();
		System.out.println("Qual é a marca do material?  " + this.marca);
		System.out.println("Qual o local indicado para uso? " + this.localUso);
		System.out.println("Qual o tamanho do material? " + this.tamanho);
	}

}
