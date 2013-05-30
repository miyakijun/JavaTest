public class Ball{
    private double radius;
    private String name;
    public static double PI=3.14159;

    public Ball (double _radius,String _name){
        radius=_radius;
        name=_name;

    }


    public double getradius(){

        return radius;
    }
    public String getname(){
        return name;
    }

    public void setradius(double _radius){

        radius=_radius;
    }
    public void setname(String _name){
        name=_name;
    }

    public static double toRadius(double angle){
        return PI/180*angle;

    }
}