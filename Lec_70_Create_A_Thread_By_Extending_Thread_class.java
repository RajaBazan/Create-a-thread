package hello.com;
class Mythread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<10){
            System.out.println("I'm thread 1 of Cooking");
            System.out.println("I'm Happy");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<10){
            System.out.println("I'm thread 2 of Chatting");
            System.out.println("I'm Sad!");
            i++;
        }
    }}
public class Lec_70_Create_A_Thread_By_Extending_Thread_class {
    public static void main(String[] args) {
    Mythread1 t1 = new Mythread1();
    Mythread2 t2 = new Mythread2();
    t1.start();
    t2.start();

    }
}
