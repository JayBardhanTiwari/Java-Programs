package OOPS;

public class Interfaces {
    public static void main(String[] args) {

        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();

        Pawn p = new Pawn();
        p.moves();

        Rook r = new Rook();
        r.moves();

        Beer b = new Beer();
        b.eatGrass();
        b.eatMeat();

    }
}

interface Chess {
    void moves();// by default it is public and abstract
}

class Queen implements Chess {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(moves in all direction)");
    }
}

class Rook implements Chess {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements Chess {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}

class Pawn implements Chess {
    public void moves() {
        System.out.println("up,down,left(by 1 and 2 step only)");
    }
}

// Multiple inheritance using interfaces

interface Herbivore {
    void eatGrass();// by default it is public and abstract

}

interface Carnivore {
    void eatMeat();// by default it is public and abstract

}

class Beer implements Herbivore, Carnivore {

    public void eatGrass() {
        System.out.println("eats grass");
    }

    public void eatMeat() {
        System.err.println("eats meat");
    }

}