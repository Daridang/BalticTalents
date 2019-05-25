package oop1.p0514;

public class Exercise3 {
    public static void main(String[] args) {
        print(4, 200);
    }
//    Formulės:
//            [suma su PVM] = 100% + 21%
//            [suma be PVM = [suma su PVM] / 121 * 100
//            [prekes vieneto kaina be PVM] = [suma be PVM] / [kiekis]
//            [PVM suma] = [suma su PVM] - [suma be PVM]
    public static void print(int quantity, double pricePVM) {
        double p = 1.21;
        double price1pcs = pricePVM / p;
        double priceAll = (pricePVM / p) * quantity;
        double sumPVM = (pricePVM - price1pcs) * quantity;
        double sumTotal = pricePVM * quantity;

        // prekės kaina be PVM (tikslumas 2 ženklai po kablelio)
        System.out.println(String.format("Prekes kaina be PVM: %.2f EUR", price1pcs));

        // kiekis
        System.out.println(String.format("Kiekis: %d", quantity));

        // suma be PVM (tikslumas 2 ženklai po kablelio)
        System.out.println(String.format("Suma be PVM: %1$, .2f EUR", priceAll));

        // PVM suma (tikslumas 2 ženklai po kablelio)
        System.out.println(String.format("PVM suma: %1$, .2f EUR", sumPVM));

        // viso suma su PVM (tikslumas 2 ženklai po kablelio).
        System.out.println(String.format("Viso suma su PVM: %1$, .2f EUR", sumTotal));

    }
}
