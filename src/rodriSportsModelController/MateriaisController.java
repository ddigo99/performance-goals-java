package rodriSportsModelController;

import java.util.ArrayList;

import rodriSportsModel.Material;
import rodriSportsRepository.MateriaisRepository;

public class MateriaisController implements MateriaisRepository {

	private ArrayList<Material> listaMateriais = new ArrayList<Material>();
	int id = 0;

	public Material buscarNaCollection(int id) {

		for (Material material : listaMateriais) {
			if (material.getId() == id) {
				return material;
			}
		}
		return null;
	}

	@Override
	public void buscarPorId(int id) {
		Material material = buscarNaCollection(id);

		if (material == null) {
			material.buscar();
		} else
			System.out.println("O material de ID " + material + "não foi encontrado!");

	}

	@Override
	public void listarTodosMateriais() {
		for (Material material : listaMateriais)
			material.buscar();

	}

	@Override
	public void cadastrarMaterial(Material material) {
		listaMateriais.add(material);
		System.out.println("O material de ID: " + material.getId() + " foi criado com sucesso!");
	};

	@Override
	public void atualizarMaterial(Material material) {
		var materialBuscado = buscarNaCollection(material.getId());

		if (materialBuscado != null) {
			listaMateriais.set(listaMateriais.indexOf(materialBuscado), material);
			System.out.println("O material de ID: " + material.getId() + " foi atualizado com sucesso!");
		} else
			System.out.println("O material de ID: " + material.getId() + " não foi encontrado!");

	};

	@Override
	public void deletarMaterial(int id) {

		Material material = buscarNaCollection(id);

		if (material != null) {

			if (listaMateriais.remove(material) == true)
				System.out.println("O material de ID:  " + material + " foi deletado com sucesso! ");
		} else

			System.out.println("O material de ID: " + material + " não foi encontrado!");

	}

	@Override
	public void deletarMaterial(Material material) {
		// TODO Auto-generated method stub
		
	};

	// public int gerarId() {

	// return ++id;
	// }
}
