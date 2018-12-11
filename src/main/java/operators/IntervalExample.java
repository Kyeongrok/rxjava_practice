package operators;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class IntervalExample {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> source = Observable.interval(100l, TimeUnit.MILLISECONDS)
                .map(data -> (data + 1) * 100)
                .take(5);
        source.subscribe(System.out::print);
        Thread.sleep(1000);
    }
}
