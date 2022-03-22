public class Person {
    private int id;
    private String name;
    private int age;
    public void eat(){
        System.out.println("eat");
    }
    public void eat(int a){
        System.out.println("eat");
    }
    public void run(){
        System.out.println("run");
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }
}
