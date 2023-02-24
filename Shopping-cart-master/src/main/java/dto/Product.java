package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String name;
double price;
String category;
}
