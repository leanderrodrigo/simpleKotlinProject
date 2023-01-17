package com.kotlin.leander.boilerplate.repository.curso

import com.kotlin.leander.boilerplate.model.curso.Curso
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository : JpaRepository<Curso, String> {
}