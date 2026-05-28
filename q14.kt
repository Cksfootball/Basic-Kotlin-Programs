fun main() {
    val n = 50

    for (i in 2..n) {
        var isPrime = true

        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            print("$i ")
        }
    }
}
