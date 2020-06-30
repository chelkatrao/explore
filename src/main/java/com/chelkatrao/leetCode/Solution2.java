package com.chelkatrao.leetCode;

import java.math.BigInteger;

public class Solution2 {
    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(0, listNode0);
        ListNode listNode2 = new ListNode(0, listNode1);
        ListNode listNode3 = new ListNode(0, listNode2);
        ListNode listNode4 = new ListNode(0, listNode3);
        ListNode listNode5 = new ListNode(0, listNode4);
        ListNode listNode6 = new ListNode(0, listNode5);
        ListNode listNode7 = new ListNode(0, listNode6);
        ListNode listNode8 = new ListNode(0, listNode7);
        ListNode listNode9 = new ListNode(0, listNode8);
        ListNode listNode10 = new ListNode(0, listNode9);
        ListNode listNode11 = new ListNode(0, listNode10);
        ListNode listNode12 = new ListNode(0, listNode11);
        ListNode listNode13 = new ListNode(0, listNode12);
        ListNode listNode14 = new ListNode(0, listNode13);
        ListNode listNode15 = new ListNode(0, listNode14);
        ListNode listNode16 = new ListNode(0, listNode15);
        ListNode listNode17 = new ListNode(0, listNode16);
        ListNode listNode18 = new ListNode(0, listNode17);
        ListNode listNode19 = new ListNode(0, listNode18);
        ListNode listNode20 = new ListNode(0, listNode19);
        ListNode listNode21 = new ListNode(0, listNode20);
        ListNode listNode22 = new ListNode(0, listNode21);
        ListNode listNode23 = new ListNode(0, listNode22);
        ListNode listNode24 = new ListNode(0, listNode23);
        ListNode listNode25 = new ListNode(0, listNode24);
        ListNode listNode26 = new ListNode(0, listNode25);
        ListNode listNode27 = new ListNode(0, listNode26);
        ListNode listNode28 = new ListNode(0, listNode27);
        ListNode listNode29 = new ListNode(0, listNode28);
        ListNode listNode30 = new ListNode(0, listNode29);
        ListNode listNode31 = new ListNode(0, listNode30);
        ListNode listNode32 = new ListNode(0, listNode31);
        ListNode listNode33 = new ListNode(0, listNode32);
        ListNode listNode34 = new ListNode(0, listNode33);
        ListNode listNode35 = new ListNode(0, listNode34);
        ListNode listNode36 = new ListNode(0, listNode35);
        ListNode listNode37 = new ListNode(0, listNode36);
        ListNode listNode38 = new ListNode(0, listNode37);
        ListNode listNode39 = new ListNode(0, listNode38);
        ListNode listNode40 = new ListNode(0, listNode39);
        ListNode listNode2Final = new ListNode(1, listNode40);
//
        ListNode listNodeSecond4 = new ListNode(4);
        ListNode listNodeSecond6 = new ListNode(6, listNodeSecond4);
        ListNode listNodeSecond5Final = new ListNode(5, listNodeSecond6);

        Solution solution = new Solution();
        solution.addTwoNumbers(listNode2Final, listNodeSecond5Final);
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger result = nodeToArray(l1, BigInteger.ONE).add(nodeToArray(l2, BigInteger.ONE));
        return arrayToNode(new ListNode((result.remainder(BigInteger.valueOf(10))).intValue()), result.divide(BigInteger.valueOf(10)));
    }

    public BigInteger nodeToArray(ListNode l1, BigInteger ten) {
        if (l1.next == null) {
            return BigInteger.valueOf(l1.val).multiply(ten);
        } else {
            return BigInteger.valueOf(l1.val).multiply(ten)
                    .add(nodeToArray(l1.next, ten.multiply(BigInteger.valueOf(10))));
        }
    }

    public ListNode arrayToNode(ListNode l, BigInteger number) {
        if (number.equals(BigInteger.valueOf(0))) {
            return l;
        }
        ListNode listNode = new ListNode((number.remainder(BigInteger.valueOf(10))).intValue());
        l.next = listNode;
        arrayToNode(listNode, number.divide(BigInteger.valueOf(10)));
        return l;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}