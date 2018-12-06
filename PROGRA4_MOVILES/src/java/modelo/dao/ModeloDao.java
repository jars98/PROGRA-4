/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidad.Modelo;
import modelo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

public class ModeloDao {
    public List<Modelo> listarModelo() {
        List<Modelo> lista = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        String hql = "FROM Modelo";
        try {
            lista = sesion.createQuery(hql).list();
            t.commit();
            sesion.close();
        } catch (Exception e) {
            t.rollback();
        }
        return lista;
    }
    public void agregar(Modelo modelo) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(modelo);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void modificar(Modelo modelo) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(modelo);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void eliminar(Modelo modelo) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(modelo);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
}
