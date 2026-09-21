package TP6

data class Produit(val nom: String,val prix:Double, val quantite:Int, val description:String)

fun main(){
    val p1 = Produit("Laptop",7500.0,10,"Ordinateur portable")
    println(p1)
    val p2 = p1.copy(prix = 7000.0)
    println(p2)
    println(p1 == p2)
}