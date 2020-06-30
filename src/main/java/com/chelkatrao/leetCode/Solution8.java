package com.chelkatrao.leetCode;

public class Solution8 {

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();

        int result = solution8.myAtoi("-12--3234");
        System.out.println(result);
    }

    public int myAtoi(String str) {
        String firstFilter = str.trim();
        String filteredSecond = firstFilter.replace("+-", "X");
        String filtered3 = filteredSecond.replace("-+", "X");
        String filtered4 = filtered3.replace("--", "X");
        str = filtered4.replace("++", "X");


        if (str.isEmpty())
            return 0;

        char[] ch = str.toCharArray();

        if (ch.length == 1 && (ch[0] == '-' || ch[0] == '+')) {
            return 0;
        }

        int beginIndex = 0;
        int endIndex = 0;

        if ((ch[0] == '-' || ch[0] == '+')) {
            if (ch.length > 0 && isNumber(ch[1]))
                endIndex = 1;
        }
        for (int i = 0; i < ch.length; i++) {
            if (!isNumber(ch[0]) && ch[0] != '-' && ch[0] != '+') {
                return 0;
            }
            if (isNumber(ch[i]) == true) {
                if (i + 1 < ch.length) {
                    if (isNumber(ch[i + 1]) != true) {
                        endIndex = i + 1;
                        break;
                    }
                }
                endIndex = i + 1;
            } else if((ch[i] != '-' && ch[i] != '+')) {return 0;}
        }

        String substring;
        substring = str.substring(beginIndex, endIndex);
        if (substring.equals("-") || substring.equals("+")) {
            return 0;
        }
        long number;
        try {
            number = Long.parseLong(substring);
        } catch (Exception e) {
            number = Double.valueOf(substring).longValue();
        }
        if (Integer.MIN_VALUE > number)
            return Integer.MIN_VALUE;

        if (Integer.MAX_VALUE < number)
            return Integer.MAX_VALUE;

        return (int) number;
    }

    public boolean isNumber(char ch) {
        boolean checkNumber = false;
        switch (ch) {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '0':
                checkNumber = true;
        }
        return checkNumber;
    }

}
