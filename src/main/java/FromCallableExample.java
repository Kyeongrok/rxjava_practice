import io.reactivex.Flowable;

import java.util.concurrent.Callable;

public class FromCallableExample {

    private void callable() {
        Callable<String> callable = () -> {
            Thread.sleep(1000);
            return "hello callable";
        };

        Flowable<String> source = Flowable.fromCallable(callable);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        FromCallableExample fromCallableExample = new FromCallableExample();
        fromCallableExample.callable();

    }
}
