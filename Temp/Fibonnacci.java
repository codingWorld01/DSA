public class Fibonnacci {
        public int fib(int n) {
            if(n == 0) return 0;
            if(n == 1) return 1;
            int sum = 0, t1 = 0, t2 = 1;
    
            for(int i = 2; i <= n; i++) {
                sum = t1 + t2;
    
                t1 = t2;
                t2 = sum;
            }
    
            return sum;
        }
}
