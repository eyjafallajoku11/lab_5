package Gorod;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Human implements Comparable<Human> {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private ZonedDateTime birthday;

    public Human(String Name){
        this.name=Name;
    }

    public void setBirthday(ZonedDateTime birthday) {
        this.birthday = birthday;
    }

    public ZonedDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String toString(){
        if (Objects.isNull(birthday)) return name;
        else return name+"\n"+
                "   birthday: "+birthday.toString();
    }

    @Override
    public int compareTo(Human other) {
        return this.getBirthday().compareTo(other.getBirthday())+this.name.compareTo(other.name)/10;
    }
}
