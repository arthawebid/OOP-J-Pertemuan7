package pertemuan701;

/**
 *
 * @author Made Artha
 * TGL: 29-04-2025
 */
public class mahasiswa {
    private String NIM, NAMA;
    
    public void datamhs(){
        System.out.println("Menampilkan Data Mahasiswa");
    }
    public void datamhs(String nNIM){
        this.NIM = nNIM;
        System.out.printf("Data Mahasiswa Dengan NIM %s\n",this.NIM); 
    }
    public void datamhs(String nNIM, String nNAMA){
        this.NIM = nNIM;
        this.NAMA = nNAMA;
        System.out.printf("Data Mahasiswa dengan NIM %s adalah %s\n", this.NIM,this.NAMA);
    }
}
