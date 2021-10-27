package com.example.demo.controller

import com.example.demo.service.Message
import com.example.demo.service.MessageService
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("messages")
class  MessageController (val service: MessageService)

{	@GetMapping
    fun index(): List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}