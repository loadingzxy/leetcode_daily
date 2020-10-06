/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 *  
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */

public class MergeTwoLists {
    public static class ListNode {
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

    static class Solution {
        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode node = new ListNode(-1);
            ListNode p = node;
            do {
                if(l1.val<=l2.val){
                    p.next = l1;
                    l1 = l1.next;
                }else {
                    p.next = l2;
                    if (l2.next==null){
                        break;
                    }
                }
                p = p.next;
            }while (l1.next!=null);
            if(l1.next == null){
                p.next = l2;
            }
            if (l2.next == null){
                p.next = l1;
            }
            return p.next;
        }
    }

    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node14 = new ListNode(4);
        ListNode node21 = new ListNode(1);
        ListNode node23 = new ListNode(3);
        ListNode node24 = new ListNode(4);

        node11.next = node12;
        node12.next = node14;
        node21.next = node23;
        node23.next = node24;

        ListNode mergeTwoLists = Solution.mergeTwoLists(node11, node21);
        System.out.println(mergeTwoLists);

    }
}
