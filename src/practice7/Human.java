package practice7;


public class Human {

    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println(greetAsString());
    }

    public String greetAsString() {

        String greeting;
        if (age>3){
            greeting=String.format("Hello I am %s and %d years old.", name,age);
        }else{
            greeting="Boo Boo";
        }

        return greeting;
    }

    @Override
    public String toString(){
        return name + "" + age;
    }
}