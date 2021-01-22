/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Mritunjoy
 */
public class guests_producers {
    String id,first_name,last_name,type,designation,organization,email,phone_number,age,location_id;

    public guests_producers(String id,String first_name,String last_name,String type,String designation,String organization,String email,String phone_number,String age,String location_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.type=type;
        this.designation=designation;
        this.organization=organization;
        this.email = email;
        this.phone_number = phone_number;
        this.age = age;
        this.location_id = location_id;
    }

    public String getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getType() {
        return type;
    }

    public String getDesignation() {
        return designation;
    }

    public String getOrganization() {
        return organization;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAge() {
        return age;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    @Override
    public String toString() {
        return "guests_producers{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", type=" + type + ", designation=" + designation + ", organization=" + organization + ", email=" + email + ", phone_number=" + phone_number + ", age=" + age + ", location_id=" + location_id + '}';
    }
    
}
