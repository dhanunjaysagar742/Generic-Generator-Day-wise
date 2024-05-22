package in.dj.entities;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_prod")
public class Product {

	@Id
    @jakarta.persistence.GeneratedValue(generator = "f")
    @GenericGenerator(name = "f", strategy = "in.ashokit.generators.ProductGenerator")
	private String pid;
	private String name;
	private Double price;

	
	
	public Product(String pid, String name, Double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	public Product() { }
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

}
