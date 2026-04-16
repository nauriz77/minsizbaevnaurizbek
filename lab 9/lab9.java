public class Main {

    //Есеп 1-2
    static class Student {
        String name;
        int age;
        static int count = 0;
        static String university = "KazNU";

        Student(String name, int age) {
            this.name = name;
            this.age = age;
            count++;
        }

        void showInfo() {
            System.out.println(name + " studies at " + university);
        }
    }

    //Есеп 3
    static class MathUtils {
        static int square(int x) {
            return x * x;
        }

        static int cube(int x) {
            return x * x * x;
        }
    }

    //Есеп 4
    static class Counter {
        static int count = 0;

        static void increment() {
            count++;
        }
    }

    //Есеп 5-6
    static class Config {
        static String appName;
        static int version;

        static {
            appName = "MyApp";
            version = 1;
            System.out.println("Config initialized (static block)");
        }
    }

    //Есеп 7
    static class Outer {
        class Inner {
            void show() {
                System.out.println("Hello from Inner class");
            }
        }
    }

    //Есеп 8
    static class University {
        static int studentCount = 0;

        class UniStudent {
            String name;
            String major;

            UniStudent(String name, String major) {
                this.name = name;
                this.major = major;
                studentCount++;
            }

            void show() {
                System.out.println(name + " - " + major);
            }
        }
    }

    //Есеп 9
    static class Computer {
        class Processor {
            double frequency;

            Processor(double frequency) {
                this.frequency = frequency;
            }

            void show() {
                System.out.println("Processor frequency: " + frequency + " GHz");
            }
        }
    }

    //Есеп 10
    static class Library {
        class Book {
            String title;

            Book(String title) {
                this.title = title;
            }

            void show() {
                System.out.println("Book: " + title);
            }
        }
    }

    //Есеп 11
    static class Car {
        class Engine {
            int power;

            Engine(int power) {
                this.power = power;
            }

            void show() {
                System.out.println("Engine power: " + power + " HP");
            }
        }
    }

    //Есеп 12
    static class Bank {
        static double interestRate = 0.1;

        static double calculateInterest(double amount) {
            return amount * interestRate;
        }
    }

    //Есеп 13
    static class Company {
        class Employee {
            String name;
            String position;

            Employee(String name, String position) {
                this.name = name;
                this.position = position;
            }

            void show() {
                System.out.println(name + " - " + position);
            }
        }
    }

    //Есеп 14
    static class Course {
        String courseName;

        Course(String courseName) {
            this.courseName = courseName;
        }

        class Student {
            String studentName;

            Student(String studentName) {
                this.studentName = studentName;
            }

            void show() {
                System.out.println(studentName + " enrolled in " + courseName);
            }
        }
    }
    public static void main(String[] args) {

        // Есеп 1 & 2
        Student s1 = new Student("Ali", 18);
        Student s2 = new Student("Aruzhan", 19);
        s1.showInfo();
        s2.showInfo();
        System.out.println("Total students created: " + Student.count);
        System.out.println("--------------------------------------------------");

        // Есеп 3
        System.out.println("Square of 3: " + MathUtils.square(3));
        System.out.println("Cube of 2: " + MathUtils.cube(2));
        System.out.println("--------------------------------------------------");

        // Есеп 4
        Counter.increment();
        Counter.increment();
        System.out.println("Counter: " + Counter.count);
        System.out.println("--------------------------------------------------");

        // Есеп 5 & 6
        System.out.println("App name: " + Config.appName + ", version: " + Config.version);
        System.out.println("--------------------------------------------------");

        // Есеп 7
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
        System.out.println("--------------------------------------------------");

        // Есеп 8
        University uni = new University();
        University.UniStudent us1 = uni.new UniStudent("Dana", "CS");
        University.UniStudent us2 = uni.new UniStudent("Ermek", "Math");
        us1.show();
        us2.show();
        System.out.println("University student count: " + University.studentCount);
        System.out.println("--------------------------------------------------");

        // Есеп 9
        Computer comp = new Computer();
        Computer.Processor cpu = comp.new Processor(3.5);
        cpu.show();
        System.out.println("--------------------------------------------------");

        // Есеп 10
        Library lib = new Library();
        Library.Book book = lib.new Book("Java Basics");
        book.show();
        System.out.println("--------------------------------------------------");

        // Есеп 11
        Car car = new Car();
        Car.Engine engine = car.new Engine(150);
        engine.show();
        System.out.println("--------------------------------------------------");

        // Есеп 12
        double interest = Bank.calculateInterest(1000);
        System.out.println("Interest on 1000: " + interest);
        System.out.println("--------------------------------------------------");

        // Есеп 13
        Company company = new Company();
        Company.Employee emp = company.new Employee("Nurlan", "Manager");
        emp.show();
        System.out.println("--------------------------------------------------");

        // Есеп 14
        Course course = new Course("Java Programming");
        Course.Student cs1 = course.new Student("Aigerim");
        cs1.show();
        System.out.println("--------------------------------------------------");

        // Есеп 15
        University.UniStudent us3 = uni.new UniStudent("Samal", "Physics");
        System.out.println("Updated University student count: " + University.studentCount);
    }
}