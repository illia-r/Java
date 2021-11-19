package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {

    static DatagramSocket socket;
    static InetAddress address;
    static byte[] buffer;
    static DatagramPacket packet;
    static String str, str2;
    static BufferedReader br;

    public static void main(String[] args) throws Exception {
	// write your code here
        br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            // Связываем сокет с портом по умолчанию
            socket = new DatagramSocket();
            address = InetAddress.getByName("127.0.0.1");
            buffer = new byte[256];
            packet = new DatagramPacket(buffer, buffer.length, address, 1501);

            // Посылаем DatagramPacket на сервер
            socket.send(packet);
            System.out.println("Sending request ");
            packet = new DatagramPacket(buffer, buffer.length);

            // Пригимает пакет от сервера
            socket.receive(packet);

            // Примнимает данные от объекта пакета датаграмм
            str = new String(packet.getData());
            System.out.println("Received message: " + str.trim());
            System.out.println("Do you want continue (Yes/No) :");
            str2 = br.readLine();
            if (str2.equals("No")) break;
        }
        socket.close();
    }
}
