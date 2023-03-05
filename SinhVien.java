package LAB4;


public abstract class SinhVien 
{
   public String name;
   public String nganh;

    public String getName() {
        return name;
    }

    public String getNganh() {
        return nganh;
    }

    public SinhVien(String name, String nganh) {
        this.name = name;
        this.nganh = nganh;
    }
    abstract double getdiem();
    public String gethocluc()
    {
    String hocluc = null;
    double diem = getdiem();
    if (diem<5)
    {
    hocluc = ("yeu");
    }
    else if (5<=diem && diem<=6.5)
    {
    hocluc = ("trung binh");
    }
    else if (6.5<=diem&&diem<=7.5)
    {
    hocluc = ("kha");
    }
    else if (7.5<=diem&&diem<9)
    {
    hocluc = ("gioi");
    }
    else
    {
    hocluc = ("xuat sac");
    }
    return hocluc;
    }
    
}