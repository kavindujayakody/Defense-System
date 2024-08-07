package defenseSystem;

import newpackage.Helicopter;
import newpackage.MainController;
import newpackage.Submarine;
import newpackage.Tank;

/**
 *
 * @author user
 */
public class System {

    public static void main(String[] args) {

        Observable observable = new Observable();
        
        Helicopter helicopter = new Helicopter();
        helicopter.setVisible(true);
        Tank tank = new Tank();
        tank.setVisible(true);
        Submarine submarine = new Submarine();
        submarine.setVisible(true);
        
        observable.add(helicopter);
        observable.add(tank);
        observable.add(submarine);

        new MainController(observable).setVisible(true);
    }

}
