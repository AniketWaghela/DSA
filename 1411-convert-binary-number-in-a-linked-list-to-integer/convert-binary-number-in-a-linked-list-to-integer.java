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
    public int getDecimalValue(ListNode head) {
        
        int count =-1,ans=0;
        ListNode pointer = head;
        while( pointer != null ){
            count++;
            pointer = pointer.next;
        }
        pointer = head;
        while(pointer != null){
            ans += (int)(Math.pow(2,count--))  * pointer.val;
            pointer = pointer.next;
        }


        return ans;
    }
}