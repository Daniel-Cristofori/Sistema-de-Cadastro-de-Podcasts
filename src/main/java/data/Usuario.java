/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**classe com a entidade usuario

 */

@Entity(name="usuario")
@Table(name="usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String tipo;
                    
    
    /**getters e setter
        * @return s*/
    public int getId() {
        return id;
    }
                    
    public void setId(int id) {
        this.id = id;
    }
                    
    public String getNome() {
        return nome;
    }
                    
    public void setNome(String nome) {
        this.nome = nome;
    }
                    
    public String getLogin() {
         return login;
     }
                    
    public void setLogin(String login) {
        this.login = login;
    }
                    
    public String getSenha() {
        return senha;
    }
                    
    public void setSenha(String senha) {
         this.senha = senha;
     }
                    
    public String getTipo() {
        return tipo;
    }
                    
    public void setTipo(String tipo) {
         this.tipo = tipo;
    }    
                        
}