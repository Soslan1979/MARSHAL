package Lesson9;

public class Computer {
    private int memory;
    private int cpu;
    private String name;

    Computer(int memory, int cpu, String name) {
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;
    }

    int getMemory() {
        return memory;
    }

    int getCpu() {
        return cpu;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return memory + "; " + cpu + "; " + name;
    }
}
