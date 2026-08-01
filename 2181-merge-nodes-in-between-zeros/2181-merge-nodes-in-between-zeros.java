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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode first = new ListNode(0);
        ListNode curr = first;
        int sum = 0;

        while(temp!=null){
            if(temp.val!=0) sum = sum + temp.val;
            else{
                ListNode sec = new ListNode(sum);
                curr.next = sec;
                curr = curr.next;
                sum = 0;
            }
            temp = temp.next;
        }
        return first.next;
    }
}