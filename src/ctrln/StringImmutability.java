package ctrln;

public class StringImmutability {
    public static void main(String[] args) {
        String stringOne = "wxyz";
        String stringTwo = new String("wxyz");
        String stringTrhee = stringOne.toUpperCase();//toUpperCase transforma toate literele mici in litere Mari//
        String stringFour = stringTwo.toUpperCase();
        stringOne.toUpperCase();
        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println(stringTrhee);
        System.out.println(stringFour);
        System.out.println("Linia 12: stringOne.toUpperCase() " + stringOne.toUpperCase());
        System.out.println("Linia 13: stringTwo.toUpperCase() " + stringTwo.toUpperCase());

        String stringFive = "   1234  ";
        stringFive.trim();
        System.out.println(stringFive);
        System.out.println(stringFive.trim());//.trim(); sterge toate spatiile goale dintr-un string

         }
}
