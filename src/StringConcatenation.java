public class StringConcatenation {
    public static void main(String[] args) {
        String stringOne = "This is";
        String stringTwo = "JAVA!";
        String stringThree = stringOne + " " + stringTwo;
        System.out.println(stringThree);

        String stringFour = stringThree + " " + 2;
        System.out.println(stringFour);

        String stringFive = 2 +" "+ stringThree;
        System.out.println(stringFive);

        String stringSix = stringThree + false; // aici booleanl "false" este transformat in String WOW
        System.out.println(stringSix);

        String stringEight = stringThree + null;
        System.out.println(stringEight);

        String stringNine = "" + true + 1; // acest empty String "" forteaza tipurile de date true si int(1) sa fie string
        System.out.println(stringNine);

        String stringTen = "JAVA!";
        stringTen += 1;
        stringTen = stringTen + 1 + 'e' ;
        System.out.println(stringTen);

    }
}
