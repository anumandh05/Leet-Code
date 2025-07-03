import java.util.Arrays;

public class Question0001 {

	public static void main(String[] args) {
		
		int [] nums = {2,7,11,15};
		int target = 9;
		
	    int[] out = new int[2];
        int a = nums.length;
        int i;
		int j;
		int sum=0;
		for(i=0;i<a-1;i++) {
			sum=nums[i];
			for (j=i+1;j<a;j++) {
				sum=sum+nums[j];
				if(sum==target) {
					out[0] = i;
					out[1] = j;
				}
				else {
					sum=nums[i];
				}
			}
		}
		System.out.println(Arrays.toString(out));
		
	}

}
