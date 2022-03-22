import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /*Properties properties = new Properties();
        properties.load(Main.class.getClassLoader().getResourceAsStream("a.properties"));
        Class<?> aClass = Class.forName(properties.getProperty("classPath"));
        Object o = aClass.newInstance();
        Method method = aClass.getDeclaredMethod(properties.getProperty("methodName"));
        method.invoke(o);*/
        Class<Config> configClass = Config.class;
        MyAnnotation annotation = configClass.getDeclaredAnnotation(MyAnnotation.class);
        Class<?> aClass = Class.forName(annotation.classPath());
        Object o = aClass.newInstance();
        Method method = aClass.getDeclaredMethod(annotation.methodName());
        method.invoke(o);
    }
}
