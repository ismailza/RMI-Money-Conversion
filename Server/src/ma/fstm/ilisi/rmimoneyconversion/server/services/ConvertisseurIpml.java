package ma.fstm.ilisi.rmimoneyconversion.server.services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ConvertisseurIpml extends UnicastRemoteObject implements IConvertisseurRemote {
    public ConvertisseurIpml() throws RemoteException {
        super();
    }

    @Override
    public double conversion(double montant) throws RemoteException {
        return montant * 11;
    }

    @Override
    public Date getServerDate() throws RemoteException {
        return new Date();
    }
}
