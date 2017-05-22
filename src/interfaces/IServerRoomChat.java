package interfaces;

import entities.RoomChat;
import java.rmi.Remote;
import java.util.ArrayList;

public interface IServerRoomChat extends Remote{
    
    public ArrayList<RoomChat> getRooms();
    public void createRoom(String roomName);
    
}
