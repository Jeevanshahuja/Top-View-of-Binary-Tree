

class Solution {
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        Queue <Node> q = new LinkedList<>();
        Queue <Integer> hd = new LinkedList<>();
        q.add(root);
        hd.add(0);
        while(!q.isEmpty()){
            Node node = q.poll();
            int currhd=hd.poll();
            if(!map.containsKey(currhd)){
                map.put(currhd,node.data);
            }
            if(node.left!=null){
                q.add(node.left);
                hd.add(currhd-1);
            }
            if(node.right!=null){
                q.add(node.right);
                hd.add(currhd+1);
            }
        }
        for(int value : map.values()){
            ans.add(value);
        }
        return ans;
    }
}