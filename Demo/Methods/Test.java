package Methods;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int x = 10;

        Random r = new Random(x);
        r.setSeed(x);
        int d = r.nextInt(x);

        System.out.println(d);
    }
}

class TestClass
{
    public static void main(String args[])
    {
        int i;
        int j;
        for (i = 0, j = 0 ; j < 1 ; ++j , i++)
        {
            System.out.println( i + " " + j );
        }
        System.out.println( i + " " + j );
    }
}

class TestClass2
{
    public static void main(String args[])
    {
        int i = 0;
        for (i=1 ;  i<5  ; i++) continue; //1
        for (i=0 ;       ; i++) break; //2
        for (    ; i<5?false:true ;    ); //3

        System.out.println(i);

    }
}

class TestClass3 {
    public static long main(String[] args) {
        System.out.println("Hello");
        return 10L;
    }
}
class TestClass4 {
    public static void main(String[] args) {
        outer:
        for ( int i = 0 ; i<3 ; i++ )
        {
            for ( int j = 0 ; j<2 ; j++ )
            {
                if ( i == j )
                {
                    continue outer;
                }
                System.out.println( "i=" + i + " , j=" + j );
            }
        }
    }
}


class TestClass5 {

    public static int switchTest(int k)
    {
        int j = 1;
        switch(k)
        {
            case 1: j++;
            case 2: j++;
            case 3: j++;
            case 4: j++;
            case 5: j++;
            default : j++;
        }
        return j + k;
    }
    public static void main(String[] args)
    {
        System.out.println( switchTest(4) );
    }
}

class TestClass6 {
    int[] ia = new int[1];
    Object oA[]  = new Object[1];
    boolean bool;
    public static void main(String args[]) {
        TestClass6 test = new TestClass6();
        System.out.println(test.ia[0] + "  " + test.oA[0]+"  "+test.bool);
    }
}

class ExceptionTest {
    public static void main(String[] args, Object e) throws Exception {
        final var e1 = e;

        try {
            m2();
        } catch(Exception e2) {
        } finally {
            m3();
        }
    }

    public static void m2() throws Exception {
        throw new Exception("from m2");
    }

    public static void m3() throws Exception {
        throw new Exception("from m3");
    }

}

class Account {
    double balance;
    public void update(int[] balances2){
        balances2[0] = 100;
        balances2[1] = 200;
    }

    public static void main(String[] args) {
        int[] balances1 = new int[2];
        balances1[0] = 10;
        balances1[1] = 20;
        for(int bal :  balances1){
            System.out.print(bal+" ");
        }
        Account a = new Account();
        a.update(balances1);
        for(int bal :  balances1){
            System.out.print(bal+" ");
        }
    }
}

class PromotionTest
{
    public static void main(String args[])
    {
        int i = 5;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';
        if (i == f) c++;
        if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
        System.out.println(c);
    }
}