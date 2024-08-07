package defenseSystem;

import java.util.ArrayList;
import newpackage.Helicopter;
import newpackage.Submarine;
import newpackage.Tank;

/**
 *
 * @author user
 */
public class Observable {

    private ArrayList<Observer> observerList = new ArrayList<>();

    private boolean status;
    private int position;
    private String message;
    private boolean select;
    private int checkNum;
    private String reciveMessage;

    public void add(Observer ob) {
        observerList.add(ob);

    }

    public void setAreaStatus(boolean status) {
        if (this.status != status) {
            this.status = status;
            notifyDevices();
        }
    }

    public void setPosition(int position) {
        if (this.position != position) {
            this.position = position;
            notifyDevices();
        }
    }

    public void setMessage(String message) {
        if (this.message != message) {
            this.message = message; 
            notifyDevices();
        }
    }

    public void notifyDevices() {
        for (Observer ob : observerList) {
            ob.areaStatus(status);
            ob.updatePosition(position);
            ob.updateSendMessage(message);
        }
    }

}
