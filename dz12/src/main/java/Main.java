/**
 * Задание 1.     Необходимо создать программу, которая продемонстрирует утечку памяти в Java. При этом объекты должны не только создаваться, но и периодически частично удаляться, чтобы GC имел возможность очищать часть памяти. Через некоторое время программа должна завершиться с ошибкой OutOfMemoryError c пометкой Java Heap Space.
 *
 * Задание 2.     Доработать программу так, чтобы ошибка OutOfMemoryError возникала в Metaspace /Permanent Generation
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Main leakGenerator = new Main();
        leakGenerator.createArrays();
    }

    public void createArrays() {
        int arraySize = 20;
        while (true) {
            System.out.println("Available memory (in bytes): " + Runtime.getRuntime().freeMemory());
            int[] fillMemory = new int[arraySize];
            arraySize = arraySize * 5;
        }
    }
}
