public class Point3D extends Point2D { // 擴充Point2D類別 
    private int z;  // 新增私用資料 
 
    public Point3D() { 
        super(); 
    } 
 
    // 建構函式，同時指定呼叫父類別建構函式 
    Point3D(int x, int y, int z) { 
        super(x, y); 
        this.z = z; 
    } 
 
    // 新增函式 
    public int getZ() {return z;}
}  