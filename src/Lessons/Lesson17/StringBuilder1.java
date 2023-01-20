package Lessons.Lesson17;

import java.util.Arrays;

public class StringBuilder1 {
    public static void main(String[] args) {
        String myString = "I love Java!";
        String myString1 = "I love Java!";
        String[] myStringArray = {myString, myString1};
        System.out.println(myStringArray);
        System.out.println(Arrays.toString(myStringArray));
        System.out.println(myString);

        //----------------- StringBuffer----------------

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer("Not empty");
        stringBuffer.append(";");
        stringBuffer.append(false);
        stringBuffer.append(";");
        stringBuffer.append(2);
        stringBuffer.append(";");
        System.out.println(stringBuffer.reverse());
        stringBuffer1.insert(0, "Java ");
        System.out.println(stringBuffer1);

        //----------------- StringBuilder----------------

        String numbers = "0123456789";
        StringBuilder stringBuilder = new StringBuilder(numbers);
        System.out.println(stringBuilder.substring(3));
        System.out.println(stringBuilder.substring(4,8));
    }
}
