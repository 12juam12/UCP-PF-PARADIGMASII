package ucp.exemple;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<Persons> persons = Arrays.asList(
                new Persons("Ronaldo" , 39),
                new Persons("Messi" , 37),
                new Persons("Ortega" , 24),
                new Persons("Roman" , 21)
        );

        //Funcion Pura                         Lambda
        Predicate<Persons> isOlder25 = person -> person.getYears() > 25;

        //Funcion Orden Superior
        List<Persons> olders25 = filtersPersons(persons, isOlder25);

        olders25.forEach(person -> System.out.println(person.toString()));

    }

    private static List<Persons> filtersPersons(List<Persons> persons, Predicate<Persons> isOlder25) {
        return persons.stream().filter(isOlder25).collect(Collectors.toList());
    }

    /**
     *  En Java, cuando decimos que las operaciones en un Stream son "perezosas" (lazy),
     * significa que estas operaciones no se ejecutan inmediatamente cuando se definen. En su lugar,
     * se construye un pipeline de operaciones que se ejecuta solo cuando se realiza una operación terminal,
     * como collect(), forEach(), o reduce(). Este enfoque permite optimizar el rendimiento, evitando
     * cálculos innecesarios y permitiendo la ejecución eficiente en grandes volúmenes de datos.
     */
}
