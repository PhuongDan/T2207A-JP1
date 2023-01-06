package Btb5;

public class Hsinh {
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String tenlh;
    private int dtb;

    public Hsinh(String hoten, String ngaysinh, String diachi, String tenlh, int dtb) {
        this.hoten=hoten;
        this.ngaysinh=ngaysinh;
        this.diachi=diachi;
        this.tenlh=tenlh;
        this.dtb = Integer.parseInt(String.valueOf(dtb));
    }


    public String getHoten(){ return hoten;}
    public void setHoten(String hoten){
        this.hoten=hoten;
    }


    public String getNgaysinh(){ return ngaysinh;}
    public void setNgaysinh(String ngaysinh){
        this.ngaysinh=ngaysinh;
    }


    public String getDiachi(){ return diachi;}
    public void setDiachi(String diachi){
        this.diachi=diachi;
    }


    public String getTenlh(){ return tenlh;}
    public void setTenlh(String tenlh){
        this.tenlh=tenlh;
    }


    public int getDtb(){ return dtb;}
    public void setDtb(String dtb){
        this.dtb = Integer.parseInt(dtb);
    }
    public void danhgia(){
        if (dtb==10){
            System.out.print("Xuất sắc");
        } else if(dtb>=8){
            System.out.print("Giỏi");
    }
        else if(dtb>=6 && dtb<8)
    {
        System.out.print("Khá");
    }
        else if(dtb>=4 && dtb<6)
    {
        System.out.print("Trung Bình");
    }
        else
    {
        System.out.print("Yếu");
    }
    }



}
