/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class intersectionList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
          return null;
          ListNode pa = headA;
          ListNode pb = headB;
          int acount = 1;
          int bcount = 1;
        while(pa.next!=null){
            pa = pa.next;
            acount++;
        }
        while(pb.next !=null){
            pb = pb.next;
            bcount++;
        }
        if(pa != pb) return null;//no intersection
        pa = headA;
        pb  = headB;
        if(acount>bcount){
            int dif = acount - bcount;
            while(dif != 0){
                pa = pa.next;
                dif--;
            }
        }
       if(acount<=bcount){
            int dif = bcount - acount;
            while(dif != 0){
                pb = pb.next;
                dif--;
            }
        }
        while(pa!=pb){
            pa = pa.next;
            pb = pb.next;
        }
        return pa;
        
    }
}