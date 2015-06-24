/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class copyRandomList {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
        return null;
        RandomListNode cur = head;
        while(cur != null){
            RandomListNode newNode = new RandomListNode(cur.label);
            RandomListNode next = cur.next;
            cur.next = newNode;
            newNode.next = next;
            cur = next;
        }
        cur = head;
        while(cur!=null){
            if(cur.random!=null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        RandomListNode node = head;
        RandomListNode newhead = head.next;
        while(node != null){
            RandomListNode newNode = node.next;
            node.next = newNode.next;
            if(newNode.next != null){
                newNode.next = newNode.next.next;
            }
            node = node.next;
        
    }
    return newhead;
 }
}