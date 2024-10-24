package TASK_3;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
    ArrayList <String> passedCourses1 = new ArrayList<>();
    passedCourses1.add("Idræt");
    passedCourses1.add("Matematik");
    passedCourses1.add("Dansk");

    ArrayList <String> currentCourses1    = new ArrayList<>();
    currentCourses1.add("spansk");
    currentCourses1.add("engelsk");

    ArrayList <String> canTeach1 = new ArrayList<>();
    canTeach1.add("fysik");
    canTeach1.add("spansk");
    canTeach1.add("oldtidskundskab");

    ArrayList <String> currentCourses2    = new ArrayList<>();
    currentCourses2.add("fysik");
    currentCourses2.add("Spansk");

Student Student1 = new Student("Ayman",passedCourses1,currentCourses1);

Teacher Teacher1 = new Teacher ("Signe",canTeach1, currentCourses2 );

    ArrayList<Person> persons = new ArrayList<>();

    persons.add(Student1);

    persons.add(Teacher1);


}
}
