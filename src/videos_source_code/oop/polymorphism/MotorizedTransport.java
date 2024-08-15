package videos_source_code.oop.polymorphism;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public interface MotorizedTransport {

    boolean start();

    void stop();

    void accelerate(double mph);

    void decelerate(double mph);

}
