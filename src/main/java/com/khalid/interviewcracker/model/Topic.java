package com.khalid.interviewcracker.model;

public class Topic {

    private String id;
    private String name;
    private int questionCount;

    public Topic() {
    }

    public Topic(String id, String name, int questionCount) {
        this.id = id;
        this.name = name;
        this.questionCount = questionCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }
}
