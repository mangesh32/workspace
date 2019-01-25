package assign_2;

public class Assign_2_4 {
	public static String[] reverse(String para){
		String[] arr=para.split(" ");
		for(int i=0;i<arr.length;i++){
			String temp="";
			for(int j=arr[i].length()-1;j>=0;j--)temp+=arr[i].charAt(j);
			arr[i]=temp;
		}
		return arr;
	}

}
