/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class mergeKSortedListHeap {
    public ListNode mergeKSortedListHeap(ListNode[] lists) {
        // write your code here
      if(lists.length == 0 || lists == null)
        return null;
     PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(10,new Comparator<ListNode>(){  
          public int  compare(ListNode l1,ListNode l2){
              return l1.val-l2.val;
          }
      });
      for(int i = 0;i<lists.length;i++){
          ListNode node = lists[i];
          if(node != null){
              heap.offer(node);
          }
      }
      ListNode head = null;
      ListNode pre = null;
      while(heap.size()>0){
          ListNode cur = heap.poll();
          if(head == null){
              head = cur;
              pre = head;
          }
          else{
              pre.next = cur;
          }
          pre = cur;
          if(cur.next != null){
              heap.offer(cur.next);
          }
      
       
    }
    return head;
}
}

