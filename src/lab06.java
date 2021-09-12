import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//public class lab06 {
//
//    public static void main(String[] args) {
//        new Server().start();
//        new Client().start();
//        System.out.println("lab 06");
//    }
//}

//class Server extends Thread{
//    @Override
//    public void run() {
//        ServerSocket ss= null;
//        try {
//            ss = new ServerSocket(5000);
//            System.out.println("Server Started");
//            Socket socket=ss.accept();
//            System.out.println("Received a client");
//            DataInputStream bif=new DataInputStream(socket.getInputStream());
//            System.out.println(bif.readUTF());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

//class Client extends Thread{
//
//
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Socket socket= null;
//        try {
//            socket = new Socket("localhost",5000);
//            DataOutputStream bof=new DataOutputStream(socket.getOutputStream());
//
//            bof.writeUTF("hello Server");
//            bof.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}