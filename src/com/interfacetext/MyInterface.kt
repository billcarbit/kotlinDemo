package com.interfacetext

interface MyInterface {
    fun bar()    // 未实现
    fun foo() {  //已实现
        // 可选的方法体
        println("foo")
    }
}

fun main(args: Array<String>) {
    val c = Child()
    c.foo();
    c.bar();

}