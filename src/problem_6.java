// A Java program for a Server and a Client
// they will communicate with each other
//

import java.net.*;
import java.io.*;

public class problem_6 extends Thread {
    public static void main(String[] args) {
        Server S1 = new Server();
        Client C1 = new Client();
        Thread T2 = new Thread(C1);
        S1.start();
        T2.start();
    }
}

class Client implements Runnable{
    public void run() {
        try {
            Socket s = new Socket("localhost", 6969);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("thread 2 is finished");
    }
}

class Server extends Thread{
    public void run() {
        try{
            ServerSocket ss=new ServerSocket(6969);
            Socket s=ss.accept();//establishes connection
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();
            System.out.println("message= "+str);
            ss.close();
        }catch(Exception e)
        {System.out.println(e);}
        System.out.println("thread 1 is finished");
    }
}