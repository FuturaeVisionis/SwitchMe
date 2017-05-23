package ASwitch;

import java.util.Scanner;

/**
 * Created by ronald on 11/09/16.
 */
public class BlackPython {


    public static void ReRun() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a code between 1234 and 1260 to get access to unlock pandora's bocks: ");
        int delta = scanner.nextInt();

        String code;

        switch (delta) {
            case 1255:
                code = "LadyBird";
                break;
            case 1258:
                code = "BlueAngel";
                break;
            case 1235:
                code = "BlueEyes";
                break;
            default:
                code = "Invalid code Hoss, try again! Remember between 1234 and 1260!";
                break;

        }
        System.out.println(code);

        if (delta == 1255 || delta == 1258 || delta == 1235) {
            System.out.println("You cracked the code! Your secret word is " + code + " CONGRATULATIONS!");

        } else {

            int pencil;

            Scanner crayon = new Scanner(System.in);
            System.out.println("Can't remember, is this your second or third try?");
            pencil = crayon.nextInt();

            if (pencil < 3) {
                ReRun();

            }else{
                System.out.println("Game over Hoss!! Tries are up.");


            }
        }}

    public static void main(String[] args) {

        ReRun();
    }

}

