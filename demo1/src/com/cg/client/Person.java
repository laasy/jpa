package com.cg.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Person")
@NamedQueries({@NamedQuery(name="getById",
query="select laasya from Person laasya where laasya.id=101 "),
@NamedQuery(name="getAll",query="select laasya from Person laasya")	
})
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

	private int id;
@Column(name="person_name")
private String name;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
}


}
