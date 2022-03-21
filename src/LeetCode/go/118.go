// 118 - Pascal's Triangle

package main

import "fmt"

func generate(numRows int) [][]int {
	var pascalTri [][]int

	pascalTri = append(pascalTri, []int{1})
	if numRows == 1 {
		return pascalTri
	}
	pascalTri = append(pascalTri, []int{1, 1})
	if numRows == 2 {
		return pascalTri
	}
	for i := 2; i < numRows; i++ {
		var arr []int
		arr = append(arr, 1)
		for j := 0; j < i-1; j++ {
			arr = append(arr, pascalTri[i-1][j]+pascalTri[i-1][j+1])
		}
		arr = append(arr, 1)
		pascalTri = append(pascalTri, arr)
	}
	return pascalTri
}

func main() {
	fmt.Println(generate(5))
}
