public class Pokemon {

private String name;
private int level;
private int hp;
private int xp;
private String type;
private String yell;

public Pokemon(String name, int xp, String yell){
    this.name = name;
    this.xp = xp;
    this.yell = yell;
}

public Pokemon(String name, int level, int hp, int xp, String yell) {
    this.name = name;
    this.level = level;
    this.hp = hp;
    this.xp = xp;
    this.yell = yell;
}

public void chargingSound(){
    System.out.println(getName() + " is charging...");
}

public String getName() {
    return name;
}
public int getLevel() {
    return level;
}
public int getHp() {
    return hp;
}
public int getXp() {
    return xp;
}
public String getType(){
    return type;
 }
public String getYell() {
    return yell;
}



public void setName(String name){
    this.name = name;
}
public void setLevel(int level) {
    this.level = level;
}
public void setXp(int xp) {
    this.xp = xp;
}
public void setHp(int hp) {
    this.hp = hp;
}
public void setType(String type) {
    this.type = type;
}
public void setYell(String yell) {
    this.yell = yell;
}

}
