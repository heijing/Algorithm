/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        int i = 1;
        while(pre !=null && i<m ){
            pre = pre.next;
            i++;
        }
        if(i<m)
          return head;
        ListNode mNode = pre.next;
        ListNode cur = mNode.next;
        
        while(cur !=null && i<n){
            ListNode next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            mNode.next = next;
            cur = next;
            i++;
            
        }
         return dummy.next;
    }
}
