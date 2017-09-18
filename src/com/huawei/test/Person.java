package com.huawei.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by yangzhiyue on 17-9-18.
 */
public class Person implements Comparable{
    private String name;
    private Integer age;
    public Person(String name, Integer age){
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Person other = (Person)obj;
        if (this.age == null){
            if (other.age != null){
                return false;
            }
        }else if (!age.equals(other.age)){
            return false;
        }
        if (this.name == null){
            if (other.name != null){
                return false;
            }
        }else if (!name.equals(other.name)){
            return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode() + this.age.hashCode();
    }


    public static void main(String args[]){
        Person p1 = new Person("yangzhiyue",21);
        Person p2 = new Person("yangzhiyue",21);
        Map<Person, String> map = new HashMap<Person, String>();
        map.put(p1, "student");
        System.out.println(p1.hashCode() == p2.hashCode());
        map.put(p2,"fuck");
        System.out.println(map.get(p2));
        System.out.println(map.size());
    }
}
