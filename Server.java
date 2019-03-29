

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {

    public Server() {}

   // public String sayHello() {
    //    return "Hello, world!";
    //}
    
@Override
    public float suma (float a,float b) throws RemoteException  {
     return a+b;
    }
    
    @Override
    public float multiplicacion (float a,float b) throws RemoteException  {
    return a*b;
    }
    @Override
    public float divicion (float a,float b) throws RemoteException  {
    return a/b;
    }
    @Override
    public float resta (float a,float b) throws RemoteException  {
     return a-b;
    }
    

    public static void main(String args[]) {

        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Hello", stub);
            

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
        
        
    }
}
