package recursives;

public class RecursiveVoidExam {

    private void targetRecursive(int idx){
        System.out.println("idx:"+idx);
        if(idx < 100){
            targetRecursive(idx + 10);
        }
    }

    private void run() {
        targetRecursive(0);
    }

    public static void main(String[] args) {
        new RecursiveVoidExam().run();

    }
}
