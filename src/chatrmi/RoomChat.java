package chatrmi;

import interfaces.IRoomChat;
import java.util.ArrayList;

public class RoomChat implements IRoomChat {
    
    private String roomName;
    private ArrayList<UserChat> userList;

    public RoomChat(String roomName) {
        userList = new ArrayList<>();
        this.roomName = roomName;
    }

    @Override
    public void sendMsg(String usrName, String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void joinRoom(String usrName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void leaveRoom(String usrName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<UserChat> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<UserChat> userList) {
        this.userList = userList;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    
}
