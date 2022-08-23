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
                                        //Citeva metode ajutatoare prntru Stringuri//
        stringOne = "This is Java Language!";
        System.out.println(stringOne.substring(2)); //"substring" e un vector(array)incepind de la 0 pina la indexul indicat inclusiv
        System.out.println(stringOne.substring(5,9)); //al doilea index nu se foloseste inclusiv adica "is J" care "J" este indexul 8
        System.out.println(stringOne.replace("i","z")); //"replace" inlocuieste un caracter cu alt caracter
        System.out.println(stringOne.replace("is","as"));//sau secvente
        System.out.println(stringOne.charAt(9));//vedem ce caracter avem pe pozitia 9 adica "a"
        System.out.println("Aci se concateneaxa doua stringuri stringOne.concat(stringTwo) "+stringOne.concat(stringTwo));//"concat" inseamna CONCATENARE in cazul in care nu vrei sa concatenez folosind "+"
        System.out.println(stringOne.indexOf("a")); // ne arata pe ce pozitie se afla indexul "a" pentru prima data adica 9
        System.out.println(stringOne.length());// ne arata cite caractere avem in string
        System.out.println(stringOne.startsWith("Th"));//ne spune daca stringul incepe cu caracterele Ex"Th"
        System.out.println(stringOne.endsWith("!"));
        System.out.println(stringOne.startsWith("Th",0));
//        System.out.println(stringOne.startsWith(""));
         }
}
