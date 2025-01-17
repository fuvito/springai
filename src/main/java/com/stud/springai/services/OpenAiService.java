package com.stud.springai.services;

import com.stud.springai.model.Question;

public interface OpenAiService {
    String getAnswer(Question question);

    String getCapitalWithInfo(Question question);
}
