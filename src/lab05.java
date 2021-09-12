public class lab05 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Ok");
            System.out.println("bye");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new lab05().start();
        System.out.println("I am Main");
    }
}
