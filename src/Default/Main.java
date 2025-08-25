package Default;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import net.faikaktas.Emplooye;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws NoSuchMethodException, IllegalArgumentException, IllegalAccessException {
		//REFLECTİON (YANSIMA)
		Emplooye emplooye = new Emplooye(1L, "faik","aktaş", 5000D);
		try {
	
			Class<?> clazz = emplooye.getClass();
			Field[] declaredFields =  emplooye.getClass().getDeclaredFields()
			
			for (Field deField : declaredFields) {
				deField.setAccessible(true);
				String fieldValue = deField.get(emplooye) +"";
				System.out.println(deField.getName() +" - "+fieldValue);
			}		
//			Class<?> clazz = Class.forName("net.faikaktas.Emplooye");
//			Field[] declaredFields = clazz.getDeclaredFields();
			
//			for (Field field : declaredFields) {
//				System.out.println(field.getName());
//				System.out.println(field.getModifiers());
//			}
//			System.out.println("---------------------");
//			Field[] fields = clazz.getFields();
//			for (Field field : fields) { 	//erişim belirleyicisi public olanları getirir
//				System.out.println(field.getName() );
//			}
			
//			Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
//
//			for (Constructor<?> constructor : declaredConstructors) {
//			    System.out.println(constructor.getParameterCount());
//			}

//			Method[] declaredMethods =   clazz.getDeclaredMethods();
//			for (Method method : declaredMethods) {
				//System.out.println(method.getName());
				
//				Class<?>[] parameterTypes = method.getParameterTypes();
//				for (Class<?> parameter: parameterTypes) {
//					System.out.println(parameter.getTypeName());
//				}
//				Parameter[] parameters = method.getParameters();
//				for (Parameter parameter : parameters) {
//					System.out.println(method.getName() + " " + parameter);
//				}
				//SINIFIN İÇİNDEKİ DEĞERLERE ERİŞMEK
//				Field[] declaredFields = clazz.getDeclaredFields();
//				for (Field field :declaredFields) {
//					field.setAccessible(true);
//					String fieldValue = field.get(clazz)+"";
//					System.out.println(field.getName() + " - "+fieldValue);
//				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class bulunamadi" + e.getMessage());
		}
	}
}	
