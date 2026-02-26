# FizzBuzz-TDD

Este proyecto es una implementación del clásico ejercicio **FizzBuzz** usando la metodología de desarrollo **Test-Driven Development (TDD)**. Las pruebas unitarias fueron escritas antes de la lógica de negocio y se usó JUnit 5 con parámetros para validar los distintos casos.

## Qué se trabajó

1. Se configuró el proyecto usando Maven y se habilitó un contenedor de desarrollo.
2. Se añadieron pruebas unitarias en `src/test/java/FizzBuzzTest.java` que cubren los requerimientos de FizzBuzz:
   * Imprimir "Fizz" para múltiplos de 3.
   * Imprimir "Buzz" para múltiplos de 5.
   * Imprimir "FizzBuzz" para múltiplos de 3 y 5.
   * Devolver el número como cadena en otros casos.
3. Se implementó la clase `FizzBuzz` y se refactorizó varias veces para hacerla más clara y mantener las pruebas verdes.
4. Se incorporaron pruebas parametrizadas mediante la dependencia `junit-jupiter-params` para reducir duplicación.
5. Se refactorizó la lógica de retorno en `FizzBuzz` usando concatenación de cadenas para simplificar el código.

## Cómo ejecutar

```bash
mvn test
```

## Autor

Cristian Camilo Gómez Fernández
