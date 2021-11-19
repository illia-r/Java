package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;


public class UDPServer {
    DatagramSocket socket;
    BufferedReader in = null;
    String str = null;
    byte[] buffer;
    DatagramPacket packet;
    InetAddress address;
    int port;

    public UDPServer() throws IOException
    {
        // Объект для получения запросов клиента
        socket = new DatagramSocket(1501);
        call();

    }
    public void call()
    {
        try {
            while (true){
                buffer = new byte[256];
                packet = new DatagramPacket(buffer, buffer.length);
                // Принимается пакет датаграм
                socket.receive(packet);

                if (packet == null) break;
                System.out.println("Request string for sending to client");
                try {
                    // Создается входной поток, который считывает данные с консоли
                    in = new BufferedReader(new InputStreamReader(System.in));
                }
                catch (Exception ex){
                    System.out.println("Error: " + ex);
                }
                str = in.readLine();
                buffer = str.getBytes();
                address = packet.getAddress();
                port = packet.getPort();
                packet = new DatagramPacket(buffer, buffer.length, address, port);
                // Посылается датаграммный пакет
                socket.send(packet);
            }
            // Закрывается поток и сокет
            in.close();
            socket.close();
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
