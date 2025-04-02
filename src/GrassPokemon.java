public class GrassPokemon extends Pokemon {
    String food;
    String quality;

    public GrassPokemon(String name, int xp, String yell){
        super(name, xp, yell);
        super.setType("Grass");
    }

    @Override
    public void chargingSound(){
        System.out.println(super.getName() + " is rustling...");
    }

    public void leechSeed(){
        int i = getXp() + 15;
        chargingSound();
        System.out.println(getName() + " attacked with leechSeed! Xp: +15");
        setXp(i);
        System.out.println("Total Xp: " + getXp());
    }

}
