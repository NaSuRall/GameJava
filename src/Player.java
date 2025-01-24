public class Player {


    private String name;
    private int hp;
    private int level;
    private int score;



    public Player(String name, int hp, int level, int score) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.score = score;
    }



    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }







}
