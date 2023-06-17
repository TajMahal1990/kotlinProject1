fun main() {
    println("Анализ приложения")
    val likes = 1
    var okonchan = if ((likes % 10 == 1) && (likes % 100 !==11)) {
         ("человеку")
    } else ("людям")
    println("Понравилось $likes $okonchan") // Упрощение программы
