package ua.orlov.hw21;
/*2.1 Создать аннотацию @Value(“some value”), которую можно применить только для полей
        класса. Поля с такой аннотацией должны быть проинициализированы значением.
        2.2 Создать аннотацию @Service.
a. Ее можно использовать только над классами.
b. Если класс имеет аннотацию @Service, то все классы наследники тоже должны быть
неявно помечены этой аннотацией
2.3 Создать аннотацию @Init.
a. Ее можно использовать только над методами.
2.4 Создать класс который будет сканировать все классы и создавать экземпляры тех
классов которые помечены аннотацией @Service. Все эти объекты положить в мапу, где
ключом будет имя класса, а значение объект этого класса.
a. Найти метод помеченный аннотацией @Init и вызвать его один раз для каждого
объекта
b. Поля с аннотацией @Value проинициализировать значением*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})

public @interface Value{
int value();
}
