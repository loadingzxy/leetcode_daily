package link_lists;

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 */

public class IsPalindromeLinkList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        List<Integer> arr =  new ArrayList<>();
        ListNode p = head;
        while (p!=null){
            int val = p.val;

            arr.add(val);
            p = p.next;
        }


        return isPalindromeInt(arr);
    }

    private static boolean isPalindromeInt(List<Integer> arr) {
        int len = arr.size();
        for (int i = 0; i < len/2; i++) {
            if(!arr.get(i).equals(arr.get(len-i-1))){
                return false;
            }
        }
        return true;
    }




}
