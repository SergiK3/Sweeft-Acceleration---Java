package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ProblemSet {
    //1.     დაწერეთ ფუნქცია, რომელსაც გადაეცემა ტექსტი  და აბრუნებს პალინდრომია თუ არა.
    // (პალინდრომი არის ტექსტი რომელიც ერთნაირად იკითხება ორივე მხრიდან).
    //Boolean isPalindrome(String text);

    public static boolean isPalindrome(String text) {

        char[] arr = text.toCharArray();
        char[] arr1 = new char[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arr1[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        if (Arrays.equals(arr, arr1)) {
            return true;
        }
        return false;
    }
//2.     გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა (თეთრებში)
// და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.

    public static int minSplit(int coins) {
        int fiftyRemainder = coins % 50;
        int counter = coins / 50;

        int twentyRemainder = fiftyRemainder % 20;
        counter += fiftyRemainder / 20;

        int tenRemainder = twentyRemainder % 10;
        counter += twentyRemainder / 10;

        int fiveRemainder = tenRemainder % 5;
        counter += tenRemainder / 5;

        int oneRemainder = fiveRemainder % 1;
        counter += fiveRemainder / 1;

        return counter;

    }
    //3.     მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს მასივი და
    // აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში არ შედის.

    public static int notContains(int... arr) {
        int integers = 1;

        for (int i = 0; ; i++) {
            if (arr[i] > 0 && arr[i] != integers) {
                return integers;
            } else if (arr[i] <= 0) {
                continue;
            } else {
                integers++;
            }
        }
    }
    //4.     მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან. დაწერეთ ფუნქცია რომელიც აბრუნებს ფრჩხილები არის
    // თუ არა მათემატიკურად სწორად დასმული.
    // Boolean isProperly(String sequence);

    // მაგ: (())())) სწორი მიმდევრობაა, ())() არასწორია

    public static boolean isProperly(String sequence) {
        char[] arr = sequence.toCharArray();
        if (arr.length % 2 == 1) {
            return false;
        }
        if (arr[0] != '(') {
            return false;
        }
        if (arr[arr.length - 1] != ')') {
            return false;
        }
        return true;
    }
    //abosliturad yvela shemtxvevas ver gadis

//გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით.
// დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
// Int countVariants(Int stearsCount);

    private static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }


    public static int countVariants(int stairsCount)
    {
        return fib(stairsCount + 1);
    }


}