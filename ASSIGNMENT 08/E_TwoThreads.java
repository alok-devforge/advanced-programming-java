import java.io.*;
public class E_TwoThreads
{
    public static void main(String[] args)
    {
        Thread oddThread = new Thread(new OddWriter(), "OddWriter");
        Thread evenThread = new Thread(new EvenWriter(), "EvenWriter");
        oddThread.start();
        evenThread.start();
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done writing numbers to files.");
    }
}
class OddWriter implements Runnable
{
    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("odd_numbers.txt"))) {
            for (int i = 1; i <= 200; i += 2) {
                writer.write(i + System.lineSeparator());
            }
            System.out.println("Odd numbers written to odd_numbers.txt");
        } catch (IOException e) {
            System.err.println("Error writing odd numbers: " + e.getMessage());
        }
    }
}
class EvenWriter implements Runnable
{
    @Override
    public void run()
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("even_numbers.txt"))) {
            for (int i = 2; i <= 200; i += 2) {
                writer.write(i + System.lineSeparator());
            }
            System.out.println("Even numbers written to even_numbers.txt");
        } catch (IOException e) {
            System.err.println("Error writing even numbers: " + e.getMessage());
        }
    }
}