package Exception_Handling;

public class SingleTryMultipleCatch {

    public static void main(String[] args) {

            try{
                int a = 100 / 10;
                int[] arr = new int[10];
                arr[1] = 100;
                SingleTryMultipleCatch obj  = new SingleTryMultipleCatch();
                obj =  null;
                System.out.println("what will happen to this line? ");
                obj.dummy();
            } catch (ArithmeticException ae){
                System.out.println("Got ArithmeticException");
            } catch (NullPointerException npe){
                System.out.println("Got NullPointerException ");
            } catch (ArrayIndexOutOfBoundsException indexOutOfBoundsException){
                System.out.println("Got ArrayIndexOutOfBoundsException ");
            } catch (RuntimeException re){
                System.out.println("Got Runtime exception ");
            }  catch (Exception ex){
                System.out.println("Got exception ");
            }

            System.out.println("Test message printed");
        }

        void dummy(){
            System.out.println("Dummy method ");
        }
    }


