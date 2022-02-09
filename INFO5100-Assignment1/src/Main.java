import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashSet;

public class Main {
    public static void main(String args[]){
        // Q1
        System.out.println(isPalindrome("abc")); //false
        System.out.println(isPalindrome("abccba")); //true
        System.out.println("----------");
        //Q2
        System.out.println(isUnique("abcde")); //true
        System.out.println(isUnique("abcda")); //false
        System.out.println("----------");
        //Q3
        System.out.println(isDuplicates("abcd")); //false
        System.out.println(isDuplicates("abca")); //true
        System.out.println("----------");
        //Q4
        System.out.println(areAnagrams("bnini","nibni")); // true
        System.out.println(areAnagrams("bai","ban")); // false
        System.out.println("----------");
        //Q5
        System.out.println(isLeap(2000)); //true
        System.out.println(isLeap(3000)); //false
        System.out.println(isLeap(2004)); //true
        System.out.println(isLeap(2005)); //false
        System.out.println("----------");
        //Q6
        System.out.println(phoneBill(200)); //155;
        System.out.println(phoneBill(300));//195
        System.out.println("----------");
        //Q7
        System.out.println(canConstructed("abcde","abc")); // true
        System.out.println(canConstructed("nid","na")); //false
        System.out.println("----------");
        //Q8
        getGrade(59); //F
        getGrade(62); //D
        getGrade(72); //C
        getGrade(85); //B
        getGrade(98); //A
        System.out.println("----------");
        //Q9
        Book b =createBook("programmer",1002,"technology",22);
        System.out.println(b.getName());
        System.out.println(b.getBookID());
        System.out.println(b.getGenres());
        System.out.println(b.getPrice());
        System.out.println("-----------");
        //Q10
        System.out.println(getBoxVolume(10,20,30)); //6000
        System.out.println(getBoxVolume(11,20,33)); //7260
    }

    //Question 1: Write a program find if String is Palindrome?
    public  static boolean isPalindrome(String s){
        String str = new StringBuilder(s).reverse().toString();
        return s.equals(str);
    }

    //Question2: Write a program to check if a string has all unique characters.
    public static boolean isUnique(String s){
        HashSet<Character> str = new HashSet<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            boolean result = str.add(ch[i]);
            if(result == false){
                return false;
            }
        }
        return true;
    }

    //Question 3. Write a program to check if string contains duplicates
    public static boolean isDuplicates(String s){
        char chars[] = s.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            for (int j = i + 1; j< chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //Question 4: Write a program to check if two strings are anagrams.
    // Anagrams are strings which can be made by rearranging characters in string.
    public static boolean areAnagrams(String a, String b){
        int[] record = new int[26];
        for (char c : a.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : b.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        for (int i : record) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    //Question 5:  Write a program to determine whether the year is a leap
    // year or not.
    public static boolean isLeap(int year){
        if(year % 4 == 0 & year % 100 != 0 || year% 400 == 0){
            return true;
        }
        return false;
    }

    //Question 6: Write a program to calculate the monthly telephone bills
    // as per the following rule: Minimum $ 200 for up to 100 calls.
    // Plus $ 0.60 per call for next 50 calls.
    // Plus $ 0.50 per call for next 50 calls.
    // Plus $ 0.40 per call for any call beyond 200 calls.
    public static double phoneBill(int call){
        double bill = 0;
        int num = 0;

        if(call <= 100){
            num = 1;
        }else if(call >100 &call <=150) {
            num = 2;
        }else if(call > 150 &call <=200){
            num = 3;
        }else{num = 4;}

        switch(num){
            case 1:
                bill = (float) 200;
                break;
            case 2:
                bill = 200 + (call - 100) * 0.6;
                break;
            case 3:
                bill = 200 +  50* 0.6 + (call - 150) * 0.5;
                break;
            case 4:
                bill = 200 +  50 * 0.6 + 50 * 0.5 + (call - 200) * 0.4;
                break;
        }
        return bill;
    }

    //Question 7: Given two strings ransomNote and magazine, return true
    // if ransomNote can be constructed from magazine and false otherwise.
    public static boolean canConstructed(String s, String t){
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']+=1;}
        for (char c : t.toCharArray()) {
            if ( --cnt[c - 'a']  < 0)
                return false;
        }
        return true;
    }

    //Question 8 : Write a program that prompts the user’s grade.
    // Your program should display the corresponding meaning of grade as per
    // the following table
    //Grade Meaning A Excellent  B Good   C Average  D Deficient   F Failing
    public static void getGrade(int grade){
        if(grade >=90){
            System.out.println("A-Excellent");
        }else if(grade >=80){
            System.out.println("B-Good");
        }else if(grade >=70){
            System.out.println("C-Average");
        }else if(grade >=60){
            System.out.println("D-Deficient");
        }else{
            System.out.println("F-Failing");
        }
    }


    //Question 9: Write a program to create a book class.
    public static Book createBook(String n, int bi,String ge,double p){
        Book book = new Book(n,bi,ge,p);
        return book;
    }
    
    //Question 10: Implement a class Box,Initialize the value through constructor. 
    //Write a function to calculate the box volume.
    public static double getBoxVolume(double w,double h, double d){
        Box box = new Box(w,h,d);
        double volume = box.calculateVolume();
        return volume;
    }

}
