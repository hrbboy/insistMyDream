package lottery;

/**
 * @author hrbboy
 *
 */
public class IndexMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("call main method...");

		ReadomMethod rm=new ReadomMethod();
		
		Paramter pa=new Paramter();
		pa.setCount(650);
		pa.setSum_min(5);
		pa.setSum_max(23);
		rm.createNumber(pa);
	}
	
}
