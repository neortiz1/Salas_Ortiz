
package CapaGestores;

import CapaNegocio.Sala;
import java.awt.List;
import java.util.ArrayList;

public class GestorSala extends ArrayList<Sala>{
        static GestorSala gesSalas ;
        static ArrayList<InViewSala> viewSalas;
        static Sala LastSala = new Sala();
        
        public ArrayList<Sala> GetSalas()
        {
          //  DataManager dtaManager = new DataManager();
          //  DataSet ds = dtaManager.SelectSalaDB();
          //  DataTable tbl = ds.Tables[0];
            
         //   gesSalas.Clear();
         //   foreach (DataRow dr in tbl.Rows)
         //   {
         //       Sala objSalaAux = new Sala();
         //       objSalaAux.NumSala = (int)dr[0];
         //       objSalaAux.NombreSala = dr[1].ToString();
          //      gesSalas.Add(objSalaAux);

           // }
            return gesSalas;
        }
        public ArrayList GetTableSalas()
        {
            return null;
            //return gesSalas.toArray();
        }

        //Patron singleton
        public static GestorSala getGestor()
        {
            if (gesSalas == null)
            {
                gesSalas = new GestorSala();
            }
            
            return gesSalas;
        }
        
        public boolean AddSala(Sala objSala)
        {
           // DataManager dtaManager = new DataManager();    
           // dtaManager.InsertSalaDB(objSala);
            gesSalas.add(objSala);
            
            LastSala = objSala;

            NotificaCambio();
            return true;
        }
        public Sala getLastSala()
        {
            return LastSala;
        }

        private void NotificaCambio()
        {
            if (viewSalas != null)
            {
                for(InViewSala objVSala : viewSalas)
                {
                    objVSala.Actualiza(gesSalas);
                }
            }
        }
        public void suscribir(InViewSala ViewSalas, boolean suscribir)
        {
            if (viewSalas == null)
                viewSalas = new ArrayList<InViewSala>();
            
            if(suscribir)
              viewSalas.add(ViewSalas);
            else
              viewSalas.remove(ViewSalas);

        }
}
