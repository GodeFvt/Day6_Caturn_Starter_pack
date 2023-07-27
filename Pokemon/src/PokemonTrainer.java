public class PokemonTrainer {
    //สร้าง Attribute 3 ตัว
    private String name; //ชื่อ Trainer
    private Pokemon[] pokemons; //เก็บ Pokemon เป็น Array
    private int pokemonCount; //การนับ Pokemon ใน Array

    //constructure ที่รับ name และ maxPokemons เพื่อรับจำนวนสูงสุงของ Array
    public PokemonTrainer(String name, int maxPokemons){
        this.name=name;
        this.pokemons=new Pokemon[maxPokemons]; //กำหนด Array และ ขนาด Array จาก maxPokemons
        this.pokemonCount=0; //เรื่มต้นการนับเป็นจำนวนที่ 0 ก่อน
    }

    // Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    //random เลข โดยรับค่า min max
    private static int random(int min,int max) {
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    //add Pokemon เข้าไปใน Array
    public void addPokemon(Pokemon pokemon){
        int random = random(1,100); //เอา method random มาใช้ โดยกำหนด min max ให้กับมัน
        if(random>=50){ //ถ้า random มาได้ >=50

            if(pokemonCount<pokemons.length){ //ถ้า การนับจำนวน < ความกว้างของ Array
                this.pokemons[pokemonCount]=pokemon; //Pokemon ลำดับที่กำลังนับอยู่ จะกลายเป็น pokemon ที่รับมาในบรรทัด public void addPokemon(Pokemon pokemon)
                pokemonCount++; //Update ค่าให้กับการนับ
                System.out.println("Ting!!!,Success! ,Add "+pokemon.name+" Complete"); //โชว์คำพูด ถ้า add เสร็จ
            }else { //ถ้าไม่สำเร็จ
                System.out.println("Cannot add any more!!!,It's full."); //โชว์คำพูด ถ้า การนับจำนวน >= ความกว้างของ Array (Array เต็ม)
            }

        }else{ //ถ้า random มาได้ <50
            System.out.println("Add fail,Sorry Bro");
        }

    }

    public void showYourParty() { //โชว์ Pokemon ของ Trainer คนนี้
        System.out.println("Pokemon Party: "+pokemonCount+"/"+pokemons.length); //โชว์จำนวน Ex. Pokemon Party: 0/4
        for (int i = 0; i < pokemonCount; i++) {  //loop การโชว์ทั้งหมดใน Array ตามจำนวนที่มี
            System.out.println(i + 1+"."+pokemons[i].getName());
            System.out.println("Attack:"+pokemons[i].getAtk());
            System.out.println("Defense:"+pokemons[i].getDef());
            System.out.println("Level: "+pokemons[i].getLevel());
            System.out.println("Element: "+pokemons[i].getElement());
        }
    }
    public void letThemFight(int who,Pokemon outer){ //ให้ Pokemonสู้กัน โดยรับ who มา who จะกลายเป็นลำดับที่ของ Pokemon ใน Array เรา และรับ Outer Pokemon มาเพื่อ เอามาสู้กัน
        who -= 1;
        if(pokemons[who].level>outer.level){ //ถ้า Level ของ Pokemon เรา มากกว่า Outer Pokemon เราชนะ
            System.out.println("Congrate !!!, "+pokemons[who].name+" Win!!!");

        }else if(pokemons[who].level==outer.level){ //ถ้า Level ของ Pokemon เรา เท่ากับ Outer Pokemon ก็จะเสมอ
            System.out.println("Draw!!");
        }else{ //ถ้าLevelเราน้อยกว่าก็ Outer Pokemon ชนะ
            System.out.println("You Lose!!!, "+outer.name+" Win!");
        }
    }
}
