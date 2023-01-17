package com.kotlin.leander.boilerplate.mapper.topico

import com.kotlin.leander.boilerplate.mapper.Mapper
import com.kotlin.leander.boilerplate.model.topico.Topico
import com.kotlin.leander.boilerplate.model.topico.TopicoCreateDto
import com.kotlin.leander.boilerplate.service.curso.CursoService
import com.kotlin.leander.boilerplate.service.usuario.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper (private val cursoService: CursoService,
                        private val usuarioService: UsuarioService,) : Mapper<TopicoCreateDto, Topico> {
    override fun map(t: TopicoCreateDto): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.getCursoById(t.curso.id),
            autor = usuarioService.getUserById(t.autor.id)
        )
    }


}
