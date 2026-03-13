package service;

import model.Student;

public class University {

    public void registerStudent(Student student) {
        System.out.println("Студент университетке тіркелді:");
        student.showInfo();
    }
}