package examples;

import io.reactivex.Flowable;
import java.util.Arrays;

public class DoOnError {
    public void run6() {
        Flowable.fromIterable(Arrays.asList(1, 2, 0, 1))
                .doOnComplete(() -> System.out.println("completed 6"))
                .map(item -> {
                    return 10 / item;
                })
                .doOnNext(item -> System.out.println("---next6---"))
                .doOnError(throwable -> System.out.println("---error6---"))
                .subscribe(item2-> System.out.println("subscribe:"+item2));
        System.out.println("---------finish--------");
    }

    public static void main(String[] args) {
        DoOnError doOnError = new DoOnError();
        doOnError.run6();
    }

}
