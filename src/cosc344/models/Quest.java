package cosc344.models;

/**
 * Created by albertgao on 11/09/16.
 */
public class Quest {
    private String name;
    private int mandatory;
    private String type;
    private String difficulty;

    public Quest() {
    }

    public Quest(String name, int mandatory, String type, String difficulty) {
        this.name = name;
        this.mandatory = mandatory;
        this.type = type;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMandatory() {
        return mandatory;
    }

    public void setMandatory(int mandatory) {
        this.mandatory = mandatory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "name='" + name + '\'' +
                ", mandatory=" + mandatory +
                ", type='" + type + '\'' +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
