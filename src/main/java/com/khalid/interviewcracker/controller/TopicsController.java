package com.khalid.interviewcracker.controller;

import com.khalid.interviewcracker.model.Topic;
import com.khalid.interviewcracker.services.TopicsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    TopicsServices topicsServices;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicsServices.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicsServices.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicsServices.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicsServices.updateTopic(id, topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicsServices.deleteTopic(id);
    }

}
