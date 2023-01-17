package com.kotlin.leander.boilerplate.model.topico

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class TopicoUpdateDto (
    @field:NotEmpty
    val id: String,
    @field:NotEmpty @field:Size(min = 5, max = 100)
    val titulo: String,
    @field:NotEmpty @field:Size(min = 5, max = 100)
    val mensagem: String,
)