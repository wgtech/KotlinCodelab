package project.wgtech.codelab.kotlin.chapter1

/**
 *  값, 변수 선언
 */
fun value() {
    // String 타입의 값 a 선언
    val a: String = "String a"

    // 타입을 생략하더라도 자동으로 타입을 추론한다.
    val b = "\"String b\""

    // 선언할 때 자료할당하지 않는다면 반드시 타입을 지정해줘야한다. (권장하지 않음)
    val c: String
    // 이어서 자료 할당
    c = "String c"

    // 따라서 아래와 같이 한꺼번에 선언과 할당을 하도록 권장한다.
    var d: Int = 0

    // 변수 d가 가변 변수(var)이기 때문에 값을 변경할 수 있다.
    print("d: " + d + " => ")
    d += 1
    print(d)
}


/**
 *  함수 선언
 */
fun hello(name: String): Unit {
    println("Hello, $name!")
}

fun calc(x: Int, y: Int): Int {
    return x + y
}


/**
 *  클래스 및 인터페이스 선언
 *  (아래 예시는 생성자가 없음)
 */
class Foo {
    val foo: String = "foo"

    fun foo() {
    }
}

interface Bar {
    fun bar()
}


/**
 *  조건문
 */
fun max(x: Int, y: Int): Int {
    if (x > y) {
        return x
    } else {
        return y
    }
}

fun manyItems(count: Int) {
    when (count) { // switch (count) { }
        1 -> println("There is $count item")
        else -> println("There are $count items")
    }
}


/**
 *  반복문
 */
fun repeat() {
    val items = listOf<String>("wgtech", "dev", "kotlin")
    for (item in items) {   // for-each only on Kotlin
        println("item: $item")
    }

    var i: Int = 0;
    while (true) { // while statement is equivalent as Java's
        println("item: " + items.get(i))
        i += 1
        if (i <= items.size) break
    }
}



/**
 *  main()
 */
fun main() {
    value()
    hello("wgtech.dev")
    println(calc(1, 2))
    max(3, 4)
    manyItems(3)
    repeat()
}