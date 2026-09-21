package TP6

interface Vehicule{

}

open class VehiculeBase():Vehicule{
}

class Voiture(var capaciteChargement:Int):VehiculeBase(){
    fun charger(){
        print("voiture capacite charge ${capaciteChargement}")
    }
}

class Camion(var nombrePortes:Int):VehiculeBase(){
    fun klaxonner(){
        print("Camion klaxonner ${nombrePortes}")
    }
}
fun main(){
    var vehicule = VehiculeBase()
    var voiture = Voiture(1)
    voiture.charger()
    var camion = Camion(1)
    camion.klaxonner()

}
