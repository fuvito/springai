package com.stud.springai.services;



import com.stud.springai.model.Question;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OpenAiServiceImpl implements OpenAiService{

    private final ChatModel chatModel;

    @Value("classpath:templates/get-capital-with-info.st")
    private Resource getCapitalWithInfoResource;

    public OpenAiServiceImpl(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @Override
    public String getAnswer(Question question) {
        PromptTemplate promptTemplate = new PromptTemplate(question.getQuestion());
        Prompt prompt = promptTemplate.create();

        ChatResponse chatResponse = chatModel.call(prompt);

        return chatResponse.getResult().getOutput().getContent();
    }

    @Override
    public String getCapitalWithInfo(Question question) {
        PromptTemplate promptTemplate = new PromptTemplate(getCapitalWithInfoResource);
        Prompt prompt = promptTemplate.create(Map.of("stateOrCountry", question.getQuestion()));

        ChatResponse chatResponse = chatModel.call(prompt);

        return chatResponse.getResult().getOutput().getContent();
    }


}
