class Solution {
    int maxTime=0;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> adj=new HashMap<>();
        for(int i=0;i<manager.length;i++){
            int employee_i = i;
            int manager_i = manager[i];
            if (manager_i != -1) {
                if (!adj.containsKey(manager_i)) {
                    adj.put(manager_i, new ArrayList<>());
                }
                adj.get(manager_i).add(employee_i);
            }
        }
        dfs(adj,informTime,headID,0);
        return maxTime;
    }
    public void dfs(Map<Integer, List<Integer>> adj, int[] informTime, int curr_employee, int curr_time){
        maxTime=Math.max(maxTime,curr_time);
        List<Integer> subordinates = adj.get(curr_employee);
        if (subordinates != null) {
            for (int employee : subordinates) {
                dfs(adj, informTime, employee, curr_time + informTime[curr_employee]);
            }
        }
    }
}