import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Consumer;

public class CreateExample {
    public static void main(String[] args) {
        Observable<Integer> source = Observable.create((ObservableEmitter<Integer> emitter) -> {
            emitter.onNext(100);
            emitter.onNext(200);
            emitter.onNext(300);
            emitter.onComplete();

        });

        // 람다 + 메소드 레퍼런스
        source.subscribe(System.out::println);

        // 그냥 코드
        source.subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println("result : " + integer);
            }
        });

    }
}
