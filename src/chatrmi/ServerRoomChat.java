package chatrmi;

import interfaces.IServerRoomChat;
import java.util.ArrayList;

public class ServerRoomChat implements IServerRoomChat {

    private ArrayList<RoomChat> roomList;

    public ServerRoomChat() {
        roomList = new ArrayList<>();
    }

    @Override
    public ArrayList<RoomChat> getRooms() {
        return roomList;
    }

    @Override
    public synchronized void createRoom(String roomName) {
        RoomChat roomChat = new RoomChat(roomName);
        roomList.add(roomChat);
    }

}
