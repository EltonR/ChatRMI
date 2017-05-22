package entities;

import interfaces.IServerRoomChat;
import interfaces.IUserChat;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class UserChat implements IUserChat {

    private String usrName;

    @Override
    public void deliverMsg(String senderName, String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            IServerRoomChat stub = (IServerRoomChat) registry.lookup("IServerRoomChat");
            
            ArrayList<RoomChat> roomList = stub.getRooms();
            for(int i=0; i<roomList.size(); i++)
                System.out.println(roomList.get(i).getRoomName());
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

}
