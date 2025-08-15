package com.chat.app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.chat.app.model.ChatMessage;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ChatController {

    @MessageMapping("/sendMessage") //process message to destination
    @SendTo("/topic/messages") //endpoint of ChatMessage content
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
    

}
