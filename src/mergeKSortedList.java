/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class mergeKSortedList {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        if(lists == null || lists.size() == 0)
          return null;
        return helper(lists,0,lists.size()-1);
    }
     public ListNode helper(List<ListNode> lists,int l , int r){
         if(l<r){
             int m = (l+r)/2;
             return merge (helper(lists,l,m),helper(lists,m+1,r));
         }
         return lists.get(l);
     }
     public ListNode merge(ListNode l1,ListNode l2){
         ListNode dummy = new ListNode(0);
         dummy.next = l1;
         ListNode pre = dummy;
         while(l1 != null && l2 !=null){
         if(l1.val < l2.val)
           l1 = l1.next;
         else{
             ListNode next = l2.next;
             l2.next = pre.next;
             pre.next = l2;
             l2 = next;
         }
          pre = pre.next;
         }
         if(l2!=null){
             pre.next = l2;
         }
         return dummy.next;
     }
}

