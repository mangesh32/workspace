package nugget_2;

public class Primes {
	
	public static boolean isPrime(int n){
		for(int i=2;i<=(int)Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	
	public static int[] findPrime(int p,int q){
		int count=0;
		String temp="";
		for(int i=p; i< q;i++){
			if(isPrime(i)){
				count++;
				temp+=i+",";				
			}
		}
		int[] ans=new int[count];
		int i=0;
		for(String s:temp.split(",")){
			ans[i]=Integer.parseInt(s);
			i++;			
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		for(int i:findPrime(1, 10))
			System.out.println(i);

	}

}
