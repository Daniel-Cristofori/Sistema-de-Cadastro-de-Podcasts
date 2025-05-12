/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


  import jakarta.persistence.EntityManager;
  import jakarta.persistence.EntityManagerFactory;
  import jakarta.persistence.Persistence;
  

/**classe para conexão com banco de dados e criação do EntityManager

 */
  public class JPAUtil {
    //constante para centralizar o nome da unidade de persistência
    // se o nome mudar, precisaremos alterar em um só lugar
    private static final String PERSISTENCE_UNIT = "cenaflix";
    
    private static EntityManager em;
    private static EntityManagerFactory fabrica;
    
    
    /**cria EntityManager
     * 
     * @return 
     */
    //cria a entidade se estiver nula e a retorna
    public static EntityManager getEntityManager(){
        if(fabrica == null || !fabrica.isOpen())
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        
        if(em == null || !em.isOpen()) //cria se em nulo ou se o entity manager foi fechado
            em = fabrica.createEntityManager();

        return em;
    }
    
    /**fecha o EntityManager e o factory
     * 
     */
    //fecha o EntityManager e o factory
    public static void closeEtityManager(){
        if(em.isOpen() && em != null){
            em.close();
            fabrica.close();
        }
  } 
  
  }  