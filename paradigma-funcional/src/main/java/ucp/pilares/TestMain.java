package ucp.pilares;

import java.util.List;
import java.util.function.Predicate;

public class TestMain {
    public static void main(String[] args) {
        OperationInterface suma = Integer::sum;
        int result = suma.apply(5, 3);
        System.out.println(result);
    }
}
