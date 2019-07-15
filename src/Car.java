

public class Car {
    boolean engine;
    String name;
    int cylinders;
    int wheels;

    public Car()
    {

    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine=true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public void startEngine()
    {
        System.out.println("Start Engine");
    }
    public void accelerate()
    {
        System.out.println("accelerate");
    }
    public void brake()
    {
        System.out.println("brake");
    }
}


class Creta extends Car
{
    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}



class Swift extends Car
{
    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }
}

class Duster extends Car
{
    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}
