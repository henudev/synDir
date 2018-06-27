package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static Car initBydefualtConst() throws Throwable {
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?> clazz = loader.loadClass("reflection.Car");
		
		Constructor<?> cons = clazz.getDeclaredConstructor((Class[])null);
		Car car = (Car) cons.newInstance();
		
		Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "red::");
		Method setColor = clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "blue::");
		Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 200);
		
		return car;
		}
	
	public static void main(String[] args) throws Throwable{
		Car car = initBydefualtConst();
		car.introduce();
	}

}
