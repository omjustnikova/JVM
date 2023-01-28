import java.util.ArrayList;

public class ClassLoaders1 {
    public static void main(String[] args) {
        System.out.println("Classloader of ArrayList: "
                + ArrayList.class.getClassLoader());
        System.out.println("Classloader of Connection: "
                + java.sql.Connection.class.getClassLoader());
        System.out.println("Classloader of HelloWorld: "
                + HelloWorld.class.getClassLoader());
    }
}