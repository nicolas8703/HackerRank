/**
 * timeConversion
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 22.09.2020
 *
 * https://www.hackerrank.com/challenges/time-conversion?h_r=profile
 */


public class timeConversion {

    static String timeConversion(String s) {

        String s1 = s.substring(s.length() - 2, s.length());
        String s2 = s.substring(0,8);
        if(s1.equalsIgnoreCase("AM")){
            if(s2.substring(0,2).equalsIgnoreCase("12")){
                return "00" + s2.substring(2);
            }
            return s.substring(0,8);
        }
        if(s2.substring(0,2).equalsIgnoreCase("01")){
            return "13" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("02")){
            return "14" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("03")){
            return "15" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("04")){
            return "16" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("05")){
            return "17" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("06")){
            return "18" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("07")){
            return "19" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("08")){
            return "20" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("09")){
            return "21" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("10")){
            return "22" +s2.substring(2);
        }
        if(s2.substring(0,2).equalsIgnoreCase("11")){
            return "23" +s2.substring(2);
        }
        return s2;
    }
    }
