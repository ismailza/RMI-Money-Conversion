package ma.fstm.ilisi.rmimoneyconversion.client;

import ma.fstm.ilisi.rmimoneyconversion.server.services.IConvertisseurRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        try {
            IConvertisseurRemote conv = (IConvertisseurRemote) Naming.lookup("rmi://localhost:6666/CV");
            System.out.println(conv.conversion (20));
            System.out.println(conv.getServerDate());
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
