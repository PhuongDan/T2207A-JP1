package BaiTapB9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lop  {
     String tenlop;
     String phonghoc;



     ArrayList<SinhVien> list = new ArrayList<>();


    public Lop() {
    }

    public Lop(String tenlop, String phonghoc){
        this.tenlop = tenlop;
        this.phonghoc = phonghoc;
    }


    public String getTenlop() {
        return tenlop;
    }

    public void setTenLop(String tenLop) {
        this.tenlop = tenLop;
    }
    public String getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(String phonghoc) {
        this.phonghoc=phonghoc;
    }
    public ArrayList<SinhVien> getSinhVien() {
        ArrayList<SinhVien> SinhVien = null;
        return SinhVien;
    }

    public void setSinhVien(ArrayList<SinhVien> SinhVien) {

    }


   public void update(SinhVien s){
        for (int i = 0; i<list.size();i++){
            if(list.get(i).masinhvien== s.masinhvien){
                list.get(i).name = s.name;
                list.get(i).dienthoai = s.dienthoai;
                list.get(i).diachi= s.diachi;
                list.get(i).diemthi= s.diemthi;
                return;
            }
        }
   }
   public void sort(){
       Collections.sort(list, new Comparator<SinhVien>() {
           @Override
           public int compare(SinhVien o1, SinhVien o2) {
               return o1.getDiemthi() < o2.getDiemthi()?-1:0;
           }
       });
   }
}
