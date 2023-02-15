package model;

public class NewRegDto {

	String c_code;
	String c_class;
	String c_name;
	String c_age;
	String c_kilo;
	String c_price;
	
	public NewRegDto() {
		// TODO Auto-generated constructor stub
	}

	public NewRegDto(String c_code, String c_class, String c_name, String c_age, String c_kilo, String c_price) {
		super();
		this.c_code = c_code;
		this.c_class = c_class;
		this.c_name = c_name;
		this.c_age = c_age;
		this.c_kilo = c_kilo;
		this.c_price = c_price;
	}

	public String getC_code() {
		return c_code;
	}

	public void setC_code(String c_code) {
		this.c_code = c_code;
	}

	public String getC_class() {
		return c_class;
	}

	public void setC_class(String c_class) {
		this.c_class = c_class;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_age() {
		return c_age;
	}

	public void setC_age(String c_age) {
		this.c_age = c_age;
	}

	public String getC_kilo() {
		return c_kilo;
	}

	public void setC_kilo(String c_kilo) {
		this.c_kilo = c_kilo;
	}

	public String getC_price() {
		return c_price;
	}

	public void setC_price(String c_price) {
		this.c_price = c_price;
	}

	@Override
	public String toString() {
		return "RegDto [c_code=" + c_code + ", c_class=" + c_class + ", c_name=" + c_name + ", c_age=" + c_age
				+ ", c_kilo=" + c_kilo + ", c_price=" + c_price + "]";
	}
	
}
