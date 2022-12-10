package func;


public class Main {
    public static void main(String[] args) {
       new MySupply() {
           @Override
           public String supply() {
               return "Hello Wordl";
           }
       }.supply();

       MyRunnable myRunnable = new MyRunnable() {
           @Override
           public void run() {
               MySupply s = new MySupply() {
                   @Override
                   public String supply() {
                       return "Hello Hello";
                   }
               };System.out.println(s.supply());
           }
       };
        myRunnable.run();
    }
}
