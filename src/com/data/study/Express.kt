package com.data.study

import java.util.*

class Transfer{
    fun tran(s:String):String {
        val l =  Stack<Char>()
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
                ')'->{
                    while (l.peek()!='('){
                        print(l.pop())
                    }
                    l.pop()
                }
                '+','-'->{
                    if (l.isNotEmpty()){
                        do {
                            val r= l.peek()
                            if (r!='('){
                                print(l.pop())
                            } else{
                                break
                            }
                        }while (l.isNotEmpty())
                    }
                    l.push(i)
                }
            }
        }
        while (l.isNotEmpty()){
            print(l.pop())
        }

        return s
    }
}