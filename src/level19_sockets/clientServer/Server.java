package level19_sockets.clientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static int i = 0;

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(25000);

        int localPort = server.getLocalPort();
        System.out.println(localPort);

        System.out.println("Сервер запущен!");

        while (true){
            // С ЭТОЙ ТОЧКИ СЕРВЕР ОЖИДАЕТ ВХОДЯЩИЕ ЗАПРОСЫ
            Socket accept = server.accept();

            // ПОЛУЧАТЬ
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            // ОТПРАВЛЯТЬ
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));


            String request = bufferedReader.readLine();
            System.out.println("Запрос получен " + ++i);
            System.out.println(request);

            String response = "Привет! Я ответ!";

            bufferedWriter.write(response);
            bufferedWriter.flush();

            bufferedReader.close();
            bufferedWriter.close();
            accept.close();

        }

    }
}
