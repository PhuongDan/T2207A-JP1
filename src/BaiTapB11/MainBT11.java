package BaiTapB11;

import Baitapbuoi6.Sdt;

public class MainBT11 {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("DAN", "0123456789");
        pb.insertPhone("PHUONG", "8305837597");
        pb.insertPhone("AN", "0963282586");
        pb.insertPhone("HUY", "0974929574");
        pb.insertPhone("HUNG", "0183940385");
        pb.removePhone("HUNG");
        pb.updatePhone("DAN", "1234567890");
        pb.sort();
        for (String s : pb.PhoneList){
            System.out.println(s);
        }
    }
}
