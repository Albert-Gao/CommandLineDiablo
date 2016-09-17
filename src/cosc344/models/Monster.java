package cosc344.models;

/**
 * Created by albertgao on 11/09/16.
 */
public class Monster {
    private String name;
    private int level;
    private int hitpoints;
    private String areaname;

    public Monster() {
        //in case that forget to JOIN TABLE
        this.hitpoints = 10;
    }

    public Monster(String name, int level, int hitpoints, String areaname) {
        this.name = name;
        this.level = level;
        this.hitpoints = hitpoints;
        this.areaname = areaname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
    	if ( hitpoints < 0 ){
    		this.hitpoints = 0;	
    	} else {
    		this.hitpoints = hitpoints;
    	}
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hitpoints=" + hitpoints +
                ", areaname='" + areaname + '\'' +
                '}';
    }
}
