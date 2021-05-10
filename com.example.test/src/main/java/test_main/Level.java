package test_main;

//setting as "enum" allows you to create a set of attributes for the classes object
public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private Level(int num){
        this.lvlNum = num;
        //System.out.println(this.lvlNum);
    }

    public int getLvl() {
        return this.lvlNum;
    }

    public void setLvl(int num) {
        this.lvlNum = num;
    }
}
