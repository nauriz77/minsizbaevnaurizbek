import java.time.LocalTime;

class lab1 {
    static void main() {
        System.out.println("Қазіргі уақыт: " + LocalTime.now());
    }
} 1lab
class fclass1 {

    void show1() {
        System.out.println("Бұл fclass1 класы");
    }

    static void main() {
        fclass2 obj = new fclass2();
        obj.show1();
        obj.show3();
        obj.show2();
    }
}

class fclass3 extends fclass1 {
    void show3() {
        System.out.println("Бұл fclass3 класы");
    }
}

class fclass2 extends fclass3 {
    void show2() {
        System.out.println("Бұл fclass2 класы");
    }
} class 1
class fclass1 {

    void show1() {
        System.out.println("Бұл fclass1 класы");
    }

    static void main() {
        fclass2 obj = new fclass2();
        obj.show1();
        obj.show3();
        obj.show2();
    }
}

class fclass3 extends fclass1 {
    void show3() {
        System.out.println("Бұл fclass3 класы");
    }
}

class fclass2 extends fclass3 {
    void show2() {
        System.out.println("Бұл fclass2 класы");
    }
}class2
class fclass1 {

    void show1() {
        System.out.println("Бұл fclass1 класы");
    }

    static void main() {
        fclass2 obj = new fclass2();
        obj.show1();
        obj.show3();
        obj.show2();
    }
}

class fclass3 extends fclass1 {
    void show3() {
        System.out.println("Бұл fclass3 класы");
    }
}

class fclass2 extends fclass3 {
    void show2() {
        System.out.println("Бұл fclass2 класы");
    }
} class 3