package interfaces;

import java.rmi.Remote;

public interface IUserChat extends Remote{
    
    public void deliverMsg(String senderName, String msg);
    
}
