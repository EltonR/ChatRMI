package interfaces;

import entities.RoomChat;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IServerRoomChat extends Remote{
    
    public ArrayList<RoomChat> getRooms() throws RemoteException;
    public void createRoom(String roomName) throws RemoteException;
    
}
