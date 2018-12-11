package examples;

public class DoWhileExam {

    public void run() {

        int i = 0;
        do {
            i += 1;
            System.out.println(i);

        } while (i < 10);

    }
    public static void main(String[] args) {
        new DoWhileExam().run();

    }
}
