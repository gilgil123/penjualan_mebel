/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.penjualan.mebel;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User ID
 */
public class Model_penyimpanan {
    
    private DefaultTableModel tabel = new DefaultTableModel();
    public Model_penyimpanan(){
        
        getTabel().addColumn("Pilihan");
        getTabel().addColumn("Bahan");
        getTabel().addColumn("Harga");
       
    }
    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
  


    /**
     * @return the tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }

   
 
    
     
}
