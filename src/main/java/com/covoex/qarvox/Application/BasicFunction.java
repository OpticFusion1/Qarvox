package com.covoex.qarvox.Application;

import com.covoex.qarvox.Logic.Person;

import java.util.ArrayList;
import java.util.Collections;

import static com.covoex.qarvox.Application.Input.s;
import static com.covoex.qarvox.Application.Input.worldInput;
import static com.covoex.qarvox.Application.Tutorial.tutorial;

/**
 * @author Myeongjun Kim
 */

public class BasicFunction {
    public static Person mainCharacter = new Person();

    public static void programStart() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Qarvox is a text-based java RPG Game created by Myeongjun Kim.");
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        System.out.print("Type in your character's name" + ": ");
        mainCharacter.setName(s.nextLine());
        System.out.println();
        System.out.print(
                "Do you want to play the tutorial? Press [y] or [n] and [Enter]" + ": ");

        if (yesOrNo()) {
            tutorial();
        } else {
            System.out.println();
            System.out.print("What world do you want to go? World: ");
            worldInput();
        }

    }

    public static boolean yesOrNo() {
        String string = s.nextLine();
        if (string.contains("y")) {
            return true;
        } else if (string.contains("n")) {
            return false;
        } else {
            System.out.print("Press [y] or [n] and [Enter]: ");
            yesOrNo();
        }
        return false;
    }

    /**
     * get random int between [-1 - 1]
     */
    public static int getRandomInt() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(0);
        arrayList.add(1);
        Collections.shuffle(arrayList);
        return arrayList.get(0);
    }

    public static boolean fiftyFifty() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        Collections.shuffle(arrayList);
        return arrayList.get(0).equals(0);
    }
}