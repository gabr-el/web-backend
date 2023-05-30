package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Usuario;
import repository.UsuarioRepository;

@Service
public class UsuarioServiceImplementation implements UsuarioService {
	@Autowired

	private UsuarioRepository usuarioRepository;

	@Override
	public void saveUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		return (List<Usuario>) usuarioRepository.findAll();
	}

	@Override
	public void deleteUsuario(Integer id) {
		usuarioRepository.deleteById(id);
	}

	@Override
	public Usuario updateUsuario(Integer id, Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
