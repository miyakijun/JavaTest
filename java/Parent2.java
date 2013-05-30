public class Parent2 extends Parent1{
	public int z;
	public Parent2(){
		super();

	}

	Parent2(int x,int y, int z){
		super(x,y);
		this.z=z;

	}
	public int getZ(){return z;	}
	public void setZ(int i){	this.z=i;}
}
