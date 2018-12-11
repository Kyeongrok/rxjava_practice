package examples;

import io.reactivex.Flowable;
import java.util.Arrays;

public class DoOnError {

    public void run5() {
        Flowable.fromIterable(Arrays.asList(1, 2, 0))
                .doOnComplete(() -> System.out.println("completed 5"))
                .map(item -> {
                    return 10 / item;
                })
                .doOnNext(System.out::println)
                .subscribe();
    }

    public static void main(String[] args) {
        new DoOnError().run5();
    }

}
