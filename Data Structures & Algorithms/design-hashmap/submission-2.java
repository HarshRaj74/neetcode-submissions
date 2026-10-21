class MyHashMap {
    List<List<Integer>> hm;
    public MyHashMap() {
        List<List<Integer>> h=new ArrayList<>(); 
        this.hm=h;
    }
    
    public void put(int key, int value) {
        List<Integer> toadd=new ArrayList<>();
        for(List<Integer> node:hm){
            if(node.get(0).equals(key)){
                node.set(1,value);
                return;
            }
        }
        toadd.add(key);
        toadd.add(value);
        hm.add(toadd);
    }
    
    public int get(int key) {
        for(List<Integer> node:hm){
            if (node.get(0).equals(key)){
                return node.get(1) ; 
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        hm.removeIf(node -> node.get(0).equals(key));
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */