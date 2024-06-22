public class Supermarket {
    public static void main(String[] args) {
        double appleCount = 5;//顾客购买苹果斤数
        double strawberryCount = 3;//顾客购买草莓斤数
        double mangoCount = 2;//顾客购买芒果斤数
        double totalA = totalPriceA(appleCount, strawberryCount);
        double totalB = totalPriceB(appleCount, strawberryCount, mangoCount);
        double totalC = totalPriceC(appleCount, strawberryCount, mangoCount);
        double totalD = totalPriceD(appleCount, strawberryCount, mangoCount);
        System.out.println("顾客 A 购买了 " + appleCount + " 斤苹果和 " + strawberryCount + " 斤草莓，一共花费了 " + totalA + " 元。");
        System.out.println("顾客 B 购买了 " + appleCount + " 斤苹果和 " + strawberryCount + " 斤草莓和 " + mangoCount + " 斤芒果，一共花费了 " + totalB + " 元。");
        System.out.println("顾客 C 购买了 " + appleCount + " 斤苹果和 " + strawberryCount + " 斤草莓和 " + mangoCount + " 斤芒果，一共花费了 " + totalC + " 元。");
        System.out.println("顾客 D 购买了 " + appleCount + " 斤苹果和 " + strawberryCount + " 斤草莓和 " + mangoCount + " 斤芒果，一共花费了 " + totalD + " 元。");
    }

    public static double totalPriceA(double appleCount, double strawberryCount) {
        double total = appleCount * 8 + strawberryCount * 13;
        return total;
    }

    public static double totalPriceB(double appleCount, double strawberryCount,double mangoCount) {
        double total = appleCount * 8 + strawberryCount * 13 + mangoCount * 20;
        return total;
    }

    public static double totalPriceC(double appleCount, double strawberryCount,double mangoCount) {
        double total = appleCount * 8 + strawberryCount * 13 * 0.8 + mangoCount * 20;
        return total;
    }

    public static double totalPriceD(double appleCount, double strawberryCount,double mangoCount) {
        double total = appleCount * 8 + strawberryCount * 13 * 0.8 + mangoCount * 20 * 0.8;
        if (total >= 100) {
            total = total - 10;
            return total;
        }
        return total;
    }
}
