//package Courses;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CoursesServies {
//    @Autowired
//    private CoursesRepository coursesRepository;
//
//
//    private List<Course> courses = new ArrayList<>(Arrays.asList(
//                new Course("Spring" , "Spring Framework ","Spring Framework Description"),
//                new Course("java" , "Core java","Core java Description"),
//                new Course("dart" , "Core dart","Core dart Description")
//        ));
//
//    public  List<Course> GetTopics (){
//       // return Topics; // from model
//        List<Course> courses = new ArrayList<>();
//        coursesRepository.findAll().forEach(courses::add);
//        return courses;
//    }
//
//
//    public Optional<Course> GetTopic (String id){
//        // return Topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
//         return coursesRepository.findById(id);
//    }
//
//    public void  addTopic (Course course){
//
//        //Topics.add(topic);
//        coursesRepository.save(course);
//    }
//
//    public void  updateTopic (Course course, String id){
////        for (int i = 0 ; i <Topics.size() ;i ++ ){
////            Topic t  = Topics.get(i);
////            if(t.getId().equals(id)){
////                System.out.println("Found");
////                Topics.set(i,topic);
////                System.out.println("updated");
////                return;
////            }
////        }
//        coursesRepository.save(course);
//    }
//    public void  deleteTopic (  String id){
//    //   Topics.removeIf(t->t.getId().equals(id));
//        coursesRepository.deleteById( id);
//        System.out.println("removed");
//
//    }
//
//    public void deleteAll() {
//        coursesRepository.deleteAll();
//    }
//}
