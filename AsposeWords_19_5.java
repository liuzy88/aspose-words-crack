import javassist.ClassPool;
import javassist.CtClass;

public class AsposeWords_19_5 {
    public static void main(String[] args) throws Exception {
        ClassPool.getDefault().insertClassPath("aspose-words-19.5-jdk17.jar");
        CtClass clazz = ClassPool.getDefault().getCtClass("com.aspose.words.zzZL8");
        clazz.getDeclaredMethod("zzZnM").setBody("{return 1;}");
        clazz.getDeclaredMethod("zzZnL").setBody("{return 1;}");
        clazz.writeFile();
    }
}
