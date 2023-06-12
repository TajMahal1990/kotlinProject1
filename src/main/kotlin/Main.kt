fun main() {
    println("Анализ приложения")
    var likes = 71 // количество лайков
    if(likes == 11 || likes == 12 || likes == 13 || likes == 14) {
        println("Понравилось $likes людям");
    } else if (likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}