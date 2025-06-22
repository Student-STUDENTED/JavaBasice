package Exception_Handling.CheckException;


import java.io.*;

public class CheckedException4 {

    public static void main(String[] args) {

       try {
           FileReader fileReader = new FileReader("file.txt");

           BufferedReader bufferedReader = new BufferedReader(fileReader);

           String data;
           while ((data = bufferedReader.readLine()) != null){
               System.out.println(data);
           }
       }catch (FileNotFoundException e){
           System.out.println("File not found : " +e.getMessage());
           System.out.println(e.getCause());
       } catch (IOException e) {
           System.out.println(e.getCause());
           System.out.println(e.getMessage());
       }
    }
}
