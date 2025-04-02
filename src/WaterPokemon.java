public class WaterPokemon extends Pokemon {
    String food;
    String quality;

    public WaterPokemon(String name, int xp, String yell){
        super(name, xp, yell);
        super.setType("Water");
    }

    @Override
    public void chargingSound(){
        System.out.println(super.getName() + " is swirling...");
    }

    public void hydroCanon(){
        int i = getXp() + 30;
        chargingSound();
        System.out.println(getName() + " attacked with hydroCanon! Xp: +30");
        setXp(i);
        System.out.println("Total Xp: " + getXp());
    }
}
