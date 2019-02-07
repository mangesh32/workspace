import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class MAIN {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
		String line;
		List<String> lines=new ArrayList<String>();
		while((line=br.readLine()) != null)
			lines.add(line);
		
		List<Employee> list=new ArrayList<Employee>();
		
		for(String data:lines){
			String[] info=new String[3];
			String temp="";
			int identifier=0;
			boolean inside=false;
			Stack<Character> stack=new Stack<Character>();
			char[] charArr=data.toCharArray();
			for(int i=0;i<charArr.length;i++){
				char c=charArr[i];
				
				if(c=='"'){
					System.out.println("inside at "+i);
					stack.push(c);
					if(inside==false)inside=true;
				}
				if(c=='"' && stack.size()%2==0 && (i==charArr.length-1)){
					stack.pop();
					inside=false;
					info[identifier]=temp;
					temp="";
					identifier++;
					continue;
				}
				if(inside){temp+=c;continue;}
				if(inside==false){
					if(c!=',')
						temp+=c;
					else{
						System.out.println(Arrays.asList(info));
						System.out.println(c+" at "+i);
						info[identifier++]=temp;
						temp="";
					}
				}
			}
			Employee  e=new Employee(Integer.parseInt(info[0]), info[1], info[2]);
			list.add(e);			
		}
		
		System.out.println(list);

	}

}
