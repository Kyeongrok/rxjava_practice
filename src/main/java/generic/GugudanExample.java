package generic;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public class GugudanExample {
    public static void main(String[] args) {


        Function<Integer, Observable<String>> fn = intNum -> {
            return Observable.range(1, 9)
                    .map(item -> "=" + item * intNum);
        };

        Observable.range(1, 9).flatMap(fn)
                .subscribe(System.out::println);



    }
}
