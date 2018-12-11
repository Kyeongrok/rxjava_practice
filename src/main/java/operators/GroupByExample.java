package operators;

import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

public class GroupByExample {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .groupBy(integer -> integer % 3)
                .subscribe(integerIntegerGroupedObservable -> {
                    integerIntegerGroupedObservable.toList().subscribe(System.out::println);
                });

    }
}
