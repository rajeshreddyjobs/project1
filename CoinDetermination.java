
public class CoinDetermination {
	static int coinA(int coins[],int m, int v) {
		if(v==0) return 0;
			
		int res=Integer.MAX_VALUE;
		for(int i=0;i<m;i++) {
			if(coins[i]<=v) {
				int sub=coinA(coins,m,v-coins[i]);
				if(sub!=Integer.MAX_VALUE && sub+1<res)
					res=sub+1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int coins[]= {20,10,5,2,1};
int m=coins.length;
int v=2000;

System.out.println("Number of coins :  "+coinA(coins, m, v));
	}

}
