fun main() {
    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull() ?: return
    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull() ?: return

    var y = 0
    var result = 1

    while (result < n) {
        result *= x
        y++
    }

    if (result == n) {
        println("Целочисленный показатель степени y: $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}
