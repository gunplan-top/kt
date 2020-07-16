package com.data.study

import java.util.*

class Transfer private constructor(b:Boolean){
    val exp = b
    companion object {
        fun CreateInstance(b:Boolean = false) = Transfer(b)
    }
    fun tran(s:String):String {
        val l = Stack<Char>()
        val ca = s.toCharArray()
        for (i in ca){
            if (i in 'a'..'z'){
                print(i)
                continue
            }
            when(i){
                '(','*','/' ->{
                    l.push(i)
                }
                ')','+','-'->{
                    while (l.isNotEmpty()&&l.peek()!='('){
                        print(l.pop())
                    }
                    if (i==')') l.pop() else l.push(i)
                }
           }
        }
        while (l.isNotEmpty()) {
            print(l.pop())
        }
        return s
    }
}