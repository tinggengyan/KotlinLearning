package cn.steve.oop

sealed class Expr

data class Const(val number: Double) : Expr()

data class Sum(val e1: Expr, val e2: Expr) : Expr()

object NotANumber : Expr()


fun eval(expr: Expr): Double = when (expr) {

    is Const -> {
        println("const")
        expr.number
    }

    is Sum -> {
        println("Sum")
        eval(expr.e1) + eval(expr.e2)

    }

    NotANumber -> {
        println("NotANumber")
        Double.NaN
    }

//不再需要 `else` 子句，因为我们已经覆盖了所有的情况

}


fun main(args: Array<String>) {
    eval(Const(1.0))
    eval(Sum(Const(1.0), Const(9.0)))
    eval(NotANumber)

}