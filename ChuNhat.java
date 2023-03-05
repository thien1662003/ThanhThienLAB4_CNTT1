package LAB4;
public class ChuNhat 
{
    public double chieudai;
    public double chieurong;
    public ChuNhat(){}
    public ChuNhat(double chieudai, double chieurong) 
    {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
      public double getChieudai() 
    {
        return chieudai;
    }

    public void setChieudai(double chieudai)
    {
        this.chieudai = chieudai;
    }

    public double getChieurong()
    {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    public double getchuvi()
    {
     double chuvi = (chieudai + chieurong)*2;
     return chuvi;
    }
    public double getdientich()
    {
    double dientich=(chieudai*chieurong);
    return dientich;
    }
    public void xuat()
    {
    System.out.println("chu vi hinh chu nhat la :"+getchuvi());
    System.out.println("dien tich hinh chu nhat la " +getdientich());
    }
   
}
class Hinhvuong extends ChuNhat
{
   public Hinhvuong(){}
   public Hinhvuong(double canh)
   {
    super(canh,canh);
   }
   @Override
public void xuat()
{   
   System.out.println("dien tich hinh vuong "+getdientich());
   System.out.println("chuvi hinh vuong "+getchuvi());
}
}
class main
{
public static void main(String[] arg)
{
ChuNhat cn = new ChuNhat(6,9);
ChuNhat hv = new Hinhvuong(9);
cn.xuat();
hv.xuat();
}
}