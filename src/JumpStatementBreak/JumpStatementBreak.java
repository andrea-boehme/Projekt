package JumpStatementBreak;

public class JumpStatementBreak {

    public static void main(String[] args) {

        for(int i=0; i < 10; i++) {
            if(i == 3){
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}

