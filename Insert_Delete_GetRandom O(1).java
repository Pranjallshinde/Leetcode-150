class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer,Integer> map;
    Random random; 

    public RandomizedSet() {
       list = new ArrayList<>();
       map = new HashMap<>();
       random = new Random(); 
    
    }
    
    public boolean insert(int val) { //O(1)
        if(map.containsKey(val)){
            return false;
        } 
        map.put(val ,list.size());
        list.add(val);
        return true;   
    }
    
    public boolean remove(int val) { //O(n) => O(1) , only if we remove from last
        
        if(!map.containsKey(val)){
            return false;
        }
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        list.set(index , lastElement);
        map.put(lastElement , index);

        list.remove(list.size() - 1);
        map.remove(val);

        return true;

    }
    
    public int getRandom() { //O(1)
      int randomIndex = random.nextInt(list.size());
      return list.get(randomIndex);  
    }
}

