package entites;

public class Corredor {
	
	private String name;
	private Integer time;
	
	public Corredor(String name, Integer time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}
	
	public String toString() {
		return name + ", tempo: " + time;
	}

}
