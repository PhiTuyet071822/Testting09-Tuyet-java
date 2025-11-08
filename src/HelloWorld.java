import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
////
//        System.out.println("Hello World");
//        System.out.println("Hello" + "Testing 09");
//        int number1 = 10;
//        System.out.println(number1);

//        Khai báo biến:
//        - So(số nguyên, số thực)
//        - Chuỗi (String)
// - Cách khai báo biến:
//        <kiểu dữ liệu> <tên biến> = <dữ liệu>;
//        number1 = 10;
//        int number2 = 20;
//        double number3 = 3.14f;
//        float number4 = 7.0f;
//        String string1 = "abc";
//        boolean bool1 = true;
//        boolean bool2 = false;

//Nhập dữ liệu từ bàn phím:
//        Scanner
//        Khai báo đối tượng Scanner:
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Plaease enter a number");
//int number6 = scanner.nextInt();
//System.out.println(("Số nhập là" + number6));

//System.out.println("Mời bạn nhập chuỗi ");
//String string9 = scanner.nextLine();
//System.out.println("chuỗi bạn nhập vào là " + string9);

// Phép tính + - * /(chia nguyên) %(chia dư)
//        đi chung với biến (variable)
//        System.out.println("Mời nhập 2 số");
//        int number8 = scanner.nextInt();
//        int number9 = scanner.nextInt();
//        int result = number8 + number9;
//        System.out.println("Kết quả cộng 2 số là "+ (number8 + number9) );

//        System.out.println("Mời nhập 2 số");
//        int number8 = scanner.nextInt();
//        int number9 = scanner.nextInt();
//        System.out.println("Kết quả hiệu 2 số là "+ (number8 - number9) );

//        Lưu ý kết quả phép nhân có nằm trong vùng dữ liệu đã khai bao không

//        Chia lấy dư (%)
//        System.out.println("Mời nhập 2 số");
//        int number8 = scanner.nextInt();
//        int number9 = scanner.nextInt();
//        int result = number8 % number9;
//        System.out.println("Kết quả chia lấy dư 2 số là "+ result  );
//
//        true - false
//        ( > < >= <= == !=) phải đi kèm keyword default if-else
//        Kết quả của phép so sánh là boolean
        int number18 = 30;
        int number19 = 20;
        boolean check1 = number18 > number19;
        boolean check2 = number18 < number19;
        boolean check3 = number18 == number19;
        boolean check4 = number18 != number19;
        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);
        System.out.println(check4);
    }
}
