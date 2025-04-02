public class ElectricPokemon extends Pokemon{
    String food;
    String quality;

        public ElectricPokemon(String name, int xp, String yell){
            super(name, xp, yell);
            super.setType("Electric");
        }

    @Override
    public void chargingSound(){
        System.out.println(super.getName() + " is buzzing...");
    }

        public void thunderPunch(){
            int i = getXp() + 20;
            chargingSound();
            System.out.println(getName() + " attacked with thunderPunch! Xp: +20");
            setXp(i);
            System.out.println("Total Xp: " + getXp());
        }


}
