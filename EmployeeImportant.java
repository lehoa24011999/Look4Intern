class Solution {
    public int getImportance(List<Employee> list, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : list) {
            map.put(e.id, e);
        }
        return dfs(map.get(id), map);
    }
    
    private int dfs(Employee node, Map<Integer, Employee> map) {
        int ans = node.importance;
        for (int next : node.subordinates) {
            ans += dfs(map.get(next), map);
        }
        return ans;
    }
}