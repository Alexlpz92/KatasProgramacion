# KatasProgramacion



# FizzBuzz
***
Escribe una función que tome enteros positivos y muestre su representación en cadena.

Tu función debe cumplir las siguientes normas adicionales:

Si el número es múltiplo de tres, devolverá la palabra "Fizz".
Si el número es múltiplo de cinco, devolverá la palabra "Buzz".
Si el número es múltiplo de tres y de cinco, devolverá la palabra "FizzBuzz".
Por ejemplo, dados los números del 1 al 15 en orden, la función devolvería:

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```
## Implementaciones
* java
  * [Tests](./FizzBuzz/src/test/java/FizzBuzzTest.java)
  * [SUT](./FizzBuzz/src/main/java/FizzBuzz.java)

# Año Bisiesto
***
Leap Year o 'Año Bisiesto' es una kata clásica que suele intentarse como continuación de FizzBuzz, ya que se considera ligeramente más difícil debido a que sus reglas son un poco más complicadas. En la práctica, la mayoría de los desarrolladores pueden retener una solución completa de FizzBuzz en su memoria de trabajo, pero el algoritmo del Leap Year supone una mayor carga cognitiva, por lo que normalmente no es posible hacerlo en un único intento.

Aquí empieza a revelarse el poder del TDD en pequeños pasos. Un algoritmo que por sí mismo parece un reto puede dividirse en trozos sencillos. Además, como realizarás tests, dispondrás de documentación activa y de un conjunto completo de pruebas de regresión una vez que hayas terminado.

Elegir cuidadosamente el siguiente test es esencial: si en algún momento te encuentras dando un paso demasiado grande, pregúntate: ¿has elegido el caso de prueba correcto? Puede que tengas que retroceder más de un paso antes de encontrar una ruta más sencilla. Al igual que con otras katas, el éxito no sólo significa que el código "funciona": puedes repetirla una y otra vez para perfeccionar tu enfoque (ver la sección de 'Definir Terminado' más abajo).

Instrucciones
Implementa un método que compruebe si un año es bisiesto.

Deben cumplirse todas las siguientes normas:

Un año no es bisiesto si no es divisible por 4
Un año es bisiesto si es divisible por 4
Un año es bisiesto si es divisible por 400
Un año no es bisiesto si es divisible por 100 pero no por 400
Ejemplos:

1997 no es bisiesto (no es divisible por 4)
1996 es bisiesto (divisible por 4)
1600 es bisiesto (divisible por 400)
1800 no es bisiesto (divisible por 4, divisible por 100, NO divisible por 400)
El método debe devolver 'true' si un año es bisiesto, y 'false' si no lo es.

## Implementaciones
* java
  * [Tests](./LeapYear/src/main/java/YearCalculator.java)
  * [SUT](./LeapYear/src/test/java/YearCalculatorTest.java)