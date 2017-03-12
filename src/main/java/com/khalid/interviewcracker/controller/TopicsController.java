package com.khalid.interviewcracker.controller;

import com.khalid.interviewcracker.model.Topic;
import com.khalid.interviewcracker.services.TopicsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    TopicsServices topicsServices;

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicsServices.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicsServices.getTopic(id);
    }

}
