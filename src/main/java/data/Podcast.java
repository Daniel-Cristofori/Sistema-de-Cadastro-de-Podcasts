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

/**classe com a entidade Podcast

 */

@Entity(name="podcast")
@Table(name="podcast")
public class Podcast {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nome_episodio;
    private int numero_episodio;
    private String duracao;
    private String url_repositorio;

    
    
    
    /**getters e setter
        * @return s*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNome_episodio() {
        return nome_episodio;
    }

    public void setNome_episodio(String nome_episodio) {
        this.nome_episodio = nome_episodio;
    }

    public int getNumero_episodio() {
        return numero_episodio;
    }

    public void setNumero_episodio(int numero_episodio) {
        this.numero_episodio = numero_episodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl_repositorio() {
        return url_repositorio;
    }

    public void setUrl_repositorio(String url_repositorio) {
        this.url_repositorio = url_repositorio;
    }
    
    
    
    
    
    
}
