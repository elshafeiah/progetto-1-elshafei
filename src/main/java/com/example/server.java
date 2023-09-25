package com.example;
import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    ServerSocket server=null;
    Socket client=null;
    String stringaRicevuta=null;
    String stringaModificata=null;
    BufferedReader inDaclient;
    DataOutputStream outVersoClient;
    

    public Socket attendi(){

try{
    System.out.println("1 server partito in exe");
    server=new ServerSocket(6789);
    client=server.accept();
    server.close();
    inDaclient=new BufferedReader(new InputStreamReader(client.getInputStream()));
    outVersoClient=new DataOutputStream(client.getOutputStream());
  
}
catch(Exception e)
{
    System.out.println(e.getMessage());
    System.out.println("errore durante istanza del server !");
    System.exit(1);


}

    
return client;
    }


}
