/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardatupassword;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import java.util.List;

/**
 *
 * @author carlos
 */
public class ManejaPasswords {
    
    private Session session;
    private Transaction tx;
    
    public void IniciaOperacion() throws HibernateException
    {
        System.out.println("Comienza Hibernate");
        session=HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction();
    }
    
    public void finalizaOperacion() throws HibernateException
    {
        System.out.println("Finalizando Hibernate");
        tx.commit();
        session.close();
    }
    
    public void ManejaExcepcion(HibernateException he) throws HibernateException
    {
        tx.rollback();
        System.out.println("Ocurrio un error en la capa de datos "+ he.getMessage());
        System.exit(0);
    }
    
    public void GuardaPass (Passwords pass)
    {
        try
        {
            IniciaOperacion();
            session.save(pass);
            System.out.println("Pass Guardada");
        }
        catch (HibernateException he)
                {
                  ManejaExcepcion(he);
                  throw he;
                }
        finally
        {
            finalizaOperacion();
        }
    }
    
    /**
     *
     */
    public void Listar()
    {
        Query query = session.createQuery("SELECT * FROM passwords");
        List<Object[]> listaResultados=query.list();
        for(int i=0; i<listaResultados.size(); i++)
        {
            System.out.println("Servicio "+ i+ " : "+listaResultados.get(i)[0] + " Password: " + listaResultados.get(i)[1]);
        }
    }
    
}
