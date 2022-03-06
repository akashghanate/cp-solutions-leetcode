class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Graph problem using DFS
        // T.C: O(n+p)
        
        // adjucency List
        ArrayList[] graph = new ArrayList[numCourses];
        
        for(int i=0;i<numCourses;i++){
            graph[i]= new ArrayList();
        }
        
        
        // set to detect cycle
        HashSet<Integer> visit = new HashSet<Integer>();
        
        // mapping 
        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        
        // applying dfs
        for(int i=0; i<numCourses; i++){
                if(!dfs(graph,visit,i))
                    return false;
            }
      return true;
        
    }
    
    
    public boolean dfs(ArrayList[] graph, HashSet<Integer> visit, int curCourse){
        if(visit.contains(curCourse)){
            // detected loop/ cycle
            return false;
        }
        else{
            visit.add(curCourse); 
        }
        // if(graph[curCourse] == new ArrayList()){
        //     return true;
        // }
        
        for(int i=0;i<graph[curCourse].size();i++){
            if(!dfs(graph,visit,(int)graph[curCourse].get(i))){
                return false;
            }
        }
        
        visit.remove(curCourse);
        graph[curCourse] = new ArrayList();
        return true;
        
    }
}