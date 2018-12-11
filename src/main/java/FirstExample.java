import io.reactivex.Flowable;
import io.reactivex.Observable;

public class FirstExample {
    public void emit(){
        Flowable.just("hello", "rxjava2!!")
            .subscribe(System.out::println);
    }
    public static void main(String[] args) {
        FirstExample firstExample = new FirstExample();
        firstExample.emit();
    }
}
