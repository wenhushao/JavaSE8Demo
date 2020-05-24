package FilesUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
文件上传服务器端
 */
public class FilesUploadServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器ServerSocket,和系统指定的端口
        ServerSocket serverSocket = new ServerSocket(8080);
        //2.使用ServerSocket对象中的方法accept,获取请求到的客户端Socket对象
        Socket socket = serverSocket.accept();
        //3.使用Socket方法中getInputStream,获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();
        //4.判断D:\\Pictures\\Upload文件夹是否存在，不存在则创建
        File file = new File("D:\\Pictures\\Upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        //5.创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fileOutputStream = new FileOutputStream(file + "\\zero.png");
        //6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            //7. 使用网络字节输入流FileOutputStream对象中的方法write，把读取的文件保存到服务器的硬盘
            fileOutputStream.write(bytes, 0, len);
        }

        //8.使用Socket方法中的getOutputStream,获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //9.使用网络字节输出流OutputStream对象中的方法write，给客户端回写“上传成功”
        outputStream.write("上传成功".getBytes());
        //10.释放资源
        fileOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
