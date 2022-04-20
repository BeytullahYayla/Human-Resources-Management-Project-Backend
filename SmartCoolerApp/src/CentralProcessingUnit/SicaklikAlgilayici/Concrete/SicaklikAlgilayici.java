package CentralProcessingUnit.SicaklikAlgilayici.Concrete;
import java.util.Random;

public class SicaklikAlgilayici implements CentralProcessingUnit.SicaklikAlgilayici.Abstract.SicaklikAlgilayici {
    @Override
    public double sicaklikAlgila() {
        Random random=new Random();
        double temprature=random.nextDouble(50.0);
        return temprature;
    }
}
