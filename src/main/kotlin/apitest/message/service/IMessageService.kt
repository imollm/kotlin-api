package apitest.message.service

import apitest.message.models.Message

interface IMessageService {
    fun all(): List<Message>
}