package BaiTapB11;

abstract class Phone {
    abstract void insertPhone(String name,String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name,String newphone);
    abstract String searchPhone(String name);
    abstract void sort();
}
