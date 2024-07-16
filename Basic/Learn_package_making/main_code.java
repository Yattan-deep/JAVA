package Learn_package_making;
// this is to create package 

import Learn_package_making.show_welcome.welcome; // this is to import class 
import Learn_package_making.tools.advance_cal.AdvCal;

// import ____. * this will import all java classes but can't import classes which are inside inner folder ... 

public class main_code 
{
    public static void main(String[] args) {
        welcome w = new welcome();
        w.show();
        AdvCal c = new AdvCal();
        System.out.println(c.add(1,1) + " " + c.mul(1,2)+ " " + c.pow(3, 4) );
    }
}
