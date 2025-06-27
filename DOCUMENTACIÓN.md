### Documentación

![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)
![Mi Icono](./image.png)

### Etapa 1: Definición de la clase

### Class Fraccion: definición la clase
### Constructor
Recepción de los parámetros numerador y denominador de tipo Int.
### Var numerador
Int = 0: definición de la variable numerador con un getter y setter automático.
### Var denominador
Int = 1: definición de la variable denominador. Su setter incluye una validación: si el valor es 0, lanza una excepción, porque una fracción no puede tener denominador 0.
### El bloque init 
Se ejecuta al crear una instancia de la clase. En este bloque, se asignan los valores recibidos por el constructor a las propiedades de la clase usando los setters, asegurando así que la validación del denominador se aplique desde el principio.
### Método toString
Sobrescribe el método toString() para que al imprimir la fracción, se vea en formato "numerador/denominador".
### Función mostrar
Esta función impirme en consola el resultado usando el método toString.
