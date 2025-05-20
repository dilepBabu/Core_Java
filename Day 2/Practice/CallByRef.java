class cla {
    private int speed = 0;
    private int regulator = 0;

    public void set(int spe, int reg) {
        this.speed = spe;
        this.regulator = reg;

    }

    public int getspeed() {
        return speed;

    }

    public int getregulator() {
        return regulator;
    }
}

public class CallByRef {
    public static void main(String[] args) {
        cla obj1 = new cla();
        obj1.set(35, 3);
        System.out.println(obj1.getspeed());
        System.out.println(obj1.getregulator());
        CallByRef obj2 = new CallByRef();
        obj2.amethod(obj1);
        System.out.println(obj1.getspeed());

    }

    public void amethod(cla obj3) {
        obj3.set(40, 4);
    }

}
