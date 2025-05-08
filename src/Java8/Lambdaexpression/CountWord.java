package Java8.Lambdaexpression;



interface  WordCounter{

    int count(String sentance);
}

public class CountWord {
    public static void main(String[] args) {

        WordCounter counter = (sentance) -> {
            if (sentance == null || sentance.trim().isEmpty()){
                return 0;
            }
            String[] word = sentance.split("\\s+");
            return word.length;
        };

        String input = "Java Lambda expression make code clean and";

        System.out.println("Word count : " +counter.count(input));
    }
}
