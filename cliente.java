



import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class cliente{


    private cliente() {}

    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
       
       Float a,b;
       System.out.println("valor 1");
       a = read.nextFloat();
       
       System.out.println("valor 2");
       b = read.nextFloat();
        
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Hello stub = (Hello) registry.lookup("Hello");
            //String response = stub.sayHello();
            String response = "suma"+stub.suma(a,b)+
                               "\nresta"+stub.resta(a,b)+
                                "\ndivicion"+stub.divicion(a,b)+
                                "\nmultiplicacion"+stub.multiplicacion(a,b);
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
        
    }
}
