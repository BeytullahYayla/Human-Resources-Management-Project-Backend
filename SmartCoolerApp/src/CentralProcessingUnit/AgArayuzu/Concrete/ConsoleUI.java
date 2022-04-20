package CentralProcessingUnit.AgArayuzu.Concrete;

import CentralProcessingUnit.Eyleyici.Concrete.Eyleyici;
import CentralProcessingUnit.SicaklikAlgilayici.Concrete.SicaklikAlgilayici;

public class ConsoleUI {

    public static void main(String[] args) {
        AgArayuzu agArayuzu=new AgArayuzu(new Eyleyici(),new SicaklikAlgilayici());
        agArayuzu.sicaklikGonder();
        agArayuzu.sogutucuAc();
        agArayuzu.sogutucuKapat();
    }
}
