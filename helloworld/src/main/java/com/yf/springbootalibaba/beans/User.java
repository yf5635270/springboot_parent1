package com.yf.springbootalibaba.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "user")
@Validated
public class User {

    // @Value("${user.username}")
    private String username;
    // @Value("${user.age}")
    private Integer age;
    private Date birthday;
    private List<String> hobbies;
    private Map<Integer,String > girlfriend;
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getGirlfriend() {
        return girlfriend;
    }

    public void setGirlfriend(Map<Integer, String> girlfriend) {
        this.girlfriend = girlfriend;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", age=" + age + ", birthday=" + birthday + ", hobbies=" + hobbies + ", girlfriend=" + girlfriend + ", address=" + address + '}';
    }
}
