package model;

public class Student {

    String name;
    int age;
    String major;


    public Student() {
        name = "Белгісіз";
        age = 0;
        major = "Белгісіз";
    }


    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }


    public void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println();
    }


    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }
}