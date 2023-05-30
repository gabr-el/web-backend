package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Usuario;
import service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/usuario")
	public List<Usuario> getAllUsuarios() {
		return usuarioService.getAllUsuarios();
	}

	@PostMapping("/usuario")
	public void saveUsuario(@RequestBody Usuario usuario) {
		usuarioService.saveUsuario(usuario);
	}

	@DeleteMapping("/usuario/{id}")
	public void deleteUsuario(@PathVariable Integer id) {
		usuarioService.deleteUsuario(id);
	}

	@PutMapping("/usuario/{id}")
	public Usuario updateUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
		return usuarioService.updateUsuario(id, usuario);
	}

}
