package services;

import entities.PokemonTrainer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PTServices {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAlab");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();

    public PokemonTrainer findById(int id){
        return em.find(PokemonTrainer.class, id);
    }

    public List<PokemonTrainer> findAll(){
        return em.createQuery("SELECT h FROM PokemonTrainer h", PokemonTrainer.class).getResultList();
    }

    public void update(PokemonTrainer pt){
        List<PokemonTrainer> allTrainer = findAll();
        if(allTrainer.contains(findById(pt.getTrainerid()))){
            tx.begin();
            em.merge(pt);
            tx.commit();
        }
    }

    public void create(PokemonTrainer ptAdd){
        tx.begin();
            em.persist(ptAdd);
        tx.commit();
    }

    public void delete(PokemonTrainer ptDelete){
        tx.begin();
            em.remove(ptDelete);
        tx.commit();
    }
}
