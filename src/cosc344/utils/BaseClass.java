package cosc344.utils;

import java.util.ArrayList;

/**
 * Provides the base print and group print methods.
 */
public class BaseClass {
    protected static void print(String text) {
        System.out.println(text);
    }

    protected static void print(int text) {
        System.out.println(text);
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
        for (T item:list){
            item.toString();
        }
    }
}
