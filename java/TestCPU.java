class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int noOfCores;
        String manufacturer;

        Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        void displayProcessorInfo() {
            System.out.println("Processor Information:");
            System.out.println("Number of Cores: " + noOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAMInfo() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
}

public class TestCPU {
    public static void main(String[] args) {

        CPU cpu = new CPU(25000);

        CPU.Processor processor = cpu.new Processor(8, "Intel");

        CPU.RAM ram = new CPU.RAM(16, "hp");

        System.out.println("CPU Price: " + cpu.price);
        processor.displayProcessorInfo();
        ram.displayRAMInfo();
    }
}
