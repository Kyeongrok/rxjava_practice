package generic;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class FlatMapExample {
    public static void main(String[] args) {
        Function<String, Observable<String>> getDoubleDiamonds =
                ball -> Observable.just(ball + "†", ball + "†");

        String[] balls = {"1", "2", "3"};

        Observable<String> source = Observable.fromArray(balls)
                .flatMap(getDoubleDiamonds);
        source.subscribe(System.out::println);

        Observable.fromArray(balls)
                .flatMap(ball -> Observable.just(ball + "†", ball + "†"))
        .subscribe(System.out::println);



    }
}
