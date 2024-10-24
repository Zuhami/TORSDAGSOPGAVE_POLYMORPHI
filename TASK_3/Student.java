package TASK_3;

import java.util.ArrayList;

public class Student extends Person {
    String name;
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    public Student (String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.name = name;
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;

    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(currentCourses)) {
            System.out.println("Student already passed courses");
            return false;
        }else {
            currentCourses.add(course);
            System.out.println("Student successfully added course");
       return true;
        }
        }
    }


