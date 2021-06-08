/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import mvc.Model.peserta;
import java.util.List;

/**
 *
 * @author Mohammad Irfan Nugraha
 */
public interface Ipeserta {
    public boolean insert (peserta b);
    public void update (peserta b);
    public void delete(int no_id);
    public List<peserta> getAll();
    public List<peserta> getCariNama(String nama);

}
