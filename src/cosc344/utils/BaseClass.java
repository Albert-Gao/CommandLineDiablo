package cosc344.utils;

import java.util.ArrayList;

/**
 * Provides the base print and group print methods.
 */
public class BaseClass {
    protected static void print(String text) {
        System.out.println(text);
    }

    protected static void print(boolean bol){
        String text = bol?"true":"false";
        print(text);
    }
    
    protected static void print(int number) {
        System.out.println(number);
    }

    /**
     * This methods is used to create 2 blank lines
     * to the bash to provide more space in order to
     * get a better layout.
     */
    protected static void printBlankSpace() {
        print("");
        print("");
    }

    protected static <T> void groupPrint( ArrayList<T> list ){
        list.forEach(System.out::println);
    }
}
