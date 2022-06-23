fun main() {
    val dict = mapOf("Абоба" to "Володя обыкновенный","ДЕД" to "Евгений душниловый",
        "Легенда" to "Григорий нож в икре");
    print("Введите слово: ")
    var word = readLine().toString();
    if (word in dict)
        print(dict[word])
    else println("Значения этого слова нет в словаре.")
}