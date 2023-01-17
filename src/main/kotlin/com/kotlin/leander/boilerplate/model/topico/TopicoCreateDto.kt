package com.kotlin.leander.boilerplate.model.topico

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size


data class TopicoCreateDto(
    @field:NotEmpty(message = "field: Titulo can't be empty")
    @field:Size(min = 5, max = 100)
    val titulo: String,
    @field:NotEmpty(message = "field: Mensagem can't be empty")
    @field:Size(min = 5, max = 100)
    val mensagem: String,
    val autor: AuthorDto,
    val curso: CursoDto
)

data class AuthorDto(
    @field:NotEmpty(message = "field: id can't be empty")
    @field:Size(min = 1, max = 100)
    val id: String
)

data class CursoDto(
    @field:NotEmpty(message = "field: id can't be empty")
    @field:Size(min = 1, max = 100)
    val id: String
)