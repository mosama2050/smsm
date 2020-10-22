package com.smsm.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicsServies {
    @Autowired
    private TopicRepository topicRepository ;


    private List<Topic>  Topics= new ArrayList<>(Arrays.asList(
                new Topic("Spring" , "Spring Framework ","Spring Framework Description"),
                new Topic("java" , "Core java","Core java Description"),
                new Topic("dart" , "Core dart","Core dart Description")
        ));

    public  List<Topic> GetTopics (){
//      return Topics; // from model
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }


    public Optional<Topic> GetTopic (String id){
        // return Topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
         return topicRepository.findById(id);
    }

    public void  addTopic (Topic topic){

        //Topics.add(topic);
        topicRepository.save(topic);
    }

    public void  updateTopic (Topic topic , String id){
//        for (int i = 0 ; i <Topics.size() ;i ++ ){
//            Topic t  = Topics.get(i);
//            if(t.getId().equals(id)){
//                System.out.println("Found");
//                Topics.set(i,topic);
//                System.out.println("updated");
//                return;
//            }
//        }
        topicRepository.save(topic);
    }
    public void  deleteTopic (  String id){
    //   Topics.removeIf(t->t.getId().equals(id));
        topicRepository.deleteById( id);
        System.out.println("removed");

    }

    public void deleteAll() {
        topicRepository.deleteAll();
    }
}
