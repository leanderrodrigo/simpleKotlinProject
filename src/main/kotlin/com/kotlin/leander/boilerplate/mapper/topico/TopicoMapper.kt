package com.kotlin.leander.boilerplate.mapper.topico

import com.kotlin.leander.boilerplate.mapper.Mapper
import com.kotlin.leander.boilerplate.model.topico.Topico
import com.kotlin.leander.boilerplate.model.topico.TopicoViewDto
import org.springframework.stereotype.Component

@Component
class TopicoMapper : Mapper<Topico, TopicoViewDto> {
    override fun map(t: Topico): TopicoViewDto {
       return TopicoViewDto(
            id = t.id,
            titulo = t.titulo!!,
            mensagem = t.mensagem!!
        )
    }

}