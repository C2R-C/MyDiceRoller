# My Dice Roller

Esta es una app que hace parte del proceso de aprendizaje con los codelabs de Google.

Los commit se harán conforme se vayan realizando cada **coding challenge**, por lo cual, irá sufriendo una transformación permanente.

Los invito a conocer un poco mi proceso de formación y entrenamiento en este fascinante y emocionante mundo de la programación con Kotlin en Android Studio.

___
## Respuestas al Task de Anatomía del proyecto básico de Android

1. ¿Qué método **Activity** infla el diseño de la aplicación y hace que sus vistas estén disponibles como objetos?
    Respuesta: El método setContentView()
    
2. ¿Qué atributo de vista utilizas para establecer el ancho de una vista de modo que se ajuste al contenido?
    Respuesta: El atributo es: android:layout_width="wrap_content"
    
## La aplicación tiene lo siguiente:

- El diseño de la aplicación incluye una vista de texto y dos botones.
- El código de la aplicación establece dos controladores de clic, uno para cada botón.
- El controlador de clic que restablece la vista de texto reestablece la propiedad de texto en 0.
___

# Android Kotlin Fundamentls 1.3: Recursos de Imagen y Compatibilidad

## Third Coding Challenge: Resuelto

Se desarrolló creando la función `getDrawableDiceImage()` la cual devuelve el entero que se necesita para los parámetros de la función `setImageResource()`, quedando la función de la siguiente manera:
~~~ kotlin
private fun getDrawableDiceImage() : Int {
        val randomInt = (1..6).random()
        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }
~~~
y la función rollDice() me quedó de la siguiente manera:
~~~ Kotlin
private fun rollDice() {
        diceImage1.setImageResource(getDrawableDiceImage())
        diceImage2.setImageResource(getDrawableDiceImage())
    }
~~~

De esta manera desarrollé mi coding challenge.

