public class Persist {
    public static int persistence (long n)
    {
        if (n<10)
          return 0;
        else
            {
               int i=0;
                while (n>=10)
                {
                    i++;
                    int multiplicacion=1;
                    int nrodigitos= String.valueOf(n).length();
                    for (int j=nrodigitos;j>1;j--)
                    {
                        multiplicacion*=(n/((int)Math.pow(10, j-1)));
                    }
                    n=multiplicacion*(n%10);
                }
            return i;
            }
    }
}
