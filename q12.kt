fun main() {
    var a = 10
    var b = 20

    val temp = a
    a = b
    b = temp

    println("a = $a")
    println("b = $b")

    a = a + b
    b = a - b
    a = a - b

    println("After swapping without third variable:")
    println("a = $a")
    println("b = $b")
}
