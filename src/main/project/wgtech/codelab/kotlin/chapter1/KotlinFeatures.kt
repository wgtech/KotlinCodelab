package project.wgtech.codelab.kotlin.chapter1

/**
 *  Kotlin Main Features
 *  @author wgtech.dev
 *
 */
fun main() {

    /**
     *  1. 간결한 문법
     */
    val name = "John Ber"       // 자동 String 타입 지정
    val person = Person(name)   // 객체 생성시 new 연산자 사용하지 않는다

    /**
     *  2. NullPointerException 방지
     */
    val okayNull: String? = null     // null 허용하는 문자열
    val nonoNull: String = "foo"     // null 허용하지 않는 문자열

    /**
     *  3. Mutable/Immutable (가변/불변)
     */
    val immutVal: String = "Immutable Variable" // public static final String immutVal = "Immutable Variable";
    //immutVal = "changed"                      // 불변 변수이기때문에 컴파일 에러 발생됨
    var mutVal: String = "Mutable Variable"     // String mutVal = "Mutable Variable"
    println(mutVal)                               // Mutable Variable
    mutVal = "changed"                          // 가변 변수이라 값이 변화된다
    println(mutVal)                               // Mutable Variable -> changed

    /**
     *  4. Lambda expression, SAM (Single Abstract Method) 변환 지원
     */
    // (Below codes are running on Android)
    //val view = ...
    //view.setOnClickListener {
    //    Toast.makeText(mContext, "Click", Toast.LENGTH_SHORT).show()
    //}

    /**
     *  5. Java8 stream API 지원
     */
    val items = listOf(1, 2, 3, 6, 9)
    val sumOfEvens = items.filter { it % 2 == 0 }.sum() // 리스트 항목 중 짝수의 합 구하기
    println(sumOfEvens)
}

class Person(name: String) {
    override fun toString(): String {
        return super.toString();
    }
}

