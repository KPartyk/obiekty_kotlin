import java.util.Scanner

class Zwierze {
    var gatunek: String = ""
    var imie: String = ""
    var wiek: Int = 0

    fun dodajZwierze() {
        println("DODAWANIE NOWEGO ZWIERZĘCIA DO BAZY: ")
        print("Podaj gatunek: ")
        gatunek = readLine().toString()
        print("Podaj imie: ")
        imie = readLine().toString()
        print("Podaj wiek: ")
        wiek = readLine()?.toIntOrNull() ?: 0

    }

    fun dajGlos() {
        when (gatunek) {
            "kot" -> println("$imie lat $wiek: Miau!")
            "koza" -> println("$imie lat $wiek: Beeee!")
            "krowa" -> println("$imie lat $wiek: Muuuu!")
            else -> println("nieznany gatunek! Moze jakies UFO?!")

        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    val z1 = Zwierze()
    z1.dodajZwierze()
    z1.dajGlos()

    val z2 = Zwierze()
    z2.dodajZwierze()
    z2.dajGlos()

}