package cosc344.models;

/**
 * Created by albertgao on 11/09/16.
 */
public class Consumable {
    private String name;
    private int heroid;
    private String backpackname;

    public Consumable() {
    }

    public Consumable(String name, int heroid, String backpackname) {
        this.name = name;
        this.heroid = heroid;
        this.backpackname = backpackname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeroid() {
        return heroid;
    }

    public void setHeroid(int heroid) {
        this.heroid = heroid;
    }

    public String getBackpackname() {
        return backpackname;
    }

    public void setBackpackname(String backpackname) {
        this.backpackname = backpackname;
    }

    @Override
    public String toString() {
        return "Consumable{" +
                "name='" + name + '\'' +
                ", heroid=" + heroid +
                ", backpackname='" + backpackname + '\'' +
                '}';
    }
}
