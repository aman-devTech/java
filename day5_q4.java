//4. Create an interface called Player. The interface has an abstract method
//  called play() that displays a message describing the meaning of "play" to
//  the class. Create classes called Child, Musician, and Actor that all implement Player.
//4. Create an interface called Player. The interface has an abstract method
//  called play() that displays a message describing the meaning of "play" to
//  the class. Create classes called Child, Musician, and Actor that all implement Player.
// Interface definition
interface Player {
    void play(); // Interface methods are implicitly public and abstract
}

// Child class implementing Player
class Child implements Player {
    @Override
    public void play() {
        System.out.println("Child plays with toys and games for fun.");
    }
}

// Musician class implementing Player
class Musician implements Player {
    @Override
    public void play() {
        System.out.println("Musician plays musical instruments like guitar or piano.");
    }
}

// Actor class implementing Player
class Actor implements Player {
    @Override
    public void play() {
        System.out.println("Actor plays a role or character in a movie or drama.");
    }
}

// Driver class with main method
public class day5_q4 {
    public static void main(String[] args) {
        // Polymorphic array holding interface implementations
        Player[] players = new Player[3];
        players[0] = new Child();
        players[1] = new Musician();
        players[2] = new Actor();

        // Calling play() on each object
        for (int i = 0; i < players.length; i++) {
            players[i].play();
        }
    }
}