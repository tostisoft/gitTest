public class Bean{

	private int id;
	private String desc;

	public void setId(int id){
		this.id=id;
	}

	public void setDesc(String desc){
		this.desc=desc;
	}

	public String toString(){
		return this.id+","+this.desc;
	}

	public String getDesc(){
		return this.desc;
	}

	public int getId(){
		return this.id;
	}
}
