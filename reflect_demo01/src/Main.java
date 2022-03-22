import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getDeclaredFields();
        for(Field field:fields)
            System.out.println(field.getName());
        Method[] methods = personClass.getDeclaredMethods();
        for(Method method:methods)
            System.out.println(method.getName());
        Constructor<?>[] constructors = personClass.getDeclaredConstructors();
        for(Constructor<?> constructor:constructors)
            System.out.println(constructor.getName());
        Method eat = personClass.getDeclaredMethod("eat");
        Constructor<Person> constructor = personClass.getDeclaredConstructor();
        Person person = constructor.newInstance();
        eat.invoke(person);
    }
}
