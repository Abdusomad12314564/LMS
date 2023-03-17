import lms.Group;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Жумуштарым көбөйүп сабак караганга жетишпейтам, утуру бошогодо кылып олтуруп группа түзүүгө келген элем.
        Group group = new Group();
        Group.cloc();
        byte num = new Scanner(System.in).nextByte();
        switch (num) {
            case 1 -> {
                System.out.print("Email почтаңызды жазыңыз:");
                group.eEmail(new ArrayList<>(Collections.singleton(new Scanner(System.in).nextLine())));
                System.out.print("Паролуңузду жазыңыз:");
                group.pPassword(new Scanner(System.in).nextLine());
            }
            case 2 -> {
                System.out.print("Пароль ойлоп табыңыз: ");
                group.newPassword(new Scanner(System.in).nextLine());
            }
        }
        group.text();
        byte num2 = new Scanner(System.in).nextByte();
        switch (num2) {
            case 1 -> group.newGroup(new ArrayList<>());
        }
    }
}


