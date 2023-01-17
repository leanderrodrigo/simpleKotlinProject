package com.kotlin.leander.boilerplate.controller.topico

import com.kotlin.leander.boilerplate.model.topico.TopicoCreateDto
import com.kotlin.leander.boilerplate.model.topico.TopicoUpdateDto
import com.kotlin.leander.boilerplate.model.topico.TopicoViewDto
import com.kotlin.leander.boilerplate.service.topico.TopicoService
import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import org.springframework.data.domain.Pageable
import javax.transaction.Transactional
import javax.validation.Valid

@RestController()
@RequestMapping("/topicos", produces = [MediaType.APPLICATION_JSON_VALUE])
class TopicoController(private val topicoService: TopicoService) {

    @GetMapping()
    fun listTopicos(
        @RequestParam(required = false) cursoName: String?,
        pagination: Pageable
    ): Page<TopicoViewDto> {
        return topicoService.listTopico(cursoName, pagination)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): TopicoViewDto {
        return topicoService.getById(id)
    }

    @PostMapping()
    @Transactional
    fun createTopico(
        @RequestBody @Valid body: TopicoCreateDto,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<TopicoViewDto> {
        val topicoView = topicoService.createTopico(body)
        val uri = uriBuilder.path("/topicos/${topicoView.id}").build().toUri()
        return ResponseEntity.created(uri).body(topicoView)
    }

    @PutMapping()
    @Transactional
    fun updateTopico(
        @RequestBody @Valid body: TopicoUpdateDto,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<TopicoViewDto> {
        val topicoView = topicoService.updateTopico(body)
        val uri = uriBuilder.path("/topicos/${topicoView.id}").build().toUri()
        return ResponseEntity.created(uri).body(topicoView)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    fun deleteTopico(@PathVariable id: String) {
        return topicoService.deleteTopico(id)
    }


}