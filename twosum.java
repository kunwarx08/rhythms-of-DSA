import java.util.Arrays;
public class twosum {

    public static void main(String[] args) {
        int target=4;
        int nums[]={1,2,3,4};
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[j]+nums[i]){
                    result = new int[]{nums[i], nums[j]};
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

