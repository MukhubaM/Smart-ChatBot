package com.springboot.smartchatbot.controller;

import com.springboot.smartchatbot.dto.PromptRequest;
import com.springboot.smartchatbot.service.ChatGPTService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/chat")
public class ChatGPTController {

    private final ChatGPTService chatGPTService;

    public ChatGPTController(ChatGPTService chatGPTService){
        this.chatGPTService = chatGPTService;
    }

    @PostMapping
    public String chat(@RequestBody PromptRequest promptRequest){
        return chatGPTService.getChatResponse(promptRequest);
    }
}
