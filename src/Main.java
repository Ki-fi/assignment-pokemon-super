public class Main {

    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 200, "Pika Pika!");
        System.out.println(pikachu.getName() + " says: " + pikachu.getYell());
        System.out.println(pikachu.getName() + "'s type is: " + pikachu.getType());
        pikachu.thunderPunch();
        pikachu.thunderPunch();

        FirePokemon charizard = new FirePokemon("Charizard", 200, "Rooaaarrr!!");
        System.out.println(charizard.getName() + " says: " + charizard.getYell());
        System.out.println(charizard.getName() + "'s type is: " + charizard.getType());
        charizard.inferno();
    }




}