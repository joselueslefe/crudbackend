package com.exemplo.crudbackend.service;

import com.exemplo.crudbackend.model.Usuario;
import com.exemplo.crudbackend.repository.UsuarioRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService (UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> ListarTodos() {
        return repository.findAll();
    }

    public Optional<Usuario> BuscarPorId(Long id) {
        return repository.findById(id);
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario deletar(Long id) {
        repository.deleteById(id);
        return null;
    }
}
