package com.kotlin.leander.boilerplate.repository.topico

import com.kotlin.leander.boilerplate.model.topico.Topico
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface TopicoRepository : JpaRepository<Topico, String> {

    fun findByCursoNome(cursoName: String, pagination: Pageable) : Page<Topico>
}