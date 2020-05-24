package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
TCP通信服务器端
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象和系统指定端口
        ServerSocket serverSocket = new ServerSocket(8080);
        //2.使用ServerSocket对象中的方法accept获取请求客户端Socket对象
        Socket socket = serverSocket.accept();
        //3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();
        //4.使用网络字节输入流InputStream对象中的方法read,读取服务器回写数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //5使用Socket对象中的方法getOutputStream()获取网络字节输入流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //6.使用网络字节输入流OutputStream对象中的方法write,给客户端回写数据
        outputStream.write("Hello Client".getBytes());
        //7.释放资源Socket
        socket.close();
        serverSocket.close();
    }
}
