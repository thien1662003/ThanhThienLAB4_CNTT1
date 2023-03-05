package LAB4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class DanhSachSinhVien
{
    ArrayList<SinhVien> danhsach =new ArrayList<>();
    
    public int nhap()
    {
    if(true)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println(" nhap ten sinh vien ");
     String hoten = sc.nextLine();
     if (hoten == null||hoten.equals(""))
     {
        return 0;
     }
     System.out.println(" nhap nganh hoc sinh vien ");
     String nganh =sc.nextLine();
     if (nganh == null||nganh.equals(""))
     {
         return 0;
     }
     else if (nganh.equalsIgnoreCase("IT"))
     {
     System.out.println(" nhap diem java ");
     double diemJava = sc.nextDouble();
     System.out.println(" nhap diem css ");
     double diemCss = sc.nextDouble();
     System.out.println(" nhap diem html ");
     double diemHTML = sc.nextDouble();
     SinhVien sv = new SinhVienIT(hoten,nganh,diemJava,diemCss,diemHTML);
     danhsach.add(sv);
     }
     else if (nganh.equalsIgnoreCase("Biz"))
     {
     System.out.println(" nhap diem marketting ");
     double diemmarketing = sc.nextDouble();
     System.out.println(" nhap diem sale ");
     double diemsale = sc.nextDouble();
     SinhVien sv = new SinhVienBiz(hoten,nganh,diemmarketing,diemsale);
     danhsach.add(sv);
     } 
    }
    return nhap();
    }
 public void xuatgioi()
 {
 for(SinhVien sv :danhsach)
 {
  if (sv.gethocluc().equalsIgnoreCase("gioi"))
  {
   System.out.printf("Sinh Vien %s || nganh %s || diem tb : %2f || hoc luc : %s \n",sv.getName(),sv.getNganh(),sv.getdiem(),sv.gethocluc());
  }
 }
 }
 public void xuat()
 {
 for(SinhVien sv :danhsach)
 {
 System.out.printf("Sinh Vien %s || nganh %s || diem tb : %2f || hoc luc : %s \n",sv.getName(),sv.getNganh(),sv.getdiem(),sv.gethocluc());
 }
 
 }
 Comparator<SinhVien> sx = new Comparator<SinhVien>()
 {
 @Override
 public int compare(SinhVien o1,SinhVien o2)
 {
 return Double.compare(o1.getdiem(), o2.getdiem());
 }
 };
 public void sapxepdiem()
 {
  Collections.sort(danhsach, sx);
  System.out.println("sap xep tang dan theo diem");
  xuat();
 }
 public void menu()
 {
 Scanner sc = new Scanner (System.in);
 int chon =0;
 do{
 System.out.println(" chon muc muon chon ");
 System.out.println(" 1 nhap danh sach sinh vien ");
 System.out.println(" 2 xuat danh sach sinh vien ");
 System.out.println(" 3 xuat danh sach sinh vien co hoc luc gioi");
 System.out.println(" 4 sap xep danh sach sinh vien theo diem ");
 System.out.println(" 0 thoat ");
 chon = sc.nextInt();
 if (chon!=0)
 {
 switch(chon)
 {
     case 0: break;
     case 1:nhap();break;
     case 2:xuat();break;
     case 3:xuatgioi();break;
     case 4:sapxepdiem();break;
 }
 }
 }
 while(chon!=0);
 }
}