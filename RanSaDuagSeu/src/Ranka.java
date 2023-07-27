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

    public void addSinka(Sinka sinka) {
        if (sinkaCount < sinkas.length) {
            this.sinkas[sinkaCount] = sinka;
            sinkaCount++;
            System.out.println("Add sinka succeed.");
        } else {
            System.out.println("The Ranka is full. Cannot add more sinka.");
        }
    }
    public int totalJamuan() {
        int total = 0;
        for (int i = 0; i < sinkaCount; i++) {
            total += sinkas[i].getJamuan();
        }
        return total;
    }
    public int totalPrice() {
        int total = 0;
        for (int i = 0; i < sinkaCount; i++) {
            total += sinkas[i].getPrice() * sinkas[i].getJamuan();
        }
        return total;
    }

    public void findCategory(String category) {
        System.out.println("Category: " + category);
        int count = 0;
        for (int i = 0; i < sinkaCount; i++) {
            if (sinkas[i].getCategory().equals(category)) {
                count++;
                System.out.println(count + "." + sinkas[i].getName());
            }
        }
    }

    public void showAllSinka(){
        System.out.println("All Sinka in " + name + ":");
        for (int i = 0; i < sinkaCount; i++) {
            System.out.println( i + 1 + "." + sinkas[i].getName());
        }
    }

    public void removeSinka(String name){
        boolean found = false;
        for (int i = 0; i < sinkaCount; i++) {
            if (sinkas[i].getName().equals(name) ) {
                found = true;
                for (int j = i; j < sinkaCount - 1; j++) {
                    sinkas[j] = sinkas[j + 1];
                }
                sinkas[sinkaCount - 1] = null;
                sinkaCount--;
                System.out.println("Remove " + name + " succeed.");
            }
        }
        if (!found) {
            System.out.println("Remove " + name + " not found.");
        }
    }
}

