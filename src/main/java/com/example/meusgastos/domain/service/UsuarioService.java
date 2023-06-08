    package com.example.meusgastos.domain.service;

    import com.example.meusgastos.domain.model.Usuario;
    import com.example.meusgastos.domain.repository.UsuarioRepository;
    import com.example.meusgastos.dto.usuario.UsuarioRequestDto;
    import com.example.meusgastos.dto.usuario.UsuarioResponseDto;
    import org.modelmapper.ModelMapper;
    import org.springframework.beans.factory.annotation.Autowired;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Optional;

    public class UsuarioService implements ICRUDService<UsuarioRequestDto, UsuarioResponseDto> {

        @Autowired
           private UsuarioRepository usuarioRepository;

        @Autowired
        private ModelMapper mapper;

        @Override
        public List<UsuarioResponseDto> obterTodos() {

            List<Usuario> usuarios = usuarioRepository.findAll();
            List<UsuarioResponseDto> usuariosDto = new ArrayList<>();

            for (Usuario usuario : usuarios) {
                usuariosDto.add(mapper.map(usuario, UsuarioResponseDto.class));
            }
            return usuariosDto;
        }

        @Override
        public UsuarioResponseDto obterPorId(Long id) {
            Optional<Usuario> optUsuario = usuarioRepository.findById(id);

            if (optUsuario.isEmpty()) {
            }
            return mapper.map(optUsuario.get(), UsuarioResponseDto.class);
        }

        @Override
        public UsuarioResponseDto cadastrar(UsuarioRequestDto dto) {
            return null;
        }

        @Override
        public UsuarioResponseDto atualizar(Long id, UsuarioRequestDto dto) {
            return null;
        }

        @Override
        public void deletar(Long id) {

        }
    }
