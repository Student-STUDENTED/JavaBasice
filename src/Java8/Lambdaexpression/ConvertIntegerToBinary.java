package Java8.Lambdaexpression;


interface IntegerConvert{

    int converBinary(int num);
}

public class ConvertIntegerToBinary {
    public static void main(String[] args) {

        IntegerConvert integer = num -> {

            int binary = 0, pow = 1;
            while (num > 0) {
                int rem = num % 2;
                num /= 2;

                binary += rem * pow;
                pow = pow * 10;

            }
            return binary;
        };

        int nums = 4;

        System.out.println(integer.converBinary(nums));
    }
}
