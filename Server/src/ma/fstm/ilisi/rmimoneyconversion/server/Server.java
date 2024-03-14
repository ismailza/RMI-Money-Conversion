package ma.fstm.ilisi.rmimoneyconversion.server;

import ma.fstm.ilisi.rmimoneyconversion.server.services.ConvertisseurIpml;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            // Démarrer l'annuaire
            LocateRegistry.createRegistry(6666);
            // Crée l'objet distant
            ConvertisseurIpml convIpml = new ConvertisseurIpml();
            // Publier sa référence dans l’annuaire
            Naming.rebind("rmi://localhost:6666/CV", convIpml);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
