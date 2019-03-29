


import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Hello extends Remote {
     //String sayHello() throws RemoteException;
     
     float suma (float a,float b) throws RemoteException;
     float resta (float a,float b) throws RemoteException;
     float multiplicacion (float a,float b) throws RemoteException;
     float divicion (float a,float b) throws RemoteException;

     
     
    }