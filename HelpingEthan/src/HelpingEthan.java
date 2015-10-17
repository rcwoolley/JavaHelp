import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class HelpingEthan {
    public static void main(String[] args) {
        System.out.println("Hello, World");
               
        Class[] theArray = new Class[10];
        theArray[1] = Scalar.class;

        try {
            Class cls[] = new Class[] { String.class };
            Constructor myConstructor = theArray[1].getConstructor(cls);
            
            Object myScalar = myConstructor.newInstance(new Object[] { "myScalar" });
            Method myMethod = theArray[1].getMethod("getAlgName");
            Object myAlgName = myMethod.invoke(myScalar, null);
            System.out.println("Result of getAlgName: "+myAlgName);
        } catch (NoSuchMethodException e) {
        	System.out.println("No such method exists");
        } catch (InstantiationException e) {
        	System.out.println("Can not instantiate");
        } catch (InvocationTargetException e) {
        	System.out.println("Invocation target exception");
        } catch (IllegalAccessException e) {
        	System.out.println("Illegal access");
        }
    }
}
