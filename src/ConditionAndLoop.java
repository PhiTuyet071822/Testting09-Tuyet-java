import java.util.Scanner;

public class ConditionAndLoop {
    public static void main(String[] args) {
//        Bài 1: Nhập số nguyên từ bàn phím, kiểm tả số chẵn hay lẻ
//        input: số nhập từ bàn phím => Scanner
//        output: kết quả chẵn/lẻ
//        process: khai báo biến, lệnh nhập, điều kiện if...else, lệnh xuất
//        số chẵn chia hết cho 2: number1 % 2 == 0
//        số lẻ không chia hết cho 2: number1 % 2 != 0
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mời bạn nhập số nguyên");
//        int number1 = scanner.nextInt();
//        if (number1 % 2 == 0) {
//            System.out.println("So" + number1 + " là so chẵn");
//        } else {
//            System.out.println("So" + number1 + " là so lẻ");
//        }
// Bài 2: Nhập số nguyên từ bàn phím, kiem tra so do là nguyên âm, nguyên dương hay 0
//        input: nhập số
//        output: Số ... là âm/dương/0
//        process
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời nhập số");
//        int number = scanner.nextInt();
//        if (number > 0) {
//            System.out.print("Số " + number + "là số dương");
//        } else if (number < 0) {
//            System.out.println("Số " + number + "là số âm");
//        } else {
//            System.out.println("Số " + number + "là số 0");
//        }
//    }
//}
// Lưu ý: Nếu if-else quá nhiều thì chuyeern sang switch-case
// Bài 3: tìm số lớn nhất trong 3 số
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời nhập số 1");
//        int number1 = scanner.nextInt();
//        System.out.print("Mời nhập số 2");
//        int number2 = scanner.nextInt();
//        System.out.print("Mời nhập số 3");
//        int number3 = scanner.nextInt();
//        int Maximum = number1;
//        if (Maximum <  number2) {
//            Maximum = number2;
//        }
//        else if (Maximum < number3) {
//            Maximum = number3;
//        }
//         System.out.println("Số lớn nhất trong 3 số là "+ Maximum);
//    }
//}
//Bài 4: Tính tiền taxi
//1km : 15000VND
//từ km thứ 2 trở đi: 12000/km
//tính tiền cước taxi với sô km nhập từ bàn phím

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số km");
//        double soKm = scanner.nextDouble();
//        int GiaTienKm1 = 15000;
//        int GiaTienKmSau = 12000;
//        double soKmSau = soKm - 1;
//        double GiaTienTaxi = GiaTienKm1 + soKmSau * GiaTienKmSau;
//        System.out.println("Giá tiền taxi là " + GiaTienTaxi);
//    }
//}


//Cách khác: Dùng if-else
//tienTaxi = 0;
// if(0.0f <= soKm && soKm <= 1.0f){
//tienTaxi = tienTaxi + 15000
//} else {
//    int soKmConLai = (int)Math.ceil(soKm - 1);
//    tienTaxi = 15000 + soKmConLai*12000;
//      }


//Vòng lặp:
//B1: Tính tổng các số từ 1 - 100

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số n ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println("Tổng dãy số là " + sum);

//B2: Tính tổng các số chẵn từ 1 -100
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số n ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            if (i%2 == 0){
//            sum += i;
//        } }
//        System.out.println("Tổng các số chẵn trong dãy số là " + sum);
//    }
//}
//for (int i = 2;i <= n; i+=2)
//B3: in bảng cửu chương
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
        System.out.println(n + "x" + i + "=" +(n*i));
        }



    }
}