package lesson15;

public class People {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UncurrentAgeExeption {
        if(age < 0 || age > 150){
            throw new UncurrentAgeExeption("Возраст не может быть меньше нуля или больше 150!");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
