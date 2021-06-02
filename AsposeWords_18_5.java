import javassist.ClassPool;
import javassist.CtClass;

public class AsposeWords_18_5 {
    public static void main(String[] args) throws Exception {
        ClassPool.getDefault().insertClassPath("aspose-words-18.5-jdk16.jar");
        CtClass clazz = ClassPool.getDefault().getCtClass("com.aspose.words.zzZM4");
        clazz.getDeclaredMethod("zzZKn").setBody("{return 1;}");
        clazz.getDeclaredMethod("zzZKm").setBody("{return 1;}");
        clazz.writeFile();
    }
}
