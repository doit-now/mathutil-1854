package com.giaolang.tool.mathutil.core;

public class MathUtility {

    //CLASS NÀY CHỨA CÁC HÀM STATIC, LÀ NHỮNG HÀM TIỆN ÍCH DÙNG CHUNG CHO MỌI NƠI

    //ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH. CỦA JDK
    //HÀM NÀY TÍNH N!
    //N! = 1.2.3...N
    //KO CÓ GIAI THỪA SỐ ÂM
    //0! = 1
    //20! VỪA ĐỦ KIỂU LONG, TỨC LÀ 21! VƯỢT KIỂU LONG

    public static long getFactorial(int n) {
        //đem code chính ra sửa gọi là REFACTOR/REFACTORING
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0 and 20, Ngọc Trinh!");
          //bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko đc chạy thành công, ko value trả về

        if (n == 0 || n == 1)
            return 1;

        //ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
        return n * getFactorial(n - 1);
    }
//ĐEM LÊN SERVER MÀ RA MÀU XANH
    //1. CODE TỐI ƯU NGON VÌ PASS TEST CASE
    //2. TEST LẠI THỨ TỪNG TEST RẤT MẤT CÔNG, NAY CÓ SCRIPT TEST TỰ ĐỘNG, KHOẺ RE
    //    REGRESSION TESTING, KIỂM THỬ HỒI QUY


//    public static long getFactorial(int n) {
//        //đem code chính ra sửa gọi là REFACTOR/REFACTORING
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0 and 20, Ngọc Trinh!");
//          //bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko đc chạy thành công, ko value trả về
//
//        if (n == 0)
//            return 1;
//
//        //sống sót đến đây n = 1..19
//        //for mà tính
//        long result = 1; //thuật toán dồn con heo đất
//
//        for (int i = 1; i <= n; i++)
//            result *= i;  //nhân dồn vào từng cháu i
//
//        return result;
//    }

}
