class RomoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int j=0,i=0;
        for(;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }

        }
        return j;
    }
}