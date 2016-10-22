class Dice {
    private int number = 0;
    public void roll() {
        number = (int) (Math.random() * 6)+1;
        System.out.println("Turn on " + number);
    }
    public int getNum() {
        return this.number;
    }
}
 public class Player {
    private String name=null;
    private int num1=0;
    private int num2=0;
    public Player(String _name) {
           name=_name;
 }
 public void play() {
     Dice d= new Dice();
     d.roll();
     this.num1=d.getNum();
     d.roll();
     this.num2=d.getNum();
 }
 public String getName() {
       return this.name;
 }
 public int getNum() {
       return this.num1+this.num2;
}
}

class DiceGame {
    Player p1;
    Player p2;
    public void startGame() {
        Player p1 = new Player("A");
        Player p2 = new Player("B");
        System.out.println("Player"+" "+p1.getName()+" roll the Dice");
        p1.play();
        System.out.println("Player"+" "+p2.getName()+" roll the Dice");
        p2.play();
        if (p1.getNum() > p2.getNum()) {
            System.out.println(p1.getName() + " won");
        }
        else if (p1.getNum() == p2.getNum()) {
            System.out.println(" draw");
        }
        else
            System.out.println(p2.getName() + " won");
    }
}
DiceGame d=new DiceGame();
d.startGame();