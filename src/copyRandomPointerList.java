/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class copyRandomPointerList {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
          return null;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        RandomListNode newHead = new RandomListNode(head.label);
        map.put(head,newHead);//old is key ,new is value;
        RandomListNode cur = head.next;
        RandomListNode pre = newHead;
        while(cur != null){
            RandomListNode newNode = new RandomListNode(cur.label);//copy
            map.put(cur,newNode);//put into map
            pre.next = newNode;//need pre to connect
            pre = newNode;
            cur = cur.next;
        }
        cur = head;
        RandomListNode copy = newHead;
        while(cur !=null){
            copy.random = map.get(cur.random);
            copy = copy.next;
            cur = cur.next;
        }
        return newHead;
    }
}