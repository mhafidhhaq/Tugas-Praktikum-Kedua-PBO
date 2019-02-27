package lingkaran;

public class Lingkaran {
    double jari;
    
    public void isiJari(double jari){
        this.jari = jari;
    }
    
    public double getLuas(){
        double luas;
        luas = 3.14 * jari * jari;
        return luas;
    }
    
    public double getKeliling(){
        double kel;
        kel = 2 * 3.14 * jari;
        return kel;
    }
    
    public void getHasil(){
        System.out.println("jadi luasnya " + getLuas() + " sedangkan kelilingnya " + getKeliling());
    }
}
