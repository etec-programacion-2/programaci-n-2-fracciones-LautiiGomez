package org.example

class Fraccion(
    numerador: Int,
    denominador: Int
) {
    var numerador: Int = 0
        set(value) { field = value }
        get() = field

    var denominador: Int = 1
        set(value) {
            if (value == 0) throw IllegalArgumentException("El denominador no puede ser cero")
            field = value
        }
        get() = field

    init {
        this.numerador = numerador
        this.denominador = denominador 
    }

    override fun toString(): String {
        return "$numerador/$denominador"
    }

    fun mostrar() {
        println(this.toString())
    }
}