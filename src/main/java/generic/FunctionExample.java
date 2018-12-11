package generic;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> fn = str -> Integer.parseInt(str);

        String[] ar = {"1", "2", "3"};
        Flowable<Integer> source = Flowable.fromArray(ar)
                .map(fn);

        source.subscribe(System.out::println);
    }
}