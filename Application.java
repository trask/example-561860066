public class Application {
    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("java.version: " + System.getProperty("java.version"));
        System.out.println("java.vendor.version: " + System.getProperty("java.vendor.version"));
        System.out.println("java.vm.name: " + System.getProperty("java.vm.name"));
        System.out.println("java.runtime.name: " + System.getProperty("java.runtime.name"));
        System.out.println("java.class.path: " + System.getProperty("java.class.path"));
        System.out.println("CLASSPATH: " + System.getenv("CLASSPATH"));
        System.out.println("_JAVA_OPTIONS: " + System.getenv("_JAVA_OPTIONS"));
        System.out.println("JAVA_TOOL_OPTIONS: " + System.getenv("JAVA_TOOL_OPTIONS"));
        System.out.println("===============================");
    }
}
