package Day6.Exercise;

public class arrayadd {
    public static void main(String args[])
    {
        int a[]={1,3,2,4,5};
        int target=3;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]+a[j]==target) {
                    System.out.println("[ " + i + " " + j + " ]");
                }

            }

        }
    }
}
