package com.kotlin.leander.boilerplate.service.curso

import com.kotlin.leander.boilerplate.model.curso.Curso
import com.kotlin.leander.boilerplate.repository.curso.CursoRepository
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class CursoService(private var cursoRepository: CursoRepository) {

    fun getCursoById(id: String): Curso {
        return cursoRepository.getReferenceById(id)
    }

}