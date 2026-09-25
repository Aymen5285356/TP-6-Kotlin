package TP6

class Banque {
    class CompteBancaire(val numeroCompte: String, var solde: Double) {
        fun deposer(montant: Double) {
            solde += montant
        }

        fun retirer(montant: Double) {
            if (montant <= solde) {
                solde -= montant
            } else {
                println("Solde insuffisant")
            }
        }
    }

    fun creerCompte(numero: String, soldeInitial: Double): CompteBancaire {
        return CompteBancaire(numero, soldeInitial)
    }
}

fun main() {
    val banque = Banque()
    val compte = banque.creerCompte("MA001", 1000.0)

    compte.deposer(500.0)
    compte.retirer(300.0)
    println("Solde : ${compte.solde}")
}