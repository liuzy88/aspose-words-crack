import javassist.ClassPool;
import javassist.CtClass;

public class AsposeWords_20_12 {
    public static void main(String[] args) throws Exception {
        ClassPool.getDefault().insertClassPath("aspose-words-20.12-jdk17.jar");
        CtClass clazz = ClassPool.getDefault().getCtClass("com.aspose.words.zzZDZ");
        clazz.getDeclaredMethod("zzZ4n").setBody("{return 1;}");
        clazz.getDeclaredMethod("zzZ4m").setBody("{return 1;}");
        clazz.writeFile();
    }
}
