// 67 - Add Binary

package main

import (
	"fmt"
	"strconv"
)

func addBinary(a string, b string) string {
	num0, _ := strconv.ParseInt(a, 2, 64)
	num1, _ := strconv.ParseInt(b, 2, 64)
	num0 += num1
	return strconv.FormatInt(num0, 2)
}
func main() {
	fmt.Println(addBinary("10", "11"))
}
