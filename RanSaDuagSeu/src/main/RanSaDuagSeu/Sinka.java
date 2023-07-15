
import java.util.Scanner;

public class Sinka {

    private String name;
    private double price;
    private int jamuan;


    // Constructor
    public Sinka(String name, double price) {
        this.name = name;
        this.price = price;
        this.jamuan = randomJamuan();

    }
    private int randomJamuan() {
        int min = 1;
        int max = 10;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }
    // Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getJamuan() {
        return jamuan;
    }

    public void setJamuan(int jamuan) {
        this.jamuan = jamuan;
    }

    public static void main(String[] args) {

    }
}