public class mergeKSortedListII{
		public ListNode mergeKLists(ArrayList<ListNode> lists){
		PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(10,new Comparator<ListNode>(){
			public int compare(ListNode n1,ListNode n2){
				return n1.val -n2.val;
			}
		});
		for(int i = 0;i<lists.size()-1;i++){
			ListNode node = lists.get(i);
			if(node!=null){
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
				pre.next = head;
			}
			 pre = cur;
			 if(cur.next !=null){
			 	heap.offer(cur.next);
			 }
		}
		 return head;
	}
}
