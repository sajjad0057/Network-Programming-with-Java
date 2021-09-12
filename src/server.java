import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class server {


    public server() throws IOException {


        ServerSocket serverSocket=new ServerSocket(8000);
        System.out.println("Server started");
        Socket socket=serverSocket.accept();

        BufferedOutputStream bof=new BufferedOutputStream(socket.getOutputStream());

        BufferedInputStream bif=new BufferedInputStream(socket.getInputStream());

        int len=0;
        byte[] b=new byte[2048];
        while ((len=(bif.read(b)))!=-1)
        {
            System.out.println(new String(b));
        }

    }

    public static void main(String[] args) {
        try {
            new server();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
