package ma.fstm.ilisi.rmimoneyconversion.server.services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface IConvertisseurRemote extends Remote {

    double conversion(double montant) throws RemoteException;
    Date getServerDate() throws RemoteException;

}
