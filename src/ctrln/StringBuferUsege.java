package ctrln;

public class StringBuferUsege {
    public static void main(String[] args) {
        CharSequence charSequence = "Eu invat JAVA";
        StringBuffer stringBuffer = new StringBuffer(charSequence);
        System.out.println(stringBuffer.append("!"));
        System.out.println(stringBuffer.indexOf("JAVA"));
        System.out.println(stringBuffer.insert(9,"Java").delete(13,17));
        System.out.println(stringBuffer.charAt(9)); //Ne arata Litera cu numarul "9" adica "J"
        System.out.println(stringBuffer.replace(8 ,stringBuffer.length(),"!"));
    }
}
