package com.example.my2.doituong;

import android.os.Parcel;
import android.os.Parcelable;

public class DataShop implements Parcelable {
    private String id;
    private int HinhAnh;
    private String Ten;
    private String tieude;

    public DataShop(){}

    public DataShop(String id,int hinhAnh, String ten,String tieude) {
        this.id = id;
        this.HinhAnh = hinhAnh;
        this.Ten = ten;
        this.tieude = tieude;
    }

    protected DataShop(Parcel in) {
        id = in.readString();
        HinhAnh = in.readInt();
        Ten = in.readString();
        tieude = in.readString();
    }

    public static final Creator<DataShop> CREATOR = new Creator<DataShop>() {
        @Override
        public DataShop createFromParcel(Parcel in) {
            return new DataShop(in);
        }

        @Override
        public DataShop[] newArray(int size) {
            return new DataShop[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeInt(HinhAnh);
        dest.writeString(Ten);
        dest.writeString(tieude);
    }
}

