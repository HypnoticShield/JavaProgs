/*Create a Java program with a Player class and derive three subclasses: Cricket_Player,
Football_Player, and Hockey_Player. Implement attributes such as name, age, and
position, and methods like play() and train() to represent these players.
*/
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }
}
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }
}
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }
}
public class Player {
    String name;
    int age;
    String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void play() {
        System.out.println("Playing...");
    }

    public void train() {
        System.out.println("Training...");
    }

    public static void main(String[] args) {
        Cricket_Player cp = new Cricket_Player("Arnav", 20, "Batsman");
        cp.play();
        cp.train();

        Football_Player fp = new Football_Player("Aman", 21, "Midfielder");
        fp.play();
        fp.train();

        Hockey_Player hp = new Hockey_Player("Saisha", 22, "Forward");
        hp.play();
        hp.train();
    }
}
