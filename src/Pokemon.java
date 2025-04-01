public class Pokemon {

private String name;
private int level;
private int hp;
private int xp;
private String yell;

public Pokemon(String name, String yell){
    this.name = name;
    this.yell = yell;
}

public Pokemon(String name, int level, int hp, int xp, String yell) {
    this.name = name;
    this.level = level;
    this.hp = hp;
    this.xp = xp;
    this.yell = yell;
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
public void setYell(String yell) {
    this.yell = yell;
}

}
