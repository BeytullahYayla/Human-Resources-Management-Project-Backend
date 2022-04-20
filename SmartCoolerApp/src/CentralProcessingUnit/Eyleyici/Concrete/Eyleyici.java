package CentralProcessingUnit.Eyleyici.Concrete;

public class Eyleyici implements CentralProcessingUnit.Eyleyici.Abstract.Eyleyici {
    @Override
    public void sogutucuAc() {
        System.out.println("Sogutucu Acildi");
    }

    @Override
    public void sogutucuKapat() {
        System.out.println("Sogutucu Kapatildi");
    }
}
