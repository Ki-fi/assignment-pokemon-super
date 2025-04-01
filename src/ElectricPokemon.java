public class ElectricPokemon extends Pokemon{
    String type = "Electric";

        public ElectricPokemon(String name, int xp, String yell){
            super(name, xp, yell);
            super.setType("Electric");
        }

        public void thunderPunch(){
            int i = getXp() + 20;
            System.out.println(getName() + " attacked with thunderPunch! Xp: +20");
            setXp(i);
            System.out.println("Total Xp: " + getXp());
        }


}
