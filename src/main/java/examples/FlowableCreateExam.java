package examples;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

public class FlowableCreateExam {

    public void run() {
        int offset = 0;
        Flowable.create(subject -> {
            subject.onNext(10);
            subject.onComplete();

        }, BackpressureStrategy.BUFFER)
        .subscribe(item -> System.out.println(item));
    }

    public static void main(String[] args) {
        new FlowableCreateExam().run();

    }
}
