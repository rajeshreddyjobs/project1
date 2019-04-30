package Math;

import java.math.BigInteger;

public class Lab534 {

	public static void main(String[] args) {
		BigInteger bin1=new BigInteger("4");
		System.out.println(bin1.bitCount());
		
		System.out.println(bin1.bitLength());
System.out.println("=========================================================");
		BigInteger in1=new BigInteger("794343394759575932454395");
		System.out.println(in1);
		BigInteger in2=new BigInteger("100");
		System.out.println(in2);
		BigInteger res1=in1.add(in2);
		
		System.out.println(res1);
	}

}
