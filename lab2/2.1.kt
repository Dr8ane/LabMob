fun main(){
    print("Введите значение a: ")
    var a = readLine()!!.toDouble()
    print("Введите значение b: ")
    var b = readLine()!!.toDouble()
    var z1: Double = a * (2 * a - b)
    var z2: Double = 3 * b * 2 * b
    print("z=min($z1, $z2)")
}