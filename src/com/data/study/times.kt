package com.data.study
var k = 0


// 1.这个函数是自身调用自身
// 2.那么我们说，最开始传入的数字是n对吧，然后调用自己，每次递归调用 n 都-1
// 那么会执行n-1次，所以和n*一点关系也没有，时间复杂度是on
fun fact(n:Int):Int {
    return if (n==1){
        1
    }else{
        k++
        n* fact(n - 1)
    }
}

fun main() {
    val t = Transfer.CreateInstance()
    t.tran("(a+c)*v-r")
    fact(20)
    //print(k)
}