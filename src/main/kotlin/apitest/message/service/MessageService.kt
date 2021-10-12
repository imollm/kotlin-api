package apitest.message.service

import apitest.message.models.Message
import org.springframework.stereotype.Service

@Service
class MessageService : IMessageService {
    val messages: List<Message> = listOf(
        Message("1", "Hello!"),
    )

    override fun all(): List<Message> {
        return messages
    }
}