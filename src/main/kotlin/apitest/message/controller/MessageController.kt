package apitest.message.controller

import apitest.message.models.Message
import apitest.message.service.IMessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource (private val messageService : IMessageService) {

    @GetMapping("/api/v1/hello")
    fun index(): List<Message> {
        return messageService.all()
    }
}