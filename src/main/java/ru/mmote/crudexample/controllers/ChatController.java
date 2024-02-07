package ru.mmote.crudexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ru.mmote.crudexample.service.GptService;

@Controller
public class ChatController {

    @Autowired
    private GptService gptService;

    @GetMapping("/chat")
    public String showChatPage() {
        return "chat";
    }

    @PostMapping("/chat")
    public String chat(@RequestBody String question) {
        // Xử lý tin nhắn từ người dùng và nhận phản hồi từ bot
        String botResponse = gptService.generateResponse(question);

        // Trả về phản hồi từ bot
        return botResponse;
    }
}
