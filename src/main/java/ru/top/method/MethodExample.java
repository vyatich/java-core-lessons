package ru.top.method;

public class MethodExample {

    private static int age = 33;

    public static void main(String[] args) {
        printNameAndAge("Vasiliy", 30);
        System.out.println(getAgeIndex(10));

        printNameAndAge("Viktor", 24);
    }

    public static void printNameAndAge(String name, Integer age) {
        if (age > 20) {
            return;
        }
        System.out.println(name + " " + age);
    }

    //public
    //protected
    //default, no-modifier, package-private
    //private
    public static Integer getAgeIndex(Integer age) {
        int ageIndex = 100 * age;
        return ageIndex;
    }
}
