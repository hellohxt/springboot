package com.fpx.xms.designer;

/**
 * Created by wanq0 on 2021/1/13.
 */
public class StrategyTest {

    public static void main(String[] args) {
        NormalZombies normalZombies = new NormalZombies(new NormalMove(), new NorMalAttack());
        normalZombies.display();
        normalZombies.attack();
        normalZombies.move();

        normalZombies.setAttack(new SpecialAttack());
        normalZombies.attack();
    }
}

class NormalZombies extends Zombies{


    public NormalZombies(Move move, Attack attack) {
        super(move, attack);
    }

    @Override
    void display() {
        System.out.println("我是普通僵尸");
    }

    @Override
    void attack() {
        attack.attack();
    }

    @Override
    void move() {
        move.move();
    }
}


abstract class Zombies{

    public Zombies(Move move, Attack attack) {
        this.move = move;
        this.attack = attack;
    }

     Move move;

     Attack attack;


     abstract void display();

    abstract void attack();

    abstract void move();

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }
}

interface Display{
    void display();
}

class NormalDisplay implements Display{

    @Override
    public void display() {
        System.out.println("普通僵尸");
    }
}

interface Move{

    void move();
}

class NormalMove implements Move{


    @Override
    public void move() {
        System.out.println("普通移动");
    }
}

interface Attack{

    void attack();
}

class NorMalAttack implements Attack{

    @Override
    public void attack() {
        System.out.println("咬");
    }
}

class SpecialAttack implements Attack{

    @Override
    public void attack() {
        System.out.println("打");
    }
}
