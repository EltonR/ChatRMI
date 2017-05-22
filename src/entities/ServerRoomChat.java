package entities;

import interfaces.IServerRoomChat;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ServerRoomChat implements IServerRoomChat {

    private ArrayList<RoomChat> roomList;

    public static void main(String[] args) {
        try {
            ServerRoomChat obj = new ServerRoomChat();
            IServerRoomChat stub = (IServerRoomChat) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("IServerRoomChat", stub);

            System.err.println("Server ready");
        } catch (AlreadyBoundException | RemoteException e) {
            System.err.println("Server exception: " + e.getMessage());
        }
    }
    
    public ServerRoomChat() {
        roomList = new ArrayList<>();
        roomList.add(new RoomChat("TesteRoom 1"));
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
