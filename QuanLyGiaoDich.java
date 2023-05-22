/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public void xuatDanhSachGiaoDich() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            System.out.println("Mã giao dịch: " + giaoDich.maGd);
            System.out.println("Ngày giao dịch: " + giaoDich.ngayGd);
            System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
            System.out.println(".........................................");
        }
    }

    public int demSoLuongGiaoDichDat() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongGiaoDichNha() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichNha) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienGiaoDichDat() {
        double sum = 0;
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                sum += giaoDich.tinhThanhTien();
                count++;
            }
        }
        return sum / count;
    }

    public void xuatGiaoDichThang5Nam2023() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngayGd.contains("05/2023")) {
                System.out.println("Mã giao dịch: " + giaoDich.maGd);
                System.out.println("Ngày giao dịch: " + giaoDich.ngayGd);
                System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
                System.out.println(".........................................");
            }
        }
    }

 public static void main(String[] args) {
        QuanLyGiaoDich qlgd = new QuanLyGiaoDich();

        GiaoDichDat gdDat1 = new GiaoDichDat("1", "21/05/2023", 1030, 2020, "A");
        GiaoDichDat gdDat2 = new GiaoDichDat("2", "02/05/2023", 1350, 3030, "B");
        GiaoDichNha gdNha1 = new GiaoDichNha("3", "22/05/2023", 2003, 1350, "cao cấp", "123 Phạm văn Đồng ");
        GiaoDichNha gdNha2 = new GiaoDichNha("4", "04/05/2023", 1820, 2020, "Nhà Cấp 4", "146 Nguyẽn Trí Thanh");

        qlgd.themGiaoDich(gdDat1);
        qlgd.themGiaoDich(gdDat2);
        qlgd.themGiaoDich(gdNha1);
        qlgd.themGiaoDich(gdNha2);

        qlgd.xuatDanhSachGiaoDich();

        int soLuongGiaoDichDat = qlgd.demSoLuongGiaoDichDat();
        int soLuongGiaoDichNha = qlgd.demSoLuongGiaoDichNha();
        double trungBinhThanhTienGiaoDichDat = qlgd.tinhTrungBinhThanhTienGiaoDichDat();

        System.out.println("Số lượng giao dịch đất: " + soLuongGiaoDichDat);
        System.out.println("Số lượng giao dịch nhà: " + soLuongGiaoDichNha);
        System.out.println("Trung bình thành tiền giao dịch đất: " + trungBinhThanhTienGiaoDichDat);

        System.out.println("Các giao dịch tháng 5 năm 2023:");
        qlgd.xuatGiaoDichThang5Nam2023();
    }
}