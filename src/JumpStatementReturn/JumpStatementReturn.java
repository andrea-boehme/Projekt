package JumpStatementReturn;

public class JumpStatementReturn {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                return;
            } else {
                System.out.println(i);
            }
        }
    }
}
