/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0), ptr1 = l1, ptr2 = l2, newPtr = newList;
        int rem = 0, sum = 0;
        while(ptr1 != null && ptr2 != null){
            sum = rem + ptr1.val + ptr2.val;
            rem = sum/10;
            newPtr.next = new ListNode(sum%10);
            ptr1 = ptr1.next; ptr2 = ptr2.next; newPtr = newPtr.next;
        }

        while(ptr1 != null){
            sum = rem + ptr1.val;
            rem = sum/10;
            newPtr.next = new ListNode(sum%10);
            ptr1 = ptr1.next; newPtr = newPtr.next;
        }

        while(ptr2 != null){
            sum = rem + ptr2.val;
            rem = sum/10;
            newPtr.next = new ListNode(sum%10);
            ptr2 = ptr2.next; newPtr = newPtr.next;
        }
        if(rem != 0){
            newPtr.next = new ListNode(rem);
        }
        return newList.next;
    }
}
