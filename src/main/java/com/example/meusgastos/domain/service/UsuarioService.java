    package com.example.meusgastos.domain.service;

    import com.example.meusgastos.dto.usuario.UsuarioRequestDto;
    import com.example.meusgastos.dto.usuario.UsuarioResponseDto;

    import java.util.List;

    public class UsuarioService implements ICRUDService<UsuarioRequestDto, UsuarioResponseDto> {

        @Override
        public List<UsuarioResponseDto> obterTodos() {
            return null;
        }

        @Override
        public UsuarioResponseDto obterPorId(Long id) {
            return null;
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