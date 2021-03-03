/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weka1;

import weka.associations.Apriori;
import weka.core.Instances;

/**
 *
 * @author Asus
 */
public class MyAprioriModel extends MyknowlegeModel{
       Apriori apriori;  
       Instances newData;
    public MyAprioriModel() {
    }

    public MyAprioriModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
        this.apriori= new Apriori();
    }
       
       public void mineAssociationRules() throws Exception{
           //Loc du lieu
//           this.newData= removeData(this.dataset);
           this.newData= converData(this.dataset);
           //Thiet lap thong so cho model Apriori
           apriori.setOptions(this.model_options);
           //Khai pha luat ket hop
           apriori.buildAssociations(this.newData);
           
       }

    @Override
    public String toString() {
        return apriori.toString(); //To change body of generated methods, choose Tools | Templates.
    }
       
       
       
}




