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

    public static void main(String[] args) {
        new OnErrorExam().run();

    }
}
