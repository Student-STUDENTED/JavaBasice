    package Java8.Lambdaexpression;


    interface Palindrome{

        String  check(String str);
    }

    public class CheckPalindrome {

        public static void main(String[] args) {

            Palindrome isPalindrome = (s -> {
                String reverse = "";
                for (int i = s.length() - 1; i >= 0; i--) {
                    reverse += s.charAt(i);

                }
                if (s.equalsIgnoreCase(reverse)){
                    return s + " is a palindrome";
                }
                else {
                    return s + " is not palindrome";
                }
            });


            String s1 = "nitin";
            System.out.println(isPalindrome.check(s1));
            String s2 = "avaa";
            System.out.println(isPalindrome.check(s2));


        }

    }
