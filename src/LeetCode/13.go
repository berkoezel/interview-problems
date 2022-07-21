// 13 - Roman to Integer

package main

import "fmt"

func romanToInt(s string) int {
	if len(s) == 1 {
		return convertRoman(s)
	}
	sum := 0
	for i := 0; i < len(s)-1; i++ {
		curNum := convertRoman(string(s[i]))
		nextNum := convertRoman(string(s[i+1]))
		if curNum < nextNum {
			sum -= curNum
		} else {
			sum += curNum
		}
	}
	sum += convertRoman(string(s[len(s)-1]))
	return sum
}

func convertRoman(s string) int {
	if s[0] == 'I' {
		return 1
	} else if s[0] == 'V' {
		return 5
	} else if s[0] == 'X' {
		return 10
	} else if s[0] == 'L' {
		return 50
	} else if s[0] == 'C' {
		return 100
	} else if s[0] == 'D' {
		return 500
	} else if s[0] == 'M' {
		return 1000
	} else {
		return 0
	}
}
func main() {
	fmt.Println(romanToInt("III"))
	fmt.Println(romanToInt("LVIII"))
	fmt.Println(romanToInt("MCMXCIV"))
}
