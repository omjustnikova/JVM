public class ClassLoaders2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myClassLoader = new MyClassLoader(ClassLoaders2.class.getClassLoader());
        Class<?> clazz = myClassLoader.loadClass("HelloWorld");
        HelloWorld fake = (HelloWorld) clazz.newInstance();
        System.out.println("You shouldn't see this");
    }
}
