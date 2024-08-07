package defenseSystem;

/**
 *
 * @author user
 */
public interface Observer {

    public void areaStatus(boolean status);

    public void updatePosition(int positionLevel);

    public void updateSendMessage(String message);
}
