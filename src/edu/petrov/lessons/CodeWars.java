package edu.petrov.lessons;

/**
 * Created by anton on 28/02/16.
 */
public class CodeWars {

    public static class Sum
    {
        public static int GetSum(int a, int b)
        {
            int sum = 0;
            for (int i = Integer.min(a, b); i <= Integer.max(a, b); i++) sum += i;
            return sum;
        }
    }

    public static class Ghostbusters {

        public static String ghostBusters(String building) {
            String result = "";
            int n = 0;
            for(int i = 0; i < building.length(); i++) {
                if(building.charAt(i) != ' ') {
                    result += building.charAt(i);

                }
                else
                    n++;
            }
            return n == 0 ? "You just wanted my autograph didn't you?" : result;
        }
    }

}


