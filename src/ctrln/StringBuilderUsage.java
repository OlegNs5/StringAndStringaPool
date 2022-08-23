package ctrln;

public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JAVA! Salut Lume"); //.append POTI ADAUGA UN STRING la o classa sau obiect
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.indexOf("Sa"));
        System.out.println(stringBuilder.replace(0,4,"   Hello"));
        System.out.println(stringBuilder.substring(0,7));//afiseaza de la 0 la 6
        System.out.println(stringBuilder.toString().trim()); //sterge spatiile din string
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.insert(12,"h"));
        System.out.println(stringBuilder.delete(0,3).delete(6,7).replace(6,12," Salut"));

    }
}
