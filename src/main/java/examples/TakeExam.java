package examples;


import io.reactivex.Observable;

public class TakeExam {
    public void run() {
        Observable.just(1, 2, 3)
                .take(10l)
                .subscribe(System.out::println);

    }

    public static void main(String[] args) {
        new TakeExam().run();
    }
}
