package com.chelkatrao.leetCode;

public class Solution12 {

    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        solution12.intToRoman(2);
    }

    public String intToRoman(int num) {
        if (num < 4) {

        }
        return "";
    }

}

/*
 ___________________
|  Symbol |   Value |
+-------------------+
|  I      |   1     |
|  V      |   5     |
|  X      |   10    |
|  L      |   50    |
|  C      |   100   |
|  D      |   500   |
|  M      |   1000  |
+-------------------+

 4   -   9 ni yasash uchun V (5) va X (10) ishlatiladi
 40  -  90 ni yasash uchun L (50) va C (100) ishlatiladi
 400 - 900 ni yasash uchun D (500) va M (1000) ishlatiladi

*/