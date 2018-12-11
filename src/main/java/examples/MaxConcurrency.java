package examples;

import io.reactivex.Flowable;
import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Collections;

public class MaxConcurrency {
    public void run() {

        Observable.merge(Observable.just(
                Observable.just(3),
                Observable.just(5),
                Observable.just(1),
                Observable.just(4),
                Observable.just(2)), 2)
                .subscribe(System.out::println);

    }

    public static void main(String[] args) {
        new MaxConcurrency().run();

    }
}
