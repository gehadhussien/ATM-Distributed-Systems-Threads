
package parthreads;
// Java implementation of Server side
// It contains two classes : Server and ClientHandler
// Save file as Server.java

import java.io.*;
import java.util.*;
import java.net.*;

// Server class

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class server
{
static ServerGui1 ser;

	// Vector to store active clients
	static Vector<ClientHandler> ar = new Vector<>();
	
	// counter for clients
	static int i = 1;

	public static void main(String[] args) throws IOException
	{
            ser=new ServerGui1();
            ser.setVisible(true);
		// server is listening on port 1234
		ServerSocket ss = new ServerSocket(1234);
		
		Socket s;
		
		// running infinite loop for getting client request
		while (true)
		{
			// Accept the incoming request
			s = ss.accept();

			System.out.println("New client request received : " + s);
			ser.jTextArea1.append("New client request received : " + s+"\n");
			// obtain input and output streams
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
			System.out.println("Creating a new handler for this client...");
			// Create a new handler object for handling this request.
			ClientHandler mtch = new ClientHandler(s,"client " + i,"pass"+i, dis, dos);

			// Create a new Thread with this object.
			Thread t = new Thread(mtch);
			
			System.out.println("Adding this client to active client list");

			// add this client to active clients list
			ar.add(mtch);

			// start the thread.
			t.start();

			// increment i for new client.
			// i is used for naming only, and can be replaced
			// by any naming scheme
			i++;

		}
	}
}

// ClientHandler class
class ClientHandler implements Runnable
{
	private String name;
        private String pass;
	final DataInputStream dis;
	final DataOutputStream dos;
	Socket s;
	boolean exist;
        static boolean isloggedin2;
        static boolean isloggedin3;
	double balance=5000;
        double money=0;
	// constructor
	public ClientHandler(Socket s, String name,String pass,DataInputStream dis, DataOutputStream dos) {
		this.dis = dis;
		this.dos = dos;
                this.pass=pass;
		this.name = name;
		this.s = s;
		this.exist=true;
	}

	@Override
	public void run() {

		String received;
		while (true)
		{
			try
			{
				// receive the string from client 
				received = dis.readUTF();
				                        
				System.out.println(received);
				
                                
                                
                                if(received.equals("logout")){
                                        this.exist=false;
					this.s.close();
					break;
				}
				
                                
				// break the string into message and recipient part
				StringTokenizer st = new StringTokenizer(received, "#");
                                String oper = st.nextToken();
    				String amount = st.nextToken();
                                String x = st.nextToken();


                                 
                                for (ClientHandler mc : server.ar)
				{
                                 // if the recipient is found, write on its output stream
                                  
                                        if (oper.equals("login") && mc.exist==true ) {
                                   if (mc.name.equals(amount) && mc.pass.equals(x)&& mc.exist==true ) {
                                                
                                                isloggedin2=true;
                                              dos.writeUTF("Login Success");
                                           server.ser.jTextArea1.append (name+"Login Successfully"+"\n");

						break;
                                            }
                                else {
                                                    isloggedin2=false;  
                                    		dos.writeUTF("Login Failed");
                                           server.ser.jTextArea1.append (this.name+"Login Failed"+"\n");
                                                
                                }
                                }
                                    if (oper.equals("Withdraw") && mc.exist==true )
					{
                                              money=Integer.parseInt(amount);
                                            if (money<=7000) {
                                                
                                                 balance-=money;
						dos.writeUTF("Withdraw Success ");
                         server.ser.jTextArea1.append (this.name+"Withdraw Successfully with "+amount+"\n");

						break;
                                            }
                                             else{
                                    		dos.writeUTF("Withdraw Failed maximum amount is 7000 per day  ");
                                                server.ser.jTextArea1.append (this.name+"Withdraw Failed with "+amount+"\n");
                                    }
                                           
					}
                                   
                                        if (oper.equals("Depoist") && mc.exist==true)
					{
                                         money=Integer.parseInt(amount);

                                            balance+=money;
						dos.writeUTF("Depoist Success ");
                                               server.ser.jTextArea1.append (this.name+"Depoist Success with "+amount+"\n"); 
						break;
					}
                                        if (oper.equals("Check") && mc.exist==true)
					{


						dos.writeUTF("Your Balance is : "+balance);
                                                server.ser.jTextArea1.append (this.name+"Checked his balance "+balance+"\n");
						break;
					}
				
                                if (oper.equals("usd") && mc.exist==true )
					{
                        money=Integer.parseInt(amount);

						dos.writeUTF("The covertion to dollars is  : "+money/15.73);
                                                server.ser.jTextArea1.append (this.name+"Converted to Dollars "+"\n");
						break;
					}
                                
                                if (oper.equals("eur") && mc.exist==true )
					{
                                                money=Integer.parseInt(amount);

						dos.writeUTF("The covertion to Euro is  : "+money/17.74);
                                                server.ser.jTextArea1.append (this.name+"Converted to Euro "+"\n");
						break;
					}
                                // trans#200#client2   oper#amount#x    
                               
                                if (oper.equals("transation") && mc.exist==true )
                                {       
                                    
                                
                             		if (mc.name.equals(x) && mc.exist==true)
					{
                                            money=Integer.parseInt(amount) ;

                                            if (balance>=money) {
                                            balance-=money;
                                             mc.balance+=money;
						dos.writeUTF("Transfer to "+x+" : "+money);
                                                server.ser.jTextArea1.append (this.name+"Transfers money to  "+mc.name+" With "+amount+"\n");
						break;
                                            }
                                            else{
                                            dos.writeUTF("Insufficient balance"+" Your balance is : "+balance);
                                                server.ser.jTextArea1.append ("Insufficient balance"+" Your balance is : "+balance+"\n");
                                            }

					}
                                	
                                
                                }
                                        
                                        
                                } 
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		try
		{
			// closing resources
			this.dis.close();
			this.dos.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}