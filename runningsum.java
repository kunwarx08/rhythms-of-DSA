import java.util.Arrays;

class runningsum {
    public static void main(String[] args) {
        int nums[]={10,6,3,4};
        int[] result=new int[nums.length];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}