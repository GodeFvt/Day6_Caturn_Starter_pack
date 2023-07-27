public class Pokemon {
    //สร้าง Attribute 4 ตัว
    public String name;
    public int atk;
    public int def;
    public int level;
    public String element;

    //Constructure โดยรับแค่ ชื่อ กับ ธาตุ Attribute ที่เหลือ จะใช้ method Random
    public Pokemon(String name,String element){
        this.name = name;
        this.atk = random();
        this.def= random();
        this.element= element;
        this.level= random();
    }

    //random เลข จาก min ถึงค่า max
    private int random() {
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    //Getter Setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {return def;}

    public void setDef(int def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }



    public void showStatus() {
        System.out.println("Name: " + name);
        System.out.println( "Attack: " + atk);
        System.out.println("Defense: " + def);
        System.out.println("Level: " + level);
        System.out.println("Element: " + element);
    }

}
