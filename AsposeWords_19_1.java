import javassist.ClassPool;
import javassist.CtClass;

public class AsposeWords_19_1 {
    public static void main(String[] args) throws Exception {
        ClassPool.getDefault().insertClassPath("aspose-words-19.1-jdk16.jar");
        CtClass clazz = ClassPool.getDefault().getCtClass("com.aspose.words.zzZLJ");
        clazz.getDeclaredMethod("zzZI1").setBody("{return 1;}");
        clazz.getDeclaredMethod("zzZI0").setBody("{return 1;}");
        clazz.writeFile();
    }
}
