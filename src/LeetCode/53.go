// 53 - Maximum Subarray
package main

import "fmt"

func maxSubArray(nums []int) int {
	if len(nums) == 1 {
		return nums[0]
	}
	largest, sum, gap, fullSum := nums[0], 0, 0, 0

	for i := 0; i < len(nums); i++ {
		fullSum += nums[i]
		if nums[i] > largest {
			largest = nums[i]
		}
		tmpSum := 0
		if i+gap < len(nums)-1 {
			for j := i; j <= i+gap; j++ {
				tmpSum += nums[j]
			}
			if tmpSum > sum {
				sum = tmpSum
			}
		}
		gap++

	}
	if fullSum > sum {
		if largest > fullSum {

			return largest
		}
		return fullSum
	}

	return sum
}

func main() {
	nums0 := []int{-1}
	fmt.Println(maxSubArray(nums0))
}
