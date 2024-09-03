package ucp.pilares;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PillarsMain {

    public static void main(String[] args) {


        //------------------ INMUTABILIDAD ----------------------
        final List<String> nombres = List.of("Juan", "Ana", "Luis");
        //nombres.add("Maria"); // Esto funciona o no?


        //------------------- FUN PURAS --------------------------

        /** Predicate: Evalúa una condición booleana para un argumento. Ejemplo:
         *
          */
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4)); // true o false?

        /** Function: Toma un argumento y devuelve un resultado. Ejemplo:
         *
         */
        Function<Integer, String> intToString = i -> "Número: " + i;

        System.out.println(intToString.apply(5)); // que devuelve?

        /**  Supplier: No toma ningún argumento pero devuelve un resultado. Ejwmplo:
         *
          */
        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get()); // Un número aleatorio

        /** Consumer: Toma un argumento y realiza una operación, pero no devuelve un resultado.
         * Aunque puede tener efectos secundarios (como imprimir en pantalla), puede considerarse
         * pura en el contexto de funciones matemáticas. Ejemplo:
         */
        Consumer<String> print = System.out::println;
        print.accept("Hola Mundo"); // impre o no?

        /** BiFunction: Similar a Function, pero toma dos argumentos y devuelve un resultado. Ejemplo:
         *
         */
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

        System.out.println(sum.apply(2, 3)); // suma ?



        // --------------------  LAMBDAS ---------------

        /**
         * Este ejemplo muestra cómo las lambdas pueden hacer el código más conciso y legible,
         * lo que es un aspecto clave en la programación funcional.
         */
        OperationInterface suma = Integer::sum;
        int result = suma.apply(5, 3);
        System.out.println(result);


        // ----------------- STREAM ---------------------------
/**
 * Aquí, stream() crea un flujo de datos que se filtra y luego se imprime.
 */

        List<String> palabras = Arrays.asList("rojo", "verde", "azul", "Naranja");
        palabras.stream()
                .filter(p -> p.length() > 4)
                .forEach(System.out::println); // que colores imprime?


        // ---------------------- FUN ORDEN SUPERIOR ---------------------
/**
 * Este código es un ejemplo de cómo usar funciones de orden superior en Java, donde pasas un comportamiento
 * (en este caso, una operación lambda)
 * como argumento a un método. El Consumer es una interfaz funcional que acepta un argumento y realiza una operación sobre él.
 * Esto permite un código más flexible y reutilizable, que es un principio clave en la programación funcional.
 */
        ejectFunction(s -> System.out.println(s.toUpperCase()), "imprimite orden superior");


    }

    public static void ejectFunction(Consumer<String> function, String value) {
        function.accept(value);
    }
}
