package com.kotlin.leander.boilerplate.model.curso

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Curso(
    @Id
    val id: String? = UUID.randomUUID().toString(),
    val nome: String? = null,
    val categoria: String? = null
)