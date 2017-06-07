package collectionInterview.HashMap;

public class Ball {
	String name;
	int radius;
	int weight;
	public Ball(String name, int radius, int weight) {
		super();
		this.name = name;
		this.radius = radius;
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		if(radius>10)
			return 10;
		else
			return 5;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (radius != other.radius)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ball [name=" + name + ", radius=" + radius + ", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
