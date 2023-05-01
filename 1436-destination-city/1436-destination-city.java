class Solution {
    public String destCity(List<List<String>> paths) {
            
        Map<String, Integer> cities = new HashMap<>();
        
        for (List<String> path : paths) {
            for (int i = 0; i < path.size(); i++) {
                if (cities.containsKey(path.get(i))) {
                    cities.remove(path.get(i));
                } else {
                    cities.put(path.get(i), i);
                }
            }
        }
        
        String answer = null;
        
        for (Map.Entry<String, Integer> entry : cities.entrySet()) {
            String key = entry.getKey();
            
            if (cities.get(key) == 1) {
                answer = key;
            }
        }
        
        return answer;
    }
}