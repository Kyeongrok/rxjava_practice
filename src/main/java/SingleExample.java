import io.reactivex.Observable;
import io.reactivex.Single;

public class SingleExample {
    public static void main(String[] args) {
        SingleExample singleExample = new SingleExample();

        singleExample.toSinglefromObservable();
        singleExample.singel2();


        String[] arr = {"red", "blue", "gold"};
        Observable.fromArray(arr)
                .first("default value")
                .subscribe(System.out::println);

        Observable.empty()
                .single("default value")
                .subscribe(System.out::println);

        System.out.println(String.format("%s", "hello"));

    }

    private void singleWithTake() {

    }

    private void singel2() {
        Observable.just("single2")
                .single("default item")
                .subscribe(System.out::println);

    }

    private void toSinglefromObservable() {
        Observable<String> source = Observable.just("singleFromObservable");
        Single.fromObservable(source).subscribe(System.out::println);

        // 이건 에러남
//        Observable<String> source2 = Observable.just("singleFromObservable", "hello");
//        Single.fromObservable(source2).subscribe(System.out::println);



    }

}
