/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
          return null;
        ListNode walker = head;
        ListNode runner = head;
        int count = 0;
        while(runner != null && count <n){
            runner = runner.next ;
            count++;
        }
        if(count < n)//if n bigger than list length
          return head;
        if(runner == null)// if n equals list length
          return head.next;
        
        while(runner.next != null){//whether go to the end, the next is null
            runner = runner.next;
            walker = walker.next;
        }

           walker.next = walker.next.next;
        return head;
    }
}