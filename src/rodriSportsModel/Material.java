package rodriSportsModel;

public abstract class Material {

	private int id;
	private int tipoMaterial;
	private String nomeMaterial;
	private String dataFabricacao;
	private float preco;

	public Material(int id, int tipoMaterial, String nomeMaterial, String dataFabricacao, float preco) {
		this.id = id;
		this.tipoMaterial = tipoMaterial;
		this.nomeMaterial = nomeMaterial;
		this.dataFabricacao = dataFabricacao;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(int tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getNomeMaterial() {
		return nomeMaterial;
	}

	public void setNomeMaterial(String nomeMaterial) {
		this.nomeMaterial = nomeMaterial;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void buscar() {

		switch (this.tipoMaterial) {
		case 1:
			tipoMaterial = 1;
			break;
		case 2:
			tipoMaterial = 2;
			break;
		case 3:
			tipoMaterial = 3;
			break;

		default:
			System.out.println("Digite um tipo valido de material (1, 2 ou 3) ");
		}

		System.out.println(":::::::::::::::::::::::::::::::");
		System.out.println("Dados do material");
		System.out.println(":::::::::::::::::::::::::::::::");
		System.out.println("Numero da conta: " + this.id);
		System.out.println("Numero da conta: " + this.dataFabricacao);
		System.out.println("Agência da conta: " + this.tipoMaterial);
		System.out.println("Tipo da conta: " + nomeMaterial);
		System.out.println("Titular da conta: " + this.preco);
	}

}
