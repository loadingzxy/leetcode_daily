package link_lists;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */

public class ReverseList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public static ListNode reverseList(ListNode head) {
            if(head == null||head.next==null){
                return head;
            }


            ListNode node = new ListNode(-1);
            ListNode p1 = head;
            ListNode p2 = node;
            //1逻辑
            node.next = p1;
            p1 = p1.next;
            p2 = node.next;
            p2.next = null;
            while (p1.next!=null){
                node.next = p1;
                p1 = p1.next;
                node.next.next = p2;
                p2 = node.next;
            }
            //最后一个
            node.next = p1;
            p1.next = p2;
            return node.next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode list = Solution.reverseList(node1);
        while (list.next!=null){
            System.out.println(list.val);
            list = list.next;
        }

    }
}
