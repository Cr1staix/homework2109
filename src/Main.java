//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        taskA();
        taskB();
        taskC();
        taskCv2();
    }

    static void taskA() {
        String text = "А роза упала на лапу Азора 12 !";
        text = text.replaceAll("[^а-яА-Яa-zA-Z]", "");
        StringBuilder sb = new StringBuilder(text);
        String text2 = sb.reverse().toString();
        System.out.println("a) " + text.equalsIgnoreCase(text2));
    }

    static void taskB() {
        String text = "А роза упала на лапу Азора 12 !";
        text = text.replaceAll("[^а-яА-Яa-zA-Z]", "");
        text = text.toLowerCase();
        boolean isPalindrome = true;
        int lastIndex = (text.length() - 1);
        for (int i = 0; i < text.length() / 2; i++) {
            char startChar = text.charAt(i);
            char endChar = text.charAt(lastIndex);
            if (startChar == endChar) {
                lastIndex--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("b) " + isPalindrome);
    }

    static void taskC() {
        int number = 1234321;
        String str = String.valueOf(number);
        int halfString = (str.length() / 2);
        String str1 = str.substring(0, (halfString + 1));
        String str2 = str.substring(halfString);
        StringBuilder sb = new StringBuilder(str2);
        String reversStr2 = sb.reverse().toString();
        int oneHalfNumber = Integer.parseInt(str1);
        int twoHalfNumber = Integer.parseInt(reversStr2);
        boolean isPalindrome = false;
        if (oneHalfNumber == twoHalfNumber) {
            isPalindrome = true;
        }
        System.out.println("c) " + isPalindrome);
    }
    static void taskCv2(){
        int number = 1234321;
        String str = String.valueOf(number);
        int lastIndex = (str.length() - 1);
        boolean isPalindrome = true;
        for(int i = 0; i < str.length(); i++){
            char startHalf = str.charAt(i);
            char endHalf = str.charAt(lastIndex);
            if(startHalf == endHalf){
                lastIndex--;
            }else {
                isPalindrome = false;
                break;
           }
        }
        System.out.println("Ещё один вариант C) " + isPalindrome);
    }
}