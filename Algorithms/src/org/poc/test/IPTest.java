package org.poc.test;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress IP = Inet4Address.getLocalHost();
		System.out.println("IP of my system is := " + IP.getHostAddress());
		
		
		
		System.out.println(IP.toString());
	}

}
