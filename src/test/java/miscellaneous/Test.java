package miscellaneous;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlEnumValue;

public class Test {

	String[] t = null;

	private Map<String, Integer> genericTestMap = new HashMap<String, Integer>();

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {

		Field field = SetterGetterMethodTest.class.getDeclaredField("parent");
		try {
			Method method = MyEnum.class.getDeclaredMethod("valueOf", String.class);
			System.out.println(MyEnum.valueOf("4")); 
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		MyEnum myEnum = null; myEnum.valueOf(arg0)
		
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

enum MyEnum {
    MALE(1),
    FEMALE(2),
    UNKNOWN(3),
    OTHER(4);
    private final Integer value;

    MyEnum(Integer v) {
        value = v;
    }
    
//    public String valueOf(String name) {
//    	return MyEnum.
//    }
}