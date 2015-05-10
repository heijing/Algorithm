/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
           return null;
         LinkedList<UndirectedGraphNode> stack = new LinkedList<UndirectedGraphNode>();
         HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
         stack.push(node);
         UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
         map.put(node,copy);
         while(!stack.isEmpty()){
             UndirectedGraphNode cur = stack.pop();
             for(int i = 0; i<cur.neighbors.size();i++){
                 if(!map.containsKey(cur.neighbors.get(i))){
                   copy = new UndirectedGraphNode(cur.neighbors.get(i).label);
                     stack.push(cur.neighbors.get(i));
                     map.put(cur.neighbors.get(i),copy);
                 }
             
                map.get(cur).neighbors.add(map.get(cur.neighbors.get(i)));
             }
         }
           return map.get(node);
        
    }
}