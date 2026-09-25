package TP6

enum class EtatCommande {
    EN_COURS,
    EXPEDIEE,
    LIVREE,
    ANNULEE;

    fun message(): String {
        return when (this) {
            EN_COURS -> "La commande est en cours de traitement."
            EXPEDIEE -> "La commande a été expédiée."
            LIVREE -> "La commande a été livrée."
            ANNULEE -> "La commande a été annulée."
        }
    }
}

class Commande(val numeroCommande: String, var etat: EtatCommande) {
    fun changerEtat(nouvelEtat: EtatCommande) {
        etat = nouvelEtat
    }
}

fun main() {
    val commande = Commande("CMD-001", EtatCommande.EN_COURS)
    println(commande.etat)

    commande.changerEtat(EtatCommande.EXPEDIEE)
    println(commande.etat.message())
}