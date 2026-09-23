class MyHashSet {
    ArrayList<Integer> hashSet=new ArrayList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(hashSet.contains(key)){
            return;
        }
        hashSet.add(key);
    }
    
    public void remove(int key) {
        if(hashSet.contains(key)){
        hashSet.remove(Integer.valueOf(key));
        hashSet.trimToSize();
        }
        
    }
    
    public boolean contains(int key) {
        return hashSet.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */