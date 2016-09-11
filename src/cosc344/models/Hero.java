package cosc344.models;

import java.sql.Date;
/**
 * Created by albertgao on 11/09/16.
 */


public class Hero {
    private int id;
    private String name;
    private Date birthday;
    private int exp;
    private int level;

    public Hero() {
        //in case forget to JOIN TABLE
        this.level = 1;
        this.exp = 1;
    }

    public Hero(int id, String name, Date birthday, int exp, int level) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.exp = exp;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", exp=" + exp +
                ", level=" + level +
                '}';
    }
}
