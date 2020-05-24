package FilesUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
文件上传客户端
 */
public class FilesUploadClient {
    public static void main(String[] args)  throws IOException {
        //1.创建一个本地字节输入流FileInputStream,构造方法中要绑定读取的数据源
        FileInputStream fileInputStream = new FileInputStream("D:\\Pictures\\Zero\\zero.png");
        //2.创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口
        Socket socket = new Socket("127.0.0.1",8080);
        //3.使用Socket方法中getOutputStream,获取网络字节输出流OutputStream对象
        OutputStream outputStream=socket.getOutputStream();
        //4.使用本地字节输入流FileInputStream对象中的方法read，读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes))!=-1){
            //5.使用网络字节输出流OutputStream对象中的方法write,把读取的文件上传到服务器
            outputStream.write(bytes,0,len);
        }
        //6.使用Socket方法中的getInputStream,获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();
        //7.使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //8.释放资源
        fileInputStream.close();
        socket.close();
    }
}
