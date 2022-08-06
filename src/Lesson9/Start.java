package Lesson9;

public class Start {
    public static void main(String[] args) {
        Computer apple = new Computer(2500, 1000, "MacBook10");
        Computer dell = new Computer(2800, 1400, "Dell G5");
        System.out.println(apple);
        System.out.println(dell.getName());
    }
}
