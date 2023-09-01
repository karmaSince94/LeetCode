class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> obj = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            if(!obj.contains(nums[i])){
                obj.add(nums[i]);
            } else {
                return true;
            }
        } 
        return false;
    }
}