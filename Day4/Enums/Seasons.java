package Enums;

public enum Seasons {
    WINTER(10),
    SPRING(20),
    SUMMER(35),
    FALL(18);
    int temp;
    Seasons(int Temp)
    {
        this.temp=Temp;
    }
    public int getAverageTemperature() 
    {
        return temp;
    }
    public static void main(String[] args) {
        
       for (Seasons s1 : Seasons.values()) {
        System.out.println(s1+" temperature "+s1.getAverageTemperature());
        
       }
    }

    
}
