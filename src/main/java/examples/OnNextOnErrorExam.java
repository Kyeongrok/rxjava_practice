package examples;

import io.reactivex.Flowable;

public class OnNextOnErrorExam {

    public void run() {
        String[] ar = {"a", "b", "c", "d"};
        Flowable.fromArray(ar)
                .subscribe(
                        item -> System.out.println(item),
                        Throwable::printStackTrace,
                        () -> System.out.println("completed"));
    }

    public static void main(String[] args) {
        new OnNextOnErrorExam().run();

    }
}
