package ma.fstm.ilisi.rmimoneyconversion.client;

import ma.fstm.ilisi.rmimoneyconversion.server.services.IConvertisseurRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            IConvertisseurRemote conv = (IConvertisseurRemote) Naming.lookup("rmi://localhost:6666/CV");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount to convert: ");
            double amount = scanner.nextDouble();
            System.out.println(conv.conversion (amount));
            System.out.println("Date: " + conv.getServerDate());
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
