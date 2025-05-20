package Interface;

interface Fourwheeler extends Vehicle{
    
    void noOfSeats(int seats);
}
interface TwoWheeler extends Vehicle
{
    void noOfSeats(int seats);
}

class Mode implements Fourwheeler,TwoWheeler
{

    @Override
    public void Start() {
        System.out.println("the vehicle is started");
    }

    @Override
    public void noOfSeats(int seats) {
        
       System.out.println((seats>3)?"It is Fourwheeler put seat bealt":"It is TwoWheeler put helmet");
    }
   
}
