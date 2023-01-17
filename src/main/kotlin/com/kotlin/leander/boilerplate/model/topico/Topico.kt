package com.kotlin.leander.boilerplate.model.topico


import com.kotlin.leander.boilerplate.model.curso.Curso
import com.kotlin.leander.boilerplate.model.resposta.Resposta
import com.kotlin.leander.boilerplate.model.usuario.Usuario
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
data class Topico(
    @Id
    val id: String? = UUID.randomUUID().toString(),

    var titulo: String? = null,
    var mensagem: String? = null,
    val dataCriacao: LocalDateTime? = LocalDateTime.now(),
    @ManyToOne
    val curso: Curso? = null,
    @ManyToOne
    val autor: Usuario? = null,
    @Enumerated(value = EnumType.STRING)
    val status: StatusTopico = StatusTopico.NAO_RESPONDIDO,
    @OneToMany(mappedBy = "topico")
    val respostas: List<Resposta>? = ArrayList()
)