public class Main {
    public static void main(String[] args) {
        Pokemon p1=new Pokemon("Pikachu","Thunder");
        Pokemon p2=new Pokemon("Semikame","Water");
        Pokemon p3=new Pokemon("Fushigidane","Water");
        Pokemon p4=new Pokemon("KoKoon","Clay");
        Pokemon p5=new Pokemon("Lisadon","Fire");


        PokemonTrainer m1= new PokemonTrainer("Satoshi",4);
        m1.addPokemon(p1);
        m1.addPokemon(p2);
        m1.addPokemon(p3);
        m1.addPokemon(p4);
        m1.addPokemon(p5);
        m1.showYourParty();

    }
}
