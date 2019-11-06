package co.edureka;

//Bean or Model or POJO
public class Employee {

	//Attributes
	
	int eid;
	String ename;
	Address address;
	
	//Methods
	
	public Employee() {
		
	}
	
	//Constructor injection
	public Employee(Address address) {
	
		this.address = address;
	}


	public void myInit() {
		System.out.println("Object initialized");
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	//Setter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	public void myDestroy() {
		System.out.println("Object detroyed");
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}
	
}
