

/**
 *
 * @author Infinix
 */
public class Handphone {
   String jenis_HP;
   int tahun_pembuatan;
   
   public void setDataHP(String jenis_HP, int tahun_pembuatan){
       jenis_HP = jenis_HP;
       tahun_pembuatan = tahun_pembuatan;
       
   }
   public String getJenisHP(){
       return jenis_HP;
   }
   
   public int getTahunPembuatan(){
       return tahun_pembuatan;
   }
   
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setDataHP("Android", 2022);
        System.out.println("Jenis HP: "+ hp.jenis_HP);
        System.out.println("Tahun Pembuatan: "+ hp.tahun_pembuatan);
    }
}
