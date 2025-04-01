public class FirePokemon extends Pokemon {
String type = "Fire";

    public FirePokemon(String name, int level, int hp, int xp, String yell, String type) {
        super(name, level, hp, xp, yell);
    }

    public void inferno (){
        int i = getHp() - 10;
        System.out.println("Struck by inferno! Hp: " + i);
        setHp(i);
    }

}
