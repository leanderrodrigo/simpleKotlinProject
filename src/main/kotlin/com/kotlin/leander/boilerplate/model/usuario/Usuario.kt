package com.kotlin.leander.boilerplate.model.usuario

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Usuario(
    @Id
    val id: String? = UUID.randomUUID().toString(),
    val nome: String? = null,
    val email: String? = null
    )
