package operators;


import io.reactivex.Observable;

public class RangeExample {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .subscribe(System.out::println);
    }
}
