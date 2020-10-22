//package Courses;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class CoursesController {
//
//    @Autowired
//    private CoursesServies coursesServies;
//
//    @RequestMapping("/topics")
//    public List<Course> getAllTopic(){
//        return  coursesServies.GetTopics();
//    }
//
//    @RequestMapping("/topics/{id}")
//    public Optional<Course> getTopic(@PathVariable String id) {
//        return coursesServies.GetTopic(id);
//    }
//
//
//    @RequestMapping(method = RequestMethod.POST , value = "/topics")
//    public  void  AddTopic(@RequestBody Course course){
//        coursesServies.addTopic(course);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
//    public  void  updateTopic(@RequestBody Course course, @PathVariable String id ){
//        coursesServies.updateTopic(course,id);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
//    public  void  deleteTopic(@PathVariable String id ){
//        coursesServies.deleteTopic(id);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE , value = "/topics")
//    public  void  deleteTopic(){
//        coursesServies.deleteAll();
//    }
//
//}
