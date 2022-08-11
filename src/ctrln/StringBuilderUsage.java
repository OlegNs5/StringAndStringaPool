package ctrln;

public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.toString());
        stringBuilder.append("JAVA! "); //.append POTI ADAUGA UN STRING lao classa sau obiect
        System.out.println(stringBuilder);
        stringBuilder.append("Salut Lume");
        System.out.println(stringBuilder);

    }
}
