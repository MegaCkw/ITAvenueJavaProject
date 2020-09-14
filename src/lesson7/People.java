package lesson7;

public class People {
    // 1 переменные (поля класса. зДЕСЬ ОБЪЯВЛЯЕМ ТОЛЬКО ТЕ ПЕРЕМЕННЫЕ, КОТОРЫЕ ОПИСЫВАЮТ СОСТОЯНИЕ ОБЪЕКТА
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String adress;
    private boolean haveAuto;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }









// 2 методы (Создаем имепнно те методы, которыми будет владеть каждый человек)


    //принципы ооп
    // Инкапсуляция - скрытие данных от других классов или папок. Реализовано с помощью
    // 3  - Конструкторы. Особый метод, который вызывается в момент рождения объекта после слова new.
public People (){

}

    public People (int age, String name, String adress, String phone, boolean haveAuto, String gender){
        this.age = age;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.haveAuto = haveAuto;
        this.gender = gender;
    }


    public  People (String gender){
        this.gender = gender;

    }


}