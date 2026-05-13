class Solution {
    public int[] twoSum(int[] nums, int target) {

        // int left = 0;
        // int right = nums.length-1;

        // while(left <= right){
        //     int mid = nums[left] + nums[right];

        //     if(mid == target){
        //         return new int[]{left,right};
        //     }else if(mid < target){
        //         left ++;
        //     } else {
        //         right--;
        //     }
        // }
        // return new int[]{-1,-1};

Map<Integer,Integer> map = new HashMap<>();

for(int i = 0; i < nums.length; i++){
    int diff = target - nums[i];

    if(map.containsKey(diff)){
        return new int[]{map.get(diff),i};
    }
    map.put(nums[i],i);
}
return new int[]{-1,-1};
    }
}
