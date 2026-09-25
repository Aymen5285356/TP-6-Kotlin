package TP6

interface Vehicule {
    val marque: String
    fun demarrer()
}

open class VehiculeBase(override val marque: String) : Vehicule {
    override fun demarrer() {
        println("$marque démarre")
    }
}

class Voiture(marque: String, val nombrePortes: Int) : VehiculeBase(marque) {
    fun klaxonner() {
        println("$marque : Beep beep !")
    }
}

class Camion(marque: String, val capaciteChargement: Double) : VehiculeBase(marque) {
    fun charger() {
        println("$marque charge jusqu'à $capaciteChargement kg")
    }
}

fun main() {
    val voiture = Voiture("Dacia", 5)
    voiture.demarrer()
    voiture.klaxonner()

    val camion = Camion("Volvo", 10000.0)
    camion.demarrer()
    camion.charger()
}