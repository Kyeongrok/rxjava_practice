package examples;

import io.reactivex.Flowable;

public class ReturnExam {
    public String run() {
        System.out.println("----before start----");

        Flowable.range(1, 100000)
                .subscribe(item -> System.out.println(item));
        return "------return------";
    }

    public static void main(String[] args) {
        String result = new ReturnExam().run();
        System.out.println(result);
    }
}
