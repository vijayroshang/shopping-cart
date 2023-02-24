package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
int id;
String name;
@Column(unique=true)
Long mobile;
@Column(unique=true)
String email;
String password;
String role;
}
