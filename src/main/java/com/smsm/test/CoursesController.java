package com.smsm.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CoursesController {




    @Autowired
    private  CoursesService coursesService;

    @RequestMapping("/topics/{topicsid}/courses")
    public List<CoursesModel> getAllCourses(){
        return  coursesService.GetCourses();
    }

    @RequestMapping("/topics/{topicsid}/courses/{id}")
    public Optional<CoursesModel> getCourse(@PathVariable String id) {
        return coursesService.GetCourse(id);
    }


    @RequestMapping(method = RequestMethod.POST , value = "/topics/{topicsid}/courses")
    public  void  AddCourse(@RequestBody CoursesModel c){
        coursesService.addCourse(c);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{topicsid}/courses/{id}")
    public  void  updateCourse(@RequestBody CoursesModel c ,@PathVariable String id ){
        coursesService.updateCourse(c,id);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{topicsid}/courses/{id}")
    public  void  deleteCourse(@PathVariable String id ){
        coursesService.deleteCourse(id);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{topicsid}/courses")
    public  void  deleteCourse(){
        coursesService.deleteAllCourses();
    }

}
