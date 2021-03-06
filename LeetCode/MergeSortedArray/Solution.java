/*
 * Merge Sorted Array - May 20 '12 - 6055 / 13640
Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space to hold additional elements from B. 
The number of elements initialized in A and B are m and n respectively.
 */

package MergeSortedArray;

public class Solution {
	public void merge(int A[], int m, int B[], int n) {
		int cur = m + n - 1;
		while(cur >= 0) {
			if(m == 0) A[cur] = B[--n];
			else if(n != 0) {
				A[cur] = (A[m-1] > B[n-1]) ? A[--m] : B[--n];
			}
			cur--;
		}
	}
}
