// 28 - Implement strStr()

package main

import "fmt"

func strStr(haystack string, needle string) int {

	if needle == "" {
		return 0
	}

	for i := 0; i <= len(haystack)-len(needle); i++ {
		if haystack[i] == needle[0] && haystack[i:i+len(needle)] == needle {
			return i
		}
	}
	return -1
}

func main() {
	i := strStr("hello", "ll")
	fmt.Println(i)
}
