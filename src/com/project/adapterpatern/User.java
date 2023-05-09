package com.project.adapterpatern;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;

public class User {

    private String Pid;
    private String name;
    private int age;


    public User(String pid, String name, int age) {

/*
        if(pid == null || pid.isBlank()){
            throw new IllegalArgumentException("PID shouldn't be null or empty");
        }

        if(name == null || pid.isBlank()){
            throw new IllegalArgumentException("Name shouldn't be null or empty");
        }

        if(age <= 0){
            throw new IllegalArgumentException("Age Shouldn't be less or equal 0");
        }
*/
// From Guava library

        setPid(pid);
        setName(name);
        setAge(age);


/*      this.Pid = pid;
        this.name = name;
        this.age = age;*/
    }


    public String getPid() {
        return Pid;
    }

    public void setPid(String pid) {
        checkArgument(pid != null && !pid.isBlank(), "Tested");
        Pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkArgument(name != null && !name.isBlank(), "Tested 2");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkArgument(age > 0, "Tested 2");
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(Pid, user.Pid) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Pid, name, age);
    }


    @Override
    public String toString() {
        return "User{" +
                "Pid='" + Pid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
