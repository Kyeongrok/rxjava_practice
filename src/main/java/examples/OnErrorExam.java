package examples;

import io.reactivex.Flowable;

public class OnErrorExam {
    public void run() {
        Integer[] ar = {1, 2, 3};
        Flowable<Integer> source = Flowable.fromArray(ar);

        source.map(item -> item / 0)
                .subscribe(
                        item -> System.out.printf("%d", item),
                        Throwable::printStackTrace,
                        () -> System.out.println("completed"));
    }

    public void run2() {
        Flowable.just(1, 2, 3, 0, 4)
                .map(item -> 10 / item)
                .doOnNext(item -> System.out.println("doOnNext:"+item))
                .doOnError(throwable -> System.out.println("doOnError:"+throwable))
                .doOnComplete(()-> System.out.println("complete"))
                .subscribe(item-> System.out.println("success item:"+item),
                        item2-> System.out.println("error item:"+item2)
                );
    }
    public static void main(String[] args) {
        new OnErrorExam().run();
        new OnErrorExam().run2();
    }
}
