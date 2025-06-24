package org.example

class Fraccion(numerador: Int, denominador: Int) {
    var numerador: Int = 0
        get() = field
        set(value) { 
            field = value 
        }
    
    var denominador: Int = 1
        get() = field
        set(value) {
            if (value == 0) throw IllegalArgumentException("El denominador no puede ser cero")
            field = value
        }
}