package com.chelkatrao.leetCode;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.convert("ABCD", 3));
    }

    public String convert(String s, int numRows) {
        if (s.equals("") == true) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] c = s.toCharArray();
        List<Character[]> listCharArray = new ArrayList<>();

        boolean isColumn = true;
        int countColumn = 0;

        boolean isAngular = false;
        int countAngular = numRows - 2;

        Character[] ch = new Character[numRows];

        for (int i = 0; i < c.length; i++) {
            if (isColumn) {
                if (countColumn <= numRows - 1) {
                    ch[countColumn] = c[i];
                    countColumn++;
                    if (i == c.length - 1) {
                        listCharArray.add(ch);
                    }
                } else {
                    listCharArray.add(ch);
                    ch = new Character[numRows];
                    countColumn = 0;
                    isColumn = false;
                    isAngular = true;
                }
            }
            if (isAngular) {
                if (countAngular > 0) {
                    ch[0] = ' ';
                    ch[countAngular] = c[i];
                    ch[numRows - 1] = ' ';
                    countAngular--;
                    if (i == c.length - 1) {
                        listCharArray.add(ch);
                    }
                } else {
                    listCharArray.add(ch);
                    ch = new Character[numRows];
                    countAngular = numRows - 2;
                    isColumn = true;
                    isAngular = false;
                    i--;
                }
            }
        }

        for (int i = 0; i < (listCharArray.get(0)).length; i++) {
            for (int j = 0; j < listCharArray.size(); j++) {
                Character cc = listCharArray.get(j)[i];
                if (cc != null && !cc.equals(' '))
                    stringBuilder.append(cc);
            }
        }

        return stringBuilder.toString();
    }

}
