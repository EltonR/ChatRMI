package interfaces;

import chatrmi.RoomChat;
import java.util.ArrayList;

public interface IServerRoomChat extends java.rmi.Remote{
    
    public ArrayList<RoomChat> getRooms();
    public void createRoom(String roomName);
    
}
