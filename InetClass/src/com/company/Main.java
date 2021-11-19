package com.company;

import java.net.*;

class InetClass {

    public static void main(String[] args) throws Exception {
	// write your code here
        try {
            InetAddress address = InetAddress.getLocalHost();
            String addressHost = address.getHostAddress();

            System.out.println("IP Host " + addressHost);
            System.out.println("Host Name " + address.getHostName());
        }
        catch (UnknownHostException ex){
            System.out.println("Error");
        }

        new UDPServer();



    }
}
