public class SimpleClass { 
    public static void main(String[] args) { 
 		Ball b1 = new Ball(18.4, "redball000");
 		Ball b2=new Ball(2020,"b2b2b2b2b");
 		int ll=55;
 		b1.setradius(123);
        
        System.out.println("name: " + b1.getradius()); 
        System.out.println("radius: " + b1.getname()); 

        System.out.println("name"+b2.getname());
        System.out.println(Ball.PI);
        System.out.println(Ball.toRadius(30.6));
        System.out.println(Character.isLetter(ll));
    } 
} 