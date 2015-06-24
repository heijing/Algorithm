/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class mergeSortList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode helper = new ListNode(0);
        
        helper.next = l1;
        ListNode pre = helper;
        while(l1 !=null && l2 != null){
            if(l1.val<l2.val){
              l1 = l1.next;
            }
            else{
                ListNode next = l2.next;
                l2.next = pre.next;
                pre.next = l2;
                l2  = next;
                
            }
            pre = pre.next;
        }
        if(l2!=null){
            pre.next = l2;
        }
         return helper.next;
        
    }
}