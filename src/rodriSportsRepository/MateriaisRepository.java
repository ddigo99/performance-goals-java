package rodriSportsRepository;

import rodriSportsModel.Material;

public interface MateriaisRepository {
	
		public void buscarPorId(int id);
		public void listarTodosMateriais();
		public void cadastrarMaterial(Material material);
		public void atualizarMaterial(Material material);
		public void deletarMaterial(Material material);

	}

