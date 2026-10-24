package Creational_Design_Pattern.PrototypeDesign;

public class GameBotCharacter implements Clonable<GameBotCharacter>  {

    private String name;
    private int health;
    private int power;

    public GameBotCharacter(String name, int health, int power) {

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
    }

    private GameBotCharacter(GameBotCharacter prototype) {
        this.name = prototype.name;
        this.health = prototype.health;
        this.power = prototype.power;
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
                '}';
    }

}
