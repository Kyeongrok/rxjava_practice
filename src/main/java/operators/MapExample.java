package operators;

import io.reactivex.Observable;


public class MapExample {
    public static void main(String[] args) {
        String[] balls = {"1", "2", "3", "5"};
        Observable<String> source = Observable.fromArray(balls)
                .map(ball -> ball + "ß");

        source.subscribe(System.out::println);
    }
}
