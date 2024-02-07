package ru.mmote.crudexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mmote.crudexample.entity.Interaction;

@Service
public class ChatService {

    @Autowired
    private GptService gptService;

    @Autowired
    private InteractionService interactionService;

    public String getResponse(String userMessage) {
        // Gọi phương thức generateResponse của GPTService để lấy câu trả lời từ mô hình GPT
        String response = gptService.generateResponse(userMessage);

        // Lưu lại tương tác giữa người dùng và hệ thống
        interactionService.saveInteraction(new Interaction(userMessage, response));

        return response;
    }
}


