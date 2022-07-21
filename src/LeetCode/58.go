// 58 - Length of Last Word

package main

import "fmt"

func lengthOfLastWord(s string) int {
	l := 0
	for i := 0; i < len(s); i++ {
		tmpLen := 0
		for j := i; j < len(s); j++ {
			if s[j] != ' ' {
				tmpLen++
				l = tmpLen
				i = j
			} else {
				break
			}
		}

	}
	return l
}

func main() {
	fmt.Println(lengthOfLastWord("Hello World"))
	fmt.Println(lengthOfLastWord("   fly me   to   the moon  "))
	fmt.Println(lengthOfLastWord("luffy is still joyboy"))
	fmt.Println(lengthOfLastWord("Today is a nice day"))
}
