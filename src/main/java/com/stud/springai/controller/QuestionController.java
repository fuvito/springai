package com.stud.springai.controller;

import com.stud.springai.model.Question;
import com.stud.springai.services.OpenAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    private final OpenAiService aiService;

    public QuestionController(OpenAiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/ask")
    public String ask(@RequestBody Question question) {
        return aiService.getAnswer(question);
    }

    @GetMapping("/capital")
    public String getCapitalWithInfo(@RequestBody Question question) {
        return aiService.getCapitalWithInfo(question);
    }
}
