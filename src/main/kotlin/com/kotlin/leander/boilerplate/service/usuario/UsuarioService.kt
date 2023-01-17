package com.kotlin.leander.boilerplate.service.usuario

import com.kotlin.leander.boilerplate.model.usuario.Usuario
import com.kotlin.leander.boilerplate.repository.usuario.UsuarioRepository
import org.springframework.stereotype.Service
import kotlin.collections.ArrayList

@Service
class UsuarioService(
    private var usuarioRepository: UsuarioRepository
) {

    fun getUserById(id: String): Usuario {
        return usuarioRepository.getReferenceById(id)
    }
}