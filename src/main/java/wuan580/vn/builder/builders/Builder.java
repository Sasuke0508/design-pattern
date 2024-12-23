package wuan580.vn.builder.builders;

import wuan580.vn.builder.cars.CarType;
import wuan580.vn.builder.components.Engine;
import wuan580.vn.builder.components.GPSNavigator;
import wuan580.vn.builder.components.Transmission;
import wuan580.vn.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
