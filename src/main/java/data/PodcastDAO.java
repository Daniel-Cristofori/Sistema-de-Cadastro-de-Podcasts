/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**classe para manipulação de podcasts

 */
public class PodcastDAO {
    
    /**cadastra novo podcast no banco de dados
     * 
     * @param p 
     */
    public void cadastrar(Podcast p){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(p);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEtityManager();
          }
      }
    
    
    /**lista todos os podcasts pelo produtor
     * 
     * @param produtor
     * @return 
     */
    public List<Podcast> listar(String produtor){
      EntityManager em = JPAUtil.getEntityManager();
      List podcasts = null;
      try{
          String textoQuery = "SELECT p FROM podcast p "+
                  " WHERE (produtor = :produtor ) ";
          
          Query consulta = em.createQuery(textoQuery);
           
          consulta.setParameter("produtor", produtor);
          
          podcasts = consulta.getResultList();
      }
      finally{
          JPAUtil.closeEtityManager();
      }
      return podcasts;
    }    
    
    
    /**exclui o podcast do banco de dados
     * 
     * @param id 
     */
    public void excluir(int id){
      EntityManager em = JPAUtil.getEntityManager();
      try{
          Podcast p = em.find(Podcast.class, id);
          if(p != null){
              em.getTransaction().begin();
              em.remove(p);
              em.getTransaction().commit();
          }
      }catch(Exception e){
          em.getTransaction().rollback();
          throw e;
      }
      finally{
          JPAUtil.closeEtityManager();
      }
    }  
    
}
