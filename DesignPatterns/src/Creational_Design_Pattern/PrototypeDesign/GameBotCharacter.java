package Creational_Design_Pattern.PrototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class GameBotCharacter implements Clonable<GameBotCharacter>  {

    private String name;
    private int health;
    private int power;
    private List<String> weapons;

    public GameBotCharacter(String name, int health, int power, List<String> weapons) {

        System.out.println("Loading characters animation from DB...");
        System.out.println("Loading sound effects from DB...");
        System.out.println("Preparing AI battle setting file...");

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.name = name;
        this.health = health;
        this.power = power;
        this.weapons = weapons;
    }

    private GameBotCharacter(GameBotCharacter prototype) {
        this.name = prototype.name;
        this.health = prototype.health;
        this.power = prototype.power;
        this.weapons = new ArrayList<>(prototype.weapons);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    @Override
    public GameBotCharacter customizeClone() {
        return new GameBotCharacter(this);
    }

    @Override 
    public String toString() {
        return "GameBotCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", power=" + power +
                ", weapons=" + weapons +
                '}';
    }

}
