'''Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1

 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
'''

class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int x:nums){
            xor^=x; // xor=xor^x
        }
        return xor;
    }
}


'''Accepted
Runtime: 0 ms
Case 1
Input
nums =
[2,2,1]
Output
1
Expected
1
'''

'''Accepted
Runtime: 0 ms
Case 2
Input
nums =
[4,1,2,1,2]
Output
4
Expected
4'''

'''Accepted
Runtime: 0 ms
Case 3
Input
nums =
[1]
Output
1
Expected
1
'''