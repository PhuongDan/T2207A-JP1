package BaiTapB11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    ArrayList<String> PhoneList = new ArrayList<>();
    @Override
    void insertPhone(String name, String phone) {
        if (PhoneList.isEmpty()){
            PhoneList.add(name+", "+phone);
        }else{
            String pb = searchPhone(name);
            if (pb !=null){
                if (!pb.contains(phone)){
                    PhoneList.set(PhoneList.indexOf(pb), pb+" : "+phone);
                }
            }else {
                PhoneList.add(name+", "+phone);
            }
        }
    }

    @Override
    void removePhone(String name) {
        if (PhoneList.isEmpty()){
            System.out.println("Danh ba trong");
        }else {
            String pb = searchPhone(name);
            if (pb != null){
                PhoneList.remove(pb);
                System.out.println("Da xoa nguoi dung "+name);
            }else {
                System.out.println("Khong tim thay nguoi dung");
            }
        }

    }

    @Override
    void updatePhone(String name, String newphone) {
        if (PhoneList.isEmpty()){
            System.out.println("Danh ba trong");
        }else {
            String pb = searchPhone(name);
            if (pb!=null){
                if (!pb.contains(newphone)){
                    PhoneList.set(PhoneList.indexOf(pb),pb.split(",")[0]+", "+newphone);
                }
            }else {
                System.out.println("Khong tim thay nguoi dung"+name);
            }
        }


    }

    @Override
    String searchPhone(String name) {
        for (String pb : PhoneList){
            if (pb.split(",")[0].equals(name)){
                return pb;
            }
        }
        return null;

    }

    @Override
    void sort() {
        if (PhoneList.isEmpty()){
            System.out.println("Danh ba trong");
        }else {
            Collections.sort(PhoneList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
        }

    }
}
