public class Main {
    public static void main(String[] args) {
        //Object Sinka
        Sinka sinka1 = new Sinka("sugar",10,"Groceries");
        Sinka sinka2 = new Sinka("cooking oil",46,"Groceries");
        Sinka sinka3 = new Sinka("milk",15,"Groceries");
        Sinka sinka4 = new Sinka("soft drink",34,"Beverages");
        Sinka sinka5 = new Sinka("orange juice",19,"Beverages");
        Sinka sinka6 = new Sinka("tra",20,"Beverages");
        Sinka sinka7 = new Sinka("chocolate",50,"Snacks");
        Sinka sinka8 = new Sinka("bread",22,"Snacks");
        Sinka sinka9 = new Sinka("Mama",7,"Snacks");
        //Object Ranka
        Ranka RankaGot = new Ranka("RankaGot",5);

        RankaGot.addSinka(sinka1);
        RankaGot.addSinka(sinka4);
        RankaGot.addSinka(sinka7);
        RankaGot.addSinka(sinka2);
        System.out.println("----------------------------------------------");
        System.out.println("Total Jamuan: " + RankaGot.totalJamuan());
        System.out.println("----------------------------------------------");
        System.out.println("Total Price: " + RankaGot.totalPrice());
        System.out.println("----------------------------------------------");
        RankaGot.findCategory("Groceries");
        System.out.println("----------------------------------------------");
        RankaGot.showAllSinka();
        System.out.println("----------------------------------------------");
        RankaGot.removeSinka("sugar");
        RankaGot.removeSinka("sugarawd");
        RankaGot.showAllSinka();
        System.out.println("----------------------------------------------");
    }
}
