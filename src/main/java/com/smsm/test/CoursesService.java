package com.smsm.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository ;


    private List<CoursesModel> Courses= new ArrayList<>(Arrays.asList(
            new CoursesModel("Spring" , "Spring Framework ","Spring Framework Description"),
            new CoursesModel("java" , "Core java","Core java Description"),
            new CoursesModel("dart" , "Core dart","Core dart Description")
    ));

    public  List<CoursesModel> GetCourses (){
       // return Courses; // from model
        List<CoursesModel> c = new ArrayList<>();
        coursesRepository.findAll().forEach(c::add);
        return c;
    }


    public Optional<CoursesModel> GetCourse (String id){
        // return Topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return coursesRepository.findById(id);
    }

    public void  addCourse (CoursesModel c){

        //Topics.add(topic);
        coursesRepository.save(c);
    }

    public void  updateCourse (CoursesModel c , String id){
//        for (int i = 0 ; i <Topics.size() ;i ++ ){
//            Topic t  = Topics.get(i);
//            if(t.getId().equals(id)){
//                System.out.println("Found");
//                Topics.set(i,topic);
//                System.out.println("updated");
//                return;
//            }
//        }
        coursesRepository.save(c);
    }
    public void  deleteCourse(  String id){
        //   Topics.removeIf(t->t.getId().equals(id));
        coursesRepository.deleteById( id);
        System.out.println("removed");

    }

    public void deleteAllCourses() {
        coursesRepository.deleteAll();
    }
}
