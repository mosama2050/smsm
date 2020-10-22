package com.smsm.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private  TopicsServies topicsServies;

    @RequestMapping("/topics")
    public List<Topic> getAllTopic(){
        return  topicsServies.GetTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id) {
        return topicsServies.GetTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST , value = "/topics")
    public  void  AddTopic(@RequestBody Topic topic){
        topicsServies.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
    public  void  updateTopic(@RequestBody Topic topic ,@PathVariable String id ){
        topicsServies.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
    public  void  deleteTopic(@PathVariable String id ){
        topicsServies.deleteTopic(id);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/topics")
    public  void  deleteTopic(){
        topicsServies.deleteAll();
    }

}
