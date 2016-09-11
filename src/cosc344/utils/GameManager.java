package cosc344.utils;

import cosc344.models.*;
import cosc344.services.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameManager extends BaseClass {
    private Scanner scanner;
    private Connection conn;

    private Area area;
    private Backpack backpack;
    private Consumable consumable;
    private Hero hero;
    private ArrayList<Monster> monsters;
    private ArrayList<Quest> quests;
    private Weapon weapon;

    private AreaService areaService;
    private BackpackService backpackService;
    private ConsumableService consumableService;
    private HeroService heroService;
    private MonsterService monsterService;
    private QuestService questService;
    private WeaponService weaponService;

    public GameManager(Scanner scanner, Connection conn) {
        this.scanner = scanner;
        this.conn = conn;

        //self-inject all the services
        try {
            this.areaService = new AreaService(this.conn);
            this.backpackService = new BackpackService(this.conn);
            this.consumableService = new ConsumableService(this.conn);
            this.heroService = new HeroService(this.conn);
            this.monsterService = new MonsterService(this.conn);
            this.questService = new QuestService(this.conn);
            this.weaponService = new WeaponService(this.conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //step 1 - display the menu (pickup a hero)
    public void displayMenu() {
        try {
            //Display the beginning of the game
            SceneGenerator.beginGame();
            printBlankSpace();

            //load all the heroes from the database
            ArrayList<Hero> list = this.heroService.loadAll();

            //print all of them so user can pick up one
            groupPrint(list);
            
            int heroid=0;
            boolean mark = false;
            while(!mark){
                //wait for the user to input
                print("Choose your hero by entering his ID:");
                heroid = scanner.nextInt();
                mark = findID(list,heroid) ? true : false;
            }

            //load hero with this id
            this.hero = this.heroService.getObject(heroid);
            print(this.hero.toString());

            //display the hero
            SceneGenerator.showHero();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean findID(ArrayList<Hero> list, int id){
        for (Hero h:list){
            if (h.getId()==id)
                return true;
        }
        return false;
    }

    //step 2 - choose an area (all quests in the area will be assigned to the Hero)
    public void chooseArea() {
        try {
            printBlankSpace();

            //load all the available areas
            ArrayList<Area> list = this.areaService.loadAll();

            //print all of them so user can pick up one
            groupPrint(list);

            String areaname="";
            boolean mark = false;
            while(!mark){
                //wait for the user to input
                print("Choose your area by its name:");
                areaname = scanner.next();
                mark = findAreaName(list,areaname) ? true : false;
            }

            //load the area which the user choose
            this.area = this.areaService.getObject(areaname);

            //load all the monsters reside in this area;
            this.monsters = this.monsterService.loadAllByAreaName(areaname);

            //show the area!
            SceneGenerator.showArea();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean findAreaName(ArrayList<Area> list, String name){
        for ( Area a:list ){
            if ( a.getName() == name )
                return true;
        }
        return false;
    }

    //step 3 - battle (kill one monster for completing one quest)
    public void battle() {
        //battle until user press q;
        while (scanner.nextLine()!="q") {
            String action = scanner.nextLine();
            System.out.println("\n" + action + "\n");
            switch (action) {
                case "e": //eat consumables
                    break;
                case "p": //physical damage
                    break;
                case "m": //magic damage
                    break;
                case "q": //quit
                    break;
                default:
                    print("-e- for eating; -p- for physical damage");
                    print("-m- for magic damage; -q- for quit");
                    break;
            }
        }

    }

    //step 4 - display the result (trigger: die or choose 'quit')
    public void displayReport(){

    }

    //step 5 - restore all the data back to normal and close the Scanner
    public void restore(){
        //the reason we need this is that every game will mess up the database
        //So it should be better that we restore all the data back via store procedure
        //So next time we could enjoy a new game
    }
}
