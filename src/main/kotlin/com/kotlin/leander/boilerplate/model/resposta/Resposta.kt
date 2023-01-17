package com.kotlin.leander.boilerplate.model.resposta

import com.kotlin.leander.boilerplate.model.topico.Topico
import com.kotlin.leander.boilerplate.model.usuario.Usuario
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Resposta (
    @Id
    val id: String? = UUID.randomUUID().toString(),
    val mensagem: String? = null,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    @ManyToOne
    val autor: Usuario? = null,
    @ManyToOne
    val topico: Topico? = null,
    val solucao: Boolean? = null
        )