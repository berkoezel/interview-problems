// 26 - Remove Duplicates from Sorted Array

package main

import "fmt"

func removeDuplicates(nums []int) int {
	if len(nums) == 1 {
		return 1
	}
	firstNumBlock := 0
	for i := 0; i < len(nums)-1; i++ {
		if nums[firstNumBlock] != nums[i+1] {
			nums[firstNumBlock+1] = nums[i+1]
			firstNumBlock++
		}
	}

	if firstNumBlock == 0 {
		return 1
	}
	fmt.Println(nums)
	return firstNumBlock + 1
}

func main() {
	nums0 := []int{1, 1, 2}
	nums1 := []int{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
	nums2 := []int{1, 1}
	removeDuplicates(nums0)
	removeDuplicates(nums1)
	removeDuplicates(nums2)
}
