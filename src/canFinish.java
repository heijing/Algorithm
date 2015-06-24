public boolean canFinish(int numCourses, int[][] prerequisites) {
        iif(numCourses == 0 || prerequisites.length == 0)
            return true;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        int indegree[] = new int[numCourses];
        int count = numCourses;
        for(int i = 0;i< numCourses;i++){
            map.put(i,new ArrayList<Integer>());
        }
        for(int i = 0;i<prerequisites.length;i++){
            map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            indegree[prerequisites[i][1]]++;
        }
        for(int i = 0;i<numCourses;i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int x = queue.poll();
            for(int i :map.get(x)){
                if(--indegree[i]==0){
                    queue.offer(i);
                }
            }
            count--;
        }
        return count == 0;
    }
}