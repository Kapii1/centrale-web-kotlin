package com.example.demo.service

import com.example.demo.MessageRepository
import com.example.demo.service.Message
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }
}
