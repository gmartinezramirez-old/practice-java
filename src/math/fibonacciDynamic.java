
public class fibonacciDynamic {
    public static int calculateFibonacci(int index) {
        if (index == 0)
            return 0;

        if (index == 1)
            return 1;

        int prePre = 0;
        int pre = 1;
        int result = 0;
        for (int i = 1; i < index; i++) {
            result = prePre + pre;
            prePre = pre;
            pre = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int index = 3;
	int fibonacciResult = calculateFibonacci(index);
        System.out.println(calculateFibonacci);
    }

}
