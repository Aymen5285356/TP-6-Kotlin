package TP6

sealed class Operation(val a: Double, val b: Double)
class Addition(a: Double, b: Double) : Operation(a, b)
class Soustraction(a: Double, b: Double) : Operation(a, b)
class Multiplication(a: Double, b: Double) : Operation(a, b)
class Division(a: Double, b: Double) : Operation(a, b)

fun calculer(operation: Operation): Double {
    return when (operation) {
        is Addition -> operation.a + operation.b
        is Soustraction -> operation.a - operation.b
        is Multiplication -> operation.a * operation.b
        is Division -> {
            if (operation.b == 0.0) {
                throw IllegalArgumentException("Division par zéro impossible")
            }
            operation.a / operation.b
        }
    }
}

fun main() {
    println("Addition : ${calculer(Addition(10.0, 5.0))}")
    println("Soustraction : ${calculer(Soustraction(10.0, 5.0))}")
    println("Multiplication : ${calculer(Multiplication(10.0, 5.0))}")
    println("Division : ${calculer(Division(10.0, 5.0))}")
}