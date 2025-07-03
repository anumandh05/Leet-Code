import java.util.Arrays;
// import java.util.*;

public class Question0004 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub

		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };
		int len1 = nums1.length;
		int len2 = nums2.length;
		int len = len1+len2;
		int[] arr = new int[len];
		int biglen = 0;
		int smalllen = 0;
		int[] bigarr = {};
		int[] smallarr = {};
		if (len1 > len2) {
			biglen = len1;
			smalllen = len2;
			smallarr = nums2;
			bigarr = nums1;
		} else {
			biglen = len2;
			smalllen = len1;
			smallarr = nums1;
			bigarr = nums2;
		}

		for (int i = 0 ; i<biglen;i++) {
			arr[i]=bigarr[i];
		}
		System.out.println(Arrays.toString(arr));
		int x=0;
		for (int i = (biglen); i<len; i++) {
			arr[i]=smallarr[x];
			x++;
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		double fin;
		double fin1=0;
		
		if (len%2!=0) {
			fin = arr[len/2];
			fin1 = fin;
		}
		else {
			fin= (arr[len/2] + arr[(len/2) - 1]);
			fin1 = fin/2;
		}
		
		System.out.println(fin1);
		

		
	}
}
