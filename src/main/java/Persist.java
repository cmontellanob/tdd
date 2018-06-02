public class Persist {
    public static int persistence (long n)
    {
        if (n<10)
          return 0;
        else
            {
                int i=0;
                while (n>1000) {
                    i++;
                    long n1000 = n / 1000;
                    long n100 = n / 100;
                    long n10 = n / 10;
                    long m10 = n % 10;
                    n=n*1000*n100*n10*m10;
                }
                while (n>100) {
                    i++;
                    long n100 = n / 100;
                    long n10 = n / 10;
                    long m10 = n % 10;
                    n=n100*n10*m10;
                }

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
