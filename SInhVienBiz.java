package LAB4;
public class SinhVienBiz extends SinhVien
{
    public double diemmarketing;
    public double diemsale;

    public SinhVienBiz(String hoten,String nganh,double diemmarketing, double diemsale)
    {
        super(hoten,nganh);
        this.diemmarketing = diemmarketing;
        this.diemsale = diemsale;
    }
    
   @Override 
   double getdiem()
   {
    return (2*diemmarketing+diemsale)/3;
   }
    
}