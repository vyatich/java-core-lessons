package ru.top.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExample {

    public static void main(String[] args) {
        String str = "Write once, run anywhere";
        String[] split = str.split("[A-z]");
        System.out.println(Arrays.toString(split));

        String phone = "+79023423416";
        System.out.println(phone.replaceAll("^10", "20"));

        Pattern pattern = Pattern.compile("^\\+7.{10}");
        Matcher matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }
}
