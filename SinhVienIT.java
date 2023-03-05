package LAB4;
public class SinhVienIT extends SinhVien
{
    public double diemJava;
    public double diemCss;
    public double diemHTML;
    
    public SinhVienIT(String name,String nganh,double diemJava, double diemCss, double diemHTML) 
    {
        super (name,nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHTML = diemHTML;
    }

    @Override
    double getdiem()
    {
    return (2*diemJava+diemHTML+diemCss)/4;
    }

}