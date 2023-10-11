class MajorityElement {
    public int majorityElement(int[] nums) {
        int player = 0;
        int points = 0;
        for(int i = 0; i<nums.length; i++){
            if(points == 0){
                player = nums[i];
            }
            if(player == nums[i]){
                points++;
            } else{
                points--;
            }
        }
        return player;
    }
}

