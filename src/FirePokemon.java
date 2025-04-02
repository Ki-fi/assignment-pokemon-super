public class FirePokemon extends Pokemon {
    String food;
    String quality;

        public FirePokemon(String name, int xp, String yell){
            super(name, xp, yell);
            super.setType("Fire");
        }

    @Override
    public void chargingSound(){
        System.out.println(super.getName() + " is sizzling...");
    }

    public void inferno(){
            int i = getXp() + 10;
            chargingSound();
            System.out.println(getName() + " attacked with inferno! Xp: +10");
            setXp(i);
            System.out.println("Total Xp: " + getXp());
        }

    }
