package com.stud.springai.model;

public class Question {
    String question;
    String responseType; // text / json

    public Question() {
    }

    public Question(String question, String responseType) {
        this.question = question;
        this.responseType = responseType;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
}
