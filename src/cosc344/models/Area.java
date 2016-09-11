package cosc344.models;

/**
 * Created by albertgao on 11/09/16.
 */
public class Area {
    private String name;
    private int size;
    private int restricted;

    public Area() {
    }

    public Area(String name, int size, int restricted) {
        this.name = name;
        this.size = size;
        this.restricted = restricted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRestricted() {
        return restricted;
    }

    public void setRestricted(int restricted) {
        this.restricted = restricted;
    }

    @Override
    public String toString() {
        return "Area {" +
                "name ='" + name + '\'' +
                ", size =" + size +
                ", restricted =" + restricted +
                '}';
    }
}
