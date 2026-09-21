package TP6

sealed class Operation {

    class Addition(var a: Double, var b: Double) : Operation()
    class Subtraction(var a: Double, var b: Double) : Operation()
    class Multiplication(var a: Double, var b: Double) : Operation()
    class Division(var a: Double, var b: Double) : Operation()
}

fun calculer(operation: Operation): Double {

    return when (operation) {

        is Operation.Addition ->
            operation.a + operation.b

        is Operation.Subtraction ->
            operation.a - operation.b

        is Operation.Multiplication ->
            operation.a * operation.b

        is Operation.Division -> {
            if (operation.b == 0.0) {
                throw ArithmeticException("Erreur : division par zéro")
            }

            operation.a / operation.b
        }
    }
}

fun main() {
    val addition = Operation.Addition(a = 10.0, b = 5.0)
    val subtraction = Operation.Subtraction(a = 10.0, b = 5.0)
    val multiplication = Operation.Multiplication(a = 10.0, b = 5.0)
    val division = Operation.Division(a = 10.0, b = 5.0)
    println("Addition : ${calculer(addition)}")
    println("Soustraction : ${calculer(subtraction)}")
    println("Multiplication : ${calculer(multiplication)}")
    println("Division : ${calculer(division)}")
}