public class Main {

    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 200, "Pika Pika!");
        System.out.println(pikachu.getName() + " says: " + pikachu.getYell());
        System.out.println(pikachu.getName() + "'s type is: " + pikachu.getType());
        pikachu.thunderPunch();

        FirePokemon charizard = new FirePokemon("Charizard", 200, "Rooaaarrr!!");
        System.out.println(charizard.getName() + " says: " + charizard.getYell());
        System.out.println(charizard.getName() + "'s type is: " + charizard.getType());
        charizard.inferno();

        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 200, "Saauuuurrr!");
        System.out.println(bulbasaur.getName() + " says: " + bulbasaur.getYell());
        System.out.println(bulbasaur.getName() + "'s type is: " + bulbasaur.getType());
        bulbasaur.leechSeed();

        WaterPokemon squirtle = new WaterPokemon("Squirtle", 200, "Squirtle Squirtle!");
        System.out.println(squirtle.getName() + " says: " + squirtle.getYell());
        System.out.println(squirtle.getName() + "'s type is: " + squirtle.getType());
        squirtle.hydroCanon();

        pikachu.thunderPunch();
        squirtle.hydroCanon();
    }




}