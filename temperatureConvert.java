public class tempertureConvert{
    public static double CtoF(double c){
	return (9.0/5.0) * c + 32;
    }
    public static double FtoC(double f){
	return (f - 32) * (5.0/9.0);
    }
}