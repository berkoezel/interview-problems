// 14 - Longest Common Prefix

package main

import "fmt"

func longestCommonPrefix(strs []string) string {

	lgh := len(strs)
	result := ""

	if lgh == 0 {
		return result
	} else if lgh == 1 {
		return strs[0]
	}

	cond := true
	lettIdx := 0
	for cond {
		toAppended := true
		buffLtt := ""
		for i := 0; i < lgh-1; i++ {
			if lettIdx > len(strs[i])-1 || lettIdx > len(strs[i+1])-1 {
				return result
			}
			if string(strs[i][lettIdx]) == "" {
				if string(strs[i+1][lettIdx]) != "" {
					return result
				}
			} else if string(strs[i][lettIdx]) != string(strs[i+1][lettIdx]) {
				return result

			} else {
				buffLtt = string(strs[i][lettIdx])
			}
		}
		if toAppended {
			result = result + buffLtt
		}
		lettIdx++
	}

	return result
}

func main() {
	strs := []string{"flower", "flow", "flight"}
	fmt.Println(longestCommonPrefix(strs))
	strs = []string{"ab", "a"}
	fmt.Println(longestCommonPrefix(strs))
}
