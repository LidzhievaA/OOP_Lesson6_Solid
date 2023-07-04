public class User implements Save{
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public void save(){
		Persister persister = new Persister(this);
		persister.save();
	}
	
	public void report(){
		System.out.println("Report for user: " + name);
	}
}