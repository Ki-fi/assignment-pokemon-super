public class FirePokemon extends Pokemon {
String type = "Fire";

    public FirePokemon(String name, int xp, String yell){
        super(name, xp, yell);
        super.setType("Fire");
    }

    public void inferno(){
        int i = getXp() + 10;
        System.out.println(getName() + " attacked with inferno! Xp: +10");
        setXp(i);
        System.out.println("Total Xp: " + getXp());
    }

}
