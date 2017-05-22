package entities;

import interfaces.IUserChat;

public class UserChat implements IUserChat {

    private String usrName;

    @Override
    public void deliverMsg(String senderName, String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

}
