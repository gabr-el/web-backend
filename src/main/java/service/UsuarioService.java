package service;

import model.Usuario;

public interface UsuarioService {
	void saveUsuario(Usuario usuario);

	public java.util.List<Usuario> getAllUsuarios();

	void deleteUsuario(Integer id);

	Usuario updateUsuario(Integer id, Usuario usuario);
}
