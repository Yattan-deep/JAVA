
public class main_code {
    /**
     * learn how to call function from different files ? 
     * Multilevel inhertance VeryAdvac <- AdvaCal <- Calc ...
     */
    public static void main(String[] args) {
        VeryAdvCal calc = new VeryAdvCal();
        System.out.println( calc.add(10,20) + " " + calc.sub(10,20) + 
                      " " + calc.mul(10,20) + " " + calc.div(10,20) + " " + calc.pow(10, 4) );

    }
}
