package level19_sockets.clientServer;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {

        // localhost = 127.0.0.1
        InetAddress localHost = InetAddress.getLocalHost();
        // SOCKET = IP + PORT
        Socket socket = new Socket(localHost, 25000);

        System.out.println("Клиент начал работу");

        // ПОЛУЧАТЬ
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // ОТПРАВЛЯТЬ
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        // ОТПРАВЛЯЕМ ЗАПРОС НА СЕРВЕР
        String request = "Дядя Юра!\n";
        bufferedWriter.write(request);
        bufferedWriter.flush();

        // ПОЛУЧАЕМ ОТВЕТ ОТ СЕРВЕРА
        String response = bufferedReader.readLine();
        System.out.println(response);

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();

    }
}
