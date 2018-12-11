package examples;

import io.reactivex.Flowable;

public class FlowableExample {
    public void run() {
        String[] ar = {"1", "2"};
        Flowable<String> source = Flowable.fromArray(ar);

        source.subscribe(System.out::println);
        source.subscribe(System.out::println);
    }
    public static void main(String[] args) {
        new FlowableExample().run();

    }
}
