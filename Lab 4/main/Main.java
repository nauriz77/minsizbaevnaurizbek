package main;

import model.Student;
import service.University;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Айдана", 18, "IT");
        Student s2 = new Student("Нұржан", 19, "Экономика");
        Student s3 = new Student("Алина", 20, "Математика");


        s1.showInfo();
        s2.showInfo();
        s3.showInfo();


        s1.changeMajor("Computer Science");
        s1.showInfo();


        University uni = new University();
        uni.registerStudent(s1);
    }
}