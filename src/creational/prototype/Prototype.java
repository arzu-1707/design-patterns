package creational.prototype;

public class Prototype {

    public static void main(String[] args) {
        Person person1 = new Person("Aysel", 30);
        Person person2 = person1.clone();
        System.out.println(person1.hashCode());
        System.out.print(person2.hashCode());
    }

}

interface Clonable{
    Person clone();
}

class Person implements Clonable{
   private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Person clone() {
        //Shallow copy
        return new Person(getName(), getAge());

        //deep copy-de ise eger daxilinde address classi da olsa idi
        //clone metodunda onu da clonlamaq lazim idi..
    }
}
