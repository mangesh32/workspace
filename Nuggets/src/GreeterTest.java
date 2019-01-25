import com.persistent.app.Advisor;
import com.persistent.app.Greeter;

public class GreeterTest {

	public static void main(String[] args) {
		Greeter m=new Greeter(args[0]);
		Greeter n=new Greeter(args[1]);
		
		System.out.println(m.sayHello());
		System.out.println(n.sayHello());		
		Advisor advisor=new Advisor();
		System.out.println("Advice: "+advisor.getAdvice());
		System.out.println(m.sayGoodBye());
		System.out.println(n.sayGoodBye());	
		

	}

}
