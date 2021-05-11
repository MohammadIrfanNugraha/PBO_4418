/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfoakademik_kasus1;

/**
 *
 * @author Mohammad Irfan Nugraha
 */
public class SisfoAkademik_kasus1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matkulpokok matakuliah_pokok = new matkulpokok();
        matakuliah_pokok.set_matakuliahpokok("PBO");
        matkultambahan matakuliah_tambahan = new matkultambahan();
        matakuliah_tambahan.set_matakuliahtambahan("IMK");
        univ universitas = new univ();
        
        listMhsAmpu mhsdiampu = new listMhsAmpu();
        mhsdiampu.set_dsn();
 
        matakuliah_pokok.get_matkulpokok();
        matakuliah_tambahan.get_matkulpokok();

        mhsdiampu.set_namamhs();
        mhsdiampu.set_nimmhs();
        mhsdiampu.getmhsampu();
        
        mhsdiampu.getlist();
        universitas.get_nilaiakhir();
    }
    
}
