import java.io.IOException;
import java.io.InputStream;

class MyClassLoader extends ClassLoader {
    public MyClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (!name.equals("HelloWorld")) {
            return super.loadClass(name);
        }
        try {
            InputStream in = getSystemResourceAsStream("HelloWorld.class");
            byte[] a = new byte[10000];
            int len  = in.read(a);
            in.close();
            return defineClass(name, a, 0, len);
        } catch (IOException e) {
            throw new ClassNotFoundException();
        }
    }
}
