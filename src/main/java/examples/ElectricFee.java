package examples;

import io.reactivex.Flowable;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class ElectricFee {
    public static void main(String[] args) {
        String[] data = {"100", "300"};
        Flowable<Integer> basePrice = Flowable.fromArray(data)
                .map(Integer::parseInt)
                .map(val -> {
                    if (val <= 200) return 910;
                    if (val <= 400) return 1600;
                    return 7300;

                });
        basePrice.subscribe(System.out::println);

        Flowable<Integer> usagePrice = Flowable.fromArray(data)
                .map(Integer::parseInt)
                .map(val -> {
                    double series1 = min(200, val) * 93.3;
                    double series2 = min(200, max(val-200, 0)) * 187.9;
                    double series3 = min(0, max(val-400, 0)) * 280.65;
                    return (int) (series1 + series2 + series3);
                });

        Flowable<Integer> source = Flowable.zip(
                basePrice,
                usagePrice,
                (v1, v2) -> v1 + v2
        );

        source.subscribe(System.out::println);


    }
}
