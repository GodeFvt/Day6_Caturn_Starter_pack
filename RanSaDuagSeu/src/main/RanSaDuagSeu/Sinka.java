
public class Sinka {

    private String name;
    private String category;
    private double price;
    private int jamuan;


    // Constructor
    public Sinka(String name, double price, String category) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.jamuan = random();

    }
    private int random() {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}