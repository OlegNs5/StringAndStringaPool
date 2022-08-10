import java.nio.charset.StandardCharsets;

public class StringUsege {

    public static void main(String[] args) {

        String stringOne = "This is Java";//acesta este un string literal
        String stringTwo = "This is Java";//acesta este un string literal
        String stringThree = new String("This is Java");//acest obiect este tinut in heap nu in string pool
        String stringFour = new String(stringOne);

        System.out.println("stringOne.equals(stringTwo): " + stringOne.equals(stringTwo) );
        System.out.println("stringOne == stringTwo: " + (stringOne == stringTwo));
        System.out.println("stringOne == stringTwo: " + stringOne == stringTwo); //operatorul de concatenare concateneaza prima oara "stringOne == stringTwo: " + stringOne si dupa le egaleaza
        System.out.println("stringOne.equals(stringThree): " + stringOne.equals(stringThree));
        System.out.println("stringOne == stringThree: " + (stringOne == stringThree));
        System.out.println("stringOne.equals(stringFour): " + stringOne.equals(stringFour));
        System.out.println("stringOne == stringFour: "+ (stringOne == stringFour));

        String stringFive = new String(stringOne.getBytes());
        System.out.println("stringOne.equals(stringFive): " + stringOne.equals(stringFive));
        System.out.println("stringOne == stringFive: " + (stringOne == stringFive));

        String stringSix = "JAVA";
        char[] chars = {'J','A','V','A'};
//        System.out.println(stringSix + chars);
        String stringSeven = new String(chars);
        System.out.println(stringSix + stringSeven);

        System.out.println("stringSix.equals(stringSeven): " + stringSix.equals(stringSeven));
        System.out.println("stringSix == stringSeven: " + (stringSix == stringSeven));

        StringBuilder stringBuilder =   new StringBuilder("JAVA");
        System.out.println("stringSix.equals(stringBuilder.toString()): " + stringSix.equals(stringBuilder.toString()));
        System.out.println("stringSix.equals(stringBuilder): " + stringSix.equals(stringBuilder));
//     System.out.println(stringSix == stringBuilder); // nu este permis in java, sunt obiecte diferite din calsse diferite//ierarhia di Java nu permite acest lucru
    }
}