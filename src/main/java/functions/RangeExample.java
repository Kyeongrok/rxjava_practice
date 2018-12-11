package functions;

import io.reactivex.Observable;

public class RangeExample {
    public static void main(String[] args) {
        Observable.range(1, 9)
                .flatMap(item -> Observable.just(item * 2, item * 3))
                .subscribe(System.out::println);
    }
}
