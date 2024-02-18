fun main() {

    var orderNumber: Float = 0f
    var countNumber: Float = 0f
    var tipsNumber: Float = 0f
    //Ввод с клавиатуры,  Преоброзование данных

    print("Введите сумму чека: ")
    val orderStr = readLine()
    try {
        val order = orderStr?.toFloat()

        if (order == null) {
            println("Вы не ввели никаких данных!!! Подсчет не получится!")
        } else {
            orderNumber += order
        }
    } catch (error: NumberFormatException) {
        println("Вы ввели Не цифры!!! Подсчет не получится!")
    }
    print("Введите количество человек: ")
    val countStr: String? = readLine()
    try {
        val count = countStr?.toFloat()

        if (count == null) {
            println("Вы не ввели никаких данных!!! Подсчет не получится!")
        } else {
            countNumber += count
        }
    } catch (error: NumberFormatException) {
        println("Вы ввели Не цифры!!! Подсчет не получится!")
    }
    print("Введите процент чая: ")
    val tipsStr: String? = readLine()
    try {
        val tips = tipsStr?.toFloat()

        if (tips == null) {
            println("Вы не ввели никаких данных!!! Подсчет не получится!")
        } else {
            tipsNumber += (tips / 100)
        }
    } catch (error: NumberFormatException) {
        println("Введите сумму цифрами")
    }

// Вычесле000ния
    println((orderNumber + orderNumber * tipsNumber) / countNumber)
}