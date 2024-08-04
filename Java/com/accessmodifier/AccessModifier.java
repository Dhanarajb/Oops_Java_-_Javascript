package Java.com.accessmodifier;

/**
 * AccessModifier
 */
public class AccessModifier {

    public String name;
    private int age;
    protected char level;

    public AccessModifier(String name, int age, char level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier("John", 30, 'A');
        System.out.println("Name: " + accessModifier.name);
        System.out.println("Age: " + accessModifier.getAge());
        System.out.println("Level: " + accessModifier.level);
        accessModifier.setAge(27);
        System.out.println("Age: " + accessModifier.getAge());

    }
}