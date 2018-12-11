package generic;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class GugudanExample2 {
    public static void main(String[] args) {
        Observable.range(2, 8)
                .flatMap(dan -> Observable.range(1, 9)
                        .map(num -> dan+ "*" + num + "=" + dan * num))
                .subscribe(System.out::println);

    }
}
