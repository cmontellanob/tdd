public class Persist {
    public static int persistence (long n)
    {
        if (n<10)
          return 0;
        else {
            int i=0;
            while (n>10) {
                i++;
                long n10 = n / 10;
                long m10 = n % 10;
                n=n10*m10;
            }
            return i;
        }
    }
}
