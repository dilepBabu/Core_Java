package Enums;

import java.util.Scanner;

public enum Day {
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);
    final int Dayno;
    Day(int dayno)
    {
        this.Dayno=dayno;
    }
    public int getvalue()
    {
        return Dayno;
    }
    public static Day value(int dayno)
    {
        for(Day day:Day.values())
        {
            if(day.getvalue()==dayno)
            {
                return day;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        Day noday=Day.value(input);
        if(noday!=null)
        {
            System.out.println(noday);
        }
        else
        {
            System.out.println("invalid day number");
        }
    }
}
