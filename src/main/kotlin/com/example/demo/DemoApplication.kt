package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import com.example.demo.service.Message
import com.example.demo.service.MessageService
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
@ComponentScan
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}


interface MessageRepository : CrudRepository<Message, String> {

	@Query("select * from messages")
	fun findMessages(): List<Message>
}




