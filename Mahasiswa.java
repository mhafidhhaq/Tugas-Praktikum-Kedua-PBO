package mahasiswa;

public class Mahasiswa {
    int nip;
    String nama;
    
    public Mahasiswa(int i, String n){
        this.nip = i;
        this.nama = n;
    }
    
    public int getNRP(){
        return nip;
    }
    
    public String getNama(){
        return nama;
    }
    
}
