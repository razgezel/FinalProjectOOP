package il.ac.tau.cs.sw1.ex9.riddles.forth;

import java.util.Iterator;

public class B4  implements Iterator<String>  {
	private String[] strings;
	private int k;
	private static int n =0;
	private static int  i = 0;
	public B4(String[] strings, int k) {
		this.strings = strings;
		this.k = k;
	}

	@Override
	public boolean hasNext() {
		if (i < strings.length+strings.length*k) {
			if( n == strings.length) {
				n = 0;
			}
			return true;
		}
		return false;
	}

	@Override
	public String next() {
		i++;
		return strings[n++];
	}
	
}
