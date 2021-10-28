
public class Test {
    public static void main(String[] args) {
        System.out.println(solution(1,0));
    }

    public static int solution(int M,int N) {
        if(M == 0 && N == 0) {
            return 0;
        }
        if(M % 2 == 0) {
            if(M/4 + N < 4) {
                return 2;
            }else {
                return (int)Math.sqrt(M + 4*N);
            }
        }
        else
        {
            int value = (int)Math.sqrt(M/4+N);
            int remain = M - (value*value - N);
            if(4*value + 1 <= remain) {
                return value*2 +1;
            }else {
                return value*2;
            }
        }
    }
}
