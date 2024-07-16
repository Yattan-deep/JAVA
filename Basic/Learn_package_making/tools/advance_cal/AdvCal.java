package Learn_package_making.tools.advance_cal;
import Learn_package_making.tools.Cal;
public class AdvCal  extends Cal {
    public int mul ( int a , int b )
    {
        return a*b;
    }

    public int div ( int a , int b )
    {
        return a/b;
    }

    public int pow ( int a , int b )
    {
        return (int)Math.pow(a, b);
    }
}
