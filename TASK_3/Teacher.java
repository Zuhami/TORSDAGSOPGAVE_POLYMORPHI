package TASK_3;
import java.util.ArrayList;
public class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;
 String name;

 public Teacher (String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.name = name;
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(currentCourses)) {
            System.out.println("u can teach this course");
            return false;
        }else {

            System.out.println("u can't teach this course");
            return true;
        }

    }
}
