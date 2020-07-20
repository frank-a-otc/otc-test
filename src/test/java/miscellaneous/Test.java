package miscellaneous;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Test {

	String[] t = null;

	private Map<String, Integer> genericTestMap = new HashMap<String, Integer>();

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {

		Field field = SetterGetterMethodTest.class.getDeclaredField("parent");
		try {
			Method method = SetterGetterMethodTest.class.getDeclaredMethod("setParent", Child.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class Parent {
	private String parent;
	
	public String getParent() {
		return parent;
	}
}

class Child  extends Parent {
	private String child;
	
	public Child() {
		
	}
	public String getChild() {
		return child;
	}
}

class SetterGetterMethodTest {
	Parent parent;

	public Parent getParent() {
		return parent;
	}

	public void setParent(Child child) {
		this.parent = child;
	}

}