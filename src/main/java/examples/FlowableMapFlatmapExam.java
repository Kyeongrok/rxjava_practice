package examples;

import io.reactivex.Flowable;

public class FlowableMapFlatmapExam {

    public static void main(String[] args) {

        Flowable<Integer> source = Flowable.range(1, 10);

        source
        .map(intvalue -> {
            return intvalue * 10;
        })
        .flatMap(intValue ->{
            return Flowable.just(intValue);
        })
        .subscribe(System.out::println)
        ;

    }
}
