package com.kotlin.leander.boilerplate.repository.usuario

import com.kotlin.leander.boilerplate.model.usuario.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario,String>{
}