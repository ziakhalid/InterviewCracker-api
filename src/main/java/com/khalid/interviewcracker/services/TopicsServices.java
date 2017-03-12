package com.khalid.interviewcracker.services;

import com.khalid.interviewcracker.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicsServices {

    private List<Topic> topicList = Arrays.asList(new Topic("1", "topic1", 25),
            new Topic("2", "topic2", 25),
            new Topic("3", "topic3", 25),
            new Topic("4", "topic4", 25));


    public List<Topic> getAllTopics(){
        return topicList;
    }

    public Topic getTopic(String id){
       return topicList.stream().filter(it -> it.getId().equals(id)).findFirst().get();
    }

}
