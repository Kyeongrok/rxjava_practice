import io.reactivex.Observable;

public class FromArrayExample {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30};

        Observable<Integer> source = Observable.fromArray(arr);
        source.subscribe(System.out::println);
    }
}
