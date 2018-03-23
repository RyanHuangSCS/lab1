package lab1;

public class triangleCalculator {

	public static boolean isLegal(double a,double b,double c) {
		if(a<=0||b<=0||c<=0) {
			return false;
		}
		else
		{
			if(a+b<=c||a+c<=b||b+c<=a) {
				return false;
			}
				
		}
		return true;
	}

	public static boolean isEquilateral(double a,double b,double c){
		if(a==b&&a==c&&isLegal(a,b,c))
		{
			return true;
		}
		return false;
	}
	public static boolean isIsosceles(double a,double b,double c) {
		if((b==c||a==b||a==c)&&isLegal(a,b,c))
		{
			return true;
		}
		return false;
	}
	public static boolean isScalene(double a,double b,double c) {
		if(isLegal(a,b,c)) {
		return !isEquilateral(a,b,c);
		}
		return false;
	}
	
	
	
	

	
}
