
import java.util.Objects;

// RUN TIME POLY 
public class Car {
    String brand;
    String name;
    double price;
    String color;

    public Car(String b,String n,double p,String c) {
    	this.brand=b;
    	this.name=n;
    	this.price=p;
    	this.color=c;
    }
    @Override
    public String toString() {
    	return"["+brand + ","+name +","+price +","+color +"]";
}

    @Override
    public boolean equals(Object o) {
    	Car c=(Car) o;
    	if (this.brand==c.brand && this.name==c.name && this.price==c.price && this.color==c.color) {
    		return true;
    	}else{
    		return false;
    	}
    }
    
   @Override
    public int hashCode() {
    	return Objects.hash(brand,name,color,price);
    }
    }