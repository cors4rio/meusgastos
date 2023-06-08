    package com.example.meusgastos.domain.repository;

    import com.example.meusgastos.domain.model.Usuario;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        List<Usuario> findByEmail(String email);

    }
