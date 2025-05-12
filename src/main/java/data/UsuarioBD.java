/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
 
 /**classe para ,manipulação de usuario
 
  */       

public class UsuarioBD {
    
    
    /**valida se o usuário existe no banco de dados
     * 
     * @param login
     * @param senha
     * @return 
     */
    public static Usuario validarUsuario(String login, String senha) {
                             
        EntityManager em = JPAUtil.getEntityManager();
        Usuario usuarioEncontrado = null;
                          
        try {
                              
            String textoQuery = "SELECT u FROM usuario u "+
                    " WHERE (:login = u.login) "+
                    " AND (:senha = u.senha)";
          
            TypedQuery<Usuario> consulta = em.createQuery(textoQuery, Usuario.class);
                                
            consulta.setParameter("login", login);
            consulta.setParameter("senha", senha);

            usuarioEncontrado = consulta.getSingleResult();
                            
        }finally{
                                 
            JPAUtil.closeEtityManager();
                            
        }
                          
        return usuarioEncontrado;
                      
    }    
                 
} 