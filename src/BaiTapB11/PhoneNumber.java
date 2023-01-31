package BaiTapB11;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;

    private ArrayList<String> phones = new ArrayList<>();

    public PhoneNumber(){
    }

    public PhoneNumber(String name, ArrayList<String> phones) {
        this.name = name;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }
}
