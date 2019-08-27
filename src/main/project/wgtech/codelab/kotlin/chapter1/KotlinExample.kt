package project.wgtech.codelab.kotlin.chapter1

data class User(val no: Int, val name: String, val email: String)

fun main(args: Array<String>) {
    val list = ArrayList<User>()
    val user1 =
        User(1, "wgtech", "wgtech.dev@gmail.com")
    list.add(user1);

    val user2 =
        User(2, "Prodo", "prodo@kkaoplus.com")
    list.add(user2);

    println("List size ${list.size}")

    if (user1.equals(user2)) {
        println("User1 is same as User2")
    } else {
        println("User1 is not User2")
    }
}