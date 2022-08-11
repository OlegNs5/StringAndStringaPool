package ctrln;

public class StringBuferUsege {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer("1234");
        StringBuffer stringBuffer3 = new StringBuffer(1234); //daca transmitem un int, aceasta va fi capacitatea ex:1234
        CharSequence charSequence = "Eu invat JAVA!";
        StringBuffer stringBuffer4 = new StringBuffer(charSequence);
        stringBuffer.append(1);
        stringBuffer.append("2");
        stringBuffer.append(true);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer3);
        System.out.println(stringBuffer4);
    }
}
