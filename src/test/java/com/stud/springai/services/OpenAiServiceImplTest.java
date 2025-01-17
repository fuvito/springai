package com.stud.springai.services;

import com.stud.springai.model.Question;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpenAiServiceImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpenAiServiceImplTest.class);

    @Autowired
    private OpenAiServiceImpl openAiService;

    @Test
    void getAnswer() {
        Question question = new Question("what is the capital of Turkiye?", "text");
        String answer = openAiService.getAnswer(question);

        assertNotNull(answer);
        LOGGER.info("Here is the answer: " + answer);
    }

    //@Test
    void getAnswerForDistance() {
        Question question = new Question("What is the walking distance between Union City, CA and Ankara, Turkiye?", "text");
        String answer = openAiService.getAnswer(question);

        assertNotNull(answer);
        LOGGER.info("Here is the answer: " + answer);
    }
}
