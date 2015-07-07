import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Test {
	private String dd;
	@org.junit.Test
	public void getNav(){
		List<Test> list = new ArrayList<Test>();
		Test t = new Test();
		t.setDd("aaa");
		list.add(t);
		t = new Test();
		t.setDd("asdfase");
		list.add(t);
		t = new Test();
		t.setDd("a344taa");
		list.add(t);
		t = new Test();
		t.setDd("3raf");
		list.add(t);
		
		for (Test test : list) {
			System.out.println(test.getDd());
		}
		
		Collections.sort(list, new Comparator<Test>() {
			public int compare(Test o1, Test o2) {
				return o1.getDd().compareTo(o2.getDd());
			}
		});
		System.out.println("===================");
		for (Test test : list) {
			System.out.println(test.getDd());
		}
	}
	
	public String getDd() {
		return dd;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}
		
}