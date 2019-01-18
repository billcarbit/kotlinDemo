package com



val a: Int = 1
val b = 1       // 系统自动推断变量类型为Int


fun main(args: Array<String>) {
    val c: Int      // 如果不在声明时初始化则必须提供变量类型
    c = 1           // 明确赋值

    var x = 5        // 系统自动推断变量类型为Int
    x += 1           // 变量可修改


    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
// 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2);


    println(sum(1, 2));
    println(vars("4","6"));
    //lambda表达式使用实例
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2))  // 输出 3
}


/**
 * 求和
 */
fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
    return a + b
}

/**
 * 可变长数组
 */
fun vars(vararg v: String) {
    for (vt in v) {
        print(vt);
        print(",");
    }
}