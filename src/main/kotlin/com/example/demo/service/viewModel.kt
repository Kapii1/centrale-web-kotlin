package com.example.demo.service

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.stereotype.Component

//@Component
//@Table("MESSAGES")
data class Message(val id: String?, val text: String)