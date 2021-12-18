package ru.mirea.dz17and18 ;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        //
        Pattern pattern1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + pattern1.matcher(str).matches());
        str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(str + ": " + pattern1.matcher(str).matches());
        str  = "18340abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + pattern1.matcher(str).matches());
        str  = "2abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + pattern1.matcher(str).matches());
        System.out.println();
        //

        Pattern pattern2 = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        str = "aE:dC:cA:56:76:54";
        System.out.println(str + ": " + pattern2.matcher(str).matches());
        str  = "aE:dC:cA:dE:cA:aB";
        System.out.println(str + ": " + pattern2.matcher(str).matches());
        str  = "aE:56:56:56:76:54";
        System.out.println(str + ": " + pattern2.matcher(str).matches());
        System.out.println();
        //

        Pattern pattern3 = Pattern.compile("(?:^|[\\n\\r]|[^\\w\\d\\.])([1-9]\\d*(?:.\\d{2}?\\s*(?:USD|EU|RUR)))");
        str = "0.0000001 EU";
        System.out.println(str + ": " + pattern3.matcher(str).find());
        str  = "23.7854 RUR";
        System.out.println(str + ": " + pattern3.matcher(str).find());
        str  = "22 UDD, 0.002 USD";
        System.out.println(str + ": " + pattern3.matcher(str).find());
    }
}
