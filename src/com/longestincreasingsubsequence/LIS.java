package com.longestincreasingsubsequence;

class LIS {
	static int[] lis(int arr[], int n) {
		int lis[] = new int[n];
		int parent[] = new int[n];
		int maxLen = 0;
		int lastIndex = 0;

		for (int i = 0; i < n; i++) {
			lis[i] = 1;
			parent[i] = -1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
					parent[i] = j;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (lis[i] > maxLen) {
				maxLen = lis[i];
				lastIndex = i;
			}
		}

		// Store the elements of the longest increasing subsequence
		int[] longestSubsequence = new int[maxLen];
		int current = lastIndex;
		for (int i = maxLen - 1; i >= 0; i--) {
			longestSubsequence[i] = arr[current];
			current = parent[current];
		}

		return longestSubsequence;
	}

	public static void main(String args[]) {
		int arr[] = {3, 10, 2, 1, 20};
		int n = arr.length;

		int[] longestSubsequence = lis(arr, n);
		int longestSubsequenceLength = longestSubsequence.length;

		System.out.println("Length of the longest increasing subsequence is: " + longestSubsequenceLength);
		System.out.println("Longest increasing subsequence is:");
		for (int num : longestSubsequence) {
			System.out.print(num + " ");
		}
	}
}
