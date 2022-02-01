package Task2;

import java.util.Scanner;

public class Calc {

    static Object getResInputStr(String str1, String str2) {

        Scanner sc = new Scanner(System.in);

        if (str1.equals("1")) {

            FunctionalInterfaceClass<String> reverseStr = (string) -> {
                StringBuffer buffer = new StringBuffer(string);
                buffer.reverse();
                return String.valueOf(buffer);
            };

            return reverseStr.getResult(str2);


        } else if (str1.equals("2")) {

            FunctionalInterfaceClass<Integer> factorialO = (y) -> {
                int factorial = 1;
                for (int i = 1; i <= y; i++)
                    factorial = i * factorial;
                return factorial;
            };

            int o = Integer.parseInt(str2);
            return factorialO.getResult(o);

        }

        sc.close();
        return null;
    }
}
