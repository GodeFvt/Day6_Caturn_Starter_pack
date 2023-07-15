public class Ranka {
    private Sinka[] sinkas;
    private String name;
    private int sinkaCount;

    public Ranka(String name,int maxSinka) {
        this.name = name;
        this.sinkas = new Sinka[maxSinka];
        this.sinkaCount = 0;
    }

    public Sinka[] getSinkas() {
        return sinkas;
    }

    public String getName() {
        return name;
    }

    public void addStore(Sinka song) {
        if (sinkaCount < sinkas.length) {
            this.sinkas[sinkaCount] = song;
            sinkaCount++;
        } else {
            System.out.println("The Ranka is full. Cannot add more sinka.");
        }
    }

    public int totalPrice() {
        int total = 0;
        for (int i = 0; i < sinkaCount; i++) {
            total += sinkas[i].getPrice() * sinkas[i].getJamuan();
        }
        return total;
    }

}
