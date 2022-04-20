package CentralProcessingUnit.AgArayuzu.Concrete;

import CentralProcessingUnit.Eyleyici.Abstract.Eyleyici;
import CentralProcessingUnit.SicaklikAlgilayici.Abstract.SicaklikAlgilayici;

public class AgArayuzu implements CentralProcessingUnit.AgArayuzu.Abstract.AgArayuzu {

    private Eyleyici eyleyici;
    private SicaklikAlgilayici sicaklikAlgilayici;
    public AgArayuzu(Eyleyici eyleyici,SicaklikAlgilayici sicaklikAlgilayici){
        this.eyleyici=eyleyici;
        this.sicaklikAlgilayici=sicaklikAlgilayici;
    }
    @Override
    public void getMenu() {


    }

    @Override
    public void sogutucuAc() {
        this.eyleyici.sogutucuAc();

    }

    @Override
    public void sogutucuKapat() {
        this.eyleyici.sogutucuKapat();
    }

    @Override
    public void sicaklikGonder() {
        double sicaklik=this.sicaklikAlgilayici.sicaklikAlgila();
        System.out.println("Guncel Sicaklik:"+sicaklik);
    }
}
