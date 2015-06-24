/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class insertionSortList{
    public ListNode insertionSortList(ListNode head) {
        if(head == null)
          return null;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;
        //pre.next = head;
        while(cur !=null){
            ListNode next = cur.next;
            pre = dummy;
            while(pre.next!=null && pre.next.val <=cur.val){//until we found the element we need to change.every time compare from the first element
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
            
        }
        return dummy.next;
    }
}