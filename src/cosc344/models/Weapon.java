package cosc344.models;

/**
 * Created by albertgao on 11/09/16.
 */
public class Weapon {
    private int id;
    private String name;
    private int pdamage;
    private int mdamage;
    private int heroid;
    private String rarity;
    private String backpackname;
    private String questname;
    private int value;
    
    /**
     * 0-arg Weapon Constructor
     */
    public Weapon() {
        //in case that forget to JOIN TABLE.
        this.value = 10;
    }
    
    /**
     * 9-arg Weapon Constructor
     * @param int id of the weapon
     * @param String name of the weapon
     * @param int pdamage the physical damage of the weapon
     * @param int mdamage the magical damage of the weapon
     * @param int heroid that the weapon belongs to
     * @param String rarity the rarity of the weapon
     * @param String backpackname of the backpack that the weapon resides
     * @param String questname that the weapon drops from
     * @param int value of the weapon
     */
    public Weapon(int id, String name, int pdamage, int mdamage, int heroid, String rarity, String backpackname, String questname, int value) {
        this.id = id;
        this.name = name;
        this.pdamage = pdamage;
        this.mdamage = mdamage;
        this.heroid = heroid;
        this.rarity = rarity;
        this.backpackname = backpackname;
        this.questname = questname;
        this.value = value;
    }
    
    /**
     * Gets weapon id
     * @return int id of the weapon
     */
    public int getId() {
        return id;
    }
    
    /**
     * Sets weapon id
     * @param int id of the weapon
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Gets weapon name
     * @return String name of the weapon
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets weapon name
     * @param String name that the weapon will be set as
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets physical damage of the weapon
     * @return int pdamage the physical damage of the weapon
     */
    public int getPdamage() {
        return pdamage;
    }
    
    /**
     * Sets weapon physical damage
     * @param int pdamage the value of the physical damage that the weapon will be set to
     */
    public void setPdamage(int pdamage) {
        this.pdamage = pdamage;
    }
    
    /**
     * Gets magical damage of the weapon
     * @return int mdamage the magic damage of the weapon
     */
    public int getMdamage() {
        return mdamage;
    }
    
    /**
     * Sets magic damage of the weapon
     * @param int mdamage the magic damage of the weapon
     */
    public void setMdamage(int mdamage) {
        this.mdamage = mdamage;
    }
    
    /**
     * Gets weapon rarity
     * @return String rarity of the weapon
     */
    public String getRarity() {
        return rarity;
    }
    
    /**
     * Sets weapon rarity
     * @param String rarity of the weapon that it will be set to
     */
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    
    /**
     * Gets weapon backpackname
     * @return String backpackname that the weapon resides in
     */
    public String getBackpackname() {
        return backpackname;
    }
    
    /**
     * Sets weapon backpackname
     * @param String backpackname that the weapon will reside in
     */
    public void setBackpackname(String backpackname) {
        this.backpackname = backpackname;
    }
    
    /**
     * Gets weapon questname
     * @return String questname of the quest that drops this weapon
     */
    public String getQuestname() {
        return questname;
    }
    
    /**
     * Sets weapon questname
     * @return String questname that is going to be dropping the weapon
     */
    public void setQuestname(String questname) {
        this.questname = questname;
    }
    
    /**
     * Gets weapon heroid
     * @return int heroid of the weapon's owner
     */
    public int getHeroid() {
        return heroid;
    }
    
    /**
     * Sets weapon heroid
     * @param int heroid that the weapon will belong to
     */
    public void setHeroid(int heroid) {
        this.heroid = heroid;
    }
    
    /**
     * Gets weapon value
     * @return int the value of the weapon
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Sets weapon value
     * @param int value that the weapon will be set to
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    /**
     * Override toString
     * @return String representation of the Weapon object with its variables id, name, pdamage, mdamage, heroid,
     * rarity, backpackname, questname and value.
     */
    @Override
    public String toString() {
        return "Weapon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pdamage=" + pdamage +
                ", mdamage=" + mdamage +
                ", heroid=" + heroid +
                ", rarity='" + rarity + '\'' +
                ", backpackname='" + backpackname + '\'' +
                ", questname='" + questname + '\'' +
                ", value=" + value +
                '}';
    }
}
