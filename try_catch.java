/*
class String {
    public void run(){
        System.out.println(" I am a Construter for class String........");
    }
}
class Mystring extends String{
    @Override
    public void run(){
        System.out.println("I am a copy of class string from overriding ");
    }
}
public class try_catch {
    public static void main(String [] args){
        Mystring t1 = new Mystring();
        t1.run();
    }

}

 */
public class try_catch {
    public static void main(String [] args){
        int a = 90;
        int b = 5;
        try {
            int c = a/b;
            System.out.println("The result of a Divided by b is : " + c);

        }
        catch (Exception e) {
            //System.out.println(".Reason : ");
            System.out.println(e);
        }
        System.out.println("Exit Or End of the code");
    }
}

