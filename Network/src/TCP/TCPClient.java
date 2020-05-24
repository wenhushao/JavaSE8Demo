package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
TCP通信客户端
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建一个客户端对象Socket,构造方法绑定服务器的IP和端口
        Socket socket = new Socket("127.0.0.1", 8080);
        //2.使用Socket对象中getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //3.使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据
        outputStream.write("Hello Server".getBytes());
        //4.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();
        //5.使用网络字节输入流InputStream对象中的方法read,读取服务器回写数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //6.释放资源Socket
        socket.close();
    }
}
