package operators;

import commons.Shape;
import io.reactivex.Flowable;

/*
    앞에 2개를 3번째 식으로 연산한 결과를 돌려준다.
 */
public class ZipExample {
    public static void main(String[] args) {
        String[] shapes = {"BALL", "PENTAGON", "STAR"};
        String[] coloredTriangles = {"2-T", "6-T", "4-T"};

        Flowable<String> source = Flowable.zip(
            Flowable.fromArray(shapes).map(Shape::getSuffix),
            Flowable.fromArray(coloredTriangles).map(Shape::getColor),
                (suffix, color)-> color + suffix
        );

        source.subscribe(System.out::println);
    }
}
