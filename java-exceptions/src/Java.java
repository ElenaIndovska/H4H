import java.io.*;
import java.sql.SQLOutput;

class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}


class JavaExceptionExample{

//    static void validate(int age) throws CustomException{
//        if(age<18){
//            throw new CustomException("Not valid");
//        }else{
//            System.out.println("You can vote");
//        }
//    }


    //Unchecked exception AritmethicException
//    public static void example() {
//        int data=100/0;
//        System.out.println("rest of the code...");
//    }

    //handling unchecked exception
//    public static void example() {
//        try{
//            int data=100/0;
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("rest of the code...");
//    }

    //unchecked exception NullPointerException
//    public static void example() {
//        String s=null;
//        System.out.println(s.length());
//    }

    //Unchecked exception ArrayIndexOutOfBoundsException
//    public static void example() {
//        try {
//            int a[] = new int[2];
//            System.out.println("Access element three :" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown  :" + e);
//        }
//        System.out.println("Out of the block");
//    }

    //try...catch...finally
//    public static void example() {
//        int a[] = new int[2];
//        try {
//            System.out.println("Access element three :" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown  :" + e);
//            return;
//        } finally {
//            a[0] = 6;
//            System.out.println("First element value: " + a[0]);
//            System.out.println("The finally statement is executed");
//        }
//    }

    //Fix this code so the application can run normally
    public static void example() throws IOException {
        FileReader fr = null;
        File file = new File("C:\\Users\\Marija Miloshevska\\Downloads\\OPTs\\living_situations.en");

        try {
            fr = new FileReader(file); char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fr.close();
        }

    }

//    public static void example() {
//        try{
//            System.out.println(3/0);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//    }


    //checked exception will be thrown
//    public static void example() {
//        File file = new File("E://file.txt");
//        try {
//            FileReader fr = new FileReader(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String args[]) {
        //example();
//        try{
//            validate(15);
//        }catch(CustomException e){
//            System.out.println("Exception: " + e);
//        }
//        System.out.println("Done");
    }
}
