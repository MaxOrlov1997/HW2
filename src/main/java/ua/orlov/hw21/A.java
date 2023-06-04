package ua.orlov.hw21;

import lombok.Data;

/*Создать экземпляр класса с приватным конструктором и изменить значение
переменных:
public class A {
private String id = "123";
private String name = "A";
private A() {
}
@Override
public String toString() {
return "A{" +
"id='" + id + '\'' +
", name='" + name + '\'' +
'}';
}
}*/
public class A {
    private String id = "123";
    private String name = "A";

    private A() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    }

