package il.ac.tau.cs.sw1.ex9.riddles.second;

public class B2 extends A2{
	protected A2 getA(boolean bool) {
		if(bool) {
			return new B2();
		}
		else {
			return new A2();	
		}
		
	}
	@Override
	public String foo(String s) {
		return s.toUpperCase();
	}
}
