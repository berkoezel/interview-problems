// 69 - Sqrt(x)

package main

import "fmt"

func mySqrt(x int) int {
	if x < 4 {
		return x
	}

	nearestPerfSq, perfSqRoot := 0, 0

	for i := 0; i <= x/2 && i*i <= x; i++ {
		nearestPerfSq = i * i
		perfSqRoot = i
	}

	if nearestPerfSq == x {
		return perfSqRoot
	}
	var d, p, a float64
	d = float64(x - nearestPerfSq)

	p = float64(d / (2.0 * float64(perfSqRoot)))

	a = float64(float64(perfSqRoot) + p)
	return int(a - ((p * p) / (2.0 * a)))
}

func main() {
	fmt.Println(mySqrt(32))
	fmt.Println(mySqrt(4))
	fmt.Println(mySqrt(9))
	fmt.Println(mySqrt(10))
	fmt.Println(mySqrt(17))
	fmt.Println(mySqrt(2147395599))
}
