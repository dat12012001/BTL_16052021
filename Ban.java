/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLCoffeeShop;

/**
 *
 * @author HIEU
 */
public class Ban {

    private static int dem = 0;
    private String maBan;
    private int sucChua;
    private String tinhTrang;
    private boolean Flag = false;
//    {
//        dem++;
//        maBan = String.format("B%03d", dem);
//    }

    //Phương thức khởi tạo Bàn từ CSDL
    public Ban() {
    }

    public Ban(String maBan, int sucChua, String tinhTrang) { 
        this.maBan = maBan;
        this.sucChua = sucChua;
        this.tinhTrang = tinhTrang;
    }
    public Ban(boolean flag, int sucChua, String tinhTrang) { 
        this.Flag = flag;
        if(flag == true) {
            dem++;
            maBan = String.format("B%03d", dem);
        }
        this.sucChua = sucChua;
        this.tinhTrang = tinhTrang;
    }
    public Ban(int sucChua, String tinhTrang) {
        this.sucChua = sucChua;
        this.tinhTrang = tinhTrang;
    }
    
    /**
     * @return the maBan
     */
    public String getMaBan() {
        return maBan;
    }

    /**
     * @param maBan the maBan to set
     */
    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    /**
     * @return the tinhTrang
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public static void setDem(int dem) {
        Ban.dem = dem;
    }

    public static int getDem() {
        return dem;
    }
    
}
