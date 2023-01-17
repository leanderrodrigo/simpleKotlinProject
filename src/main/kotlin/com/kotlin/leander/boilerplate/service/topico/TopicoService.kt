package com.kotlin.leander.boilerplate.service.topico

import com.kotlin.leander.boilerplate.exceptions.NotFoundException
import com.kotlin.leander.boilerplate.mapper.topico.TopicoFormMapper
import com.kotlin.leander.boilerplate.mapper.topico.TopicoMapper
import com.kotlin.leander.boilerplate.model.topico.TopicoCreateDto
import com.kotlin.leander.boilerplate.model.topico.TopicoUpdateDto
import com.kotlin.leander.boilerplate.model.topico.TopicoViewDto
import com.kotlin.leander.boilerplate.repository.topico.TopicoRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoService(
    private val topicoRepository: TopicoRepository,
    private val topicoMapper: TopicoMapper,
    private val topicoFormMapper: TopicoFormMapper
) {

    fun listTopico(cursoName: String?, pagination: Pageable): Page<TopicoViewDto> {
        val topicos = if (cursoName == null){
            topicoRepository.findAll(pagination)
        }else {
            topicoRepository.findByCursoNome(cursoName, pagination)
        }
        return topicos.map { t ->
            topicoMapper.map(t)
        }

    }

    fun getById(id: String): TopicoViewDto {
        return topicoRepository.findById(id).orElseThrow { NotFoundException("Topico wasn't found") }
            .let { t ->
                topicoMapper.map(t)
            }
    }

    fun createTopico(dto: TopicoCreateDto): TopicoViewDto {
        val topico = topicoFormMapper.map(dto)
        topicoRepository.save(topico)
        return topicoMapper.map(topico)
    }

    fun updateTopico(dto: TopicoUpdateDto): TopicoViewDto {
        val topico = topicoRepository.findById(dto.id).orElseThrow { NotFoundException("Topico wasn't found") }
        topico.titulo = dto.titulo
        topico.mensagem = dto.mensagem
        topicoRepository.save(topico)
        return topicoMapper.map(topico)
    }

    fun deleteTopico(id: String) {
        topicoRepository.deleteById(id)
    }
}