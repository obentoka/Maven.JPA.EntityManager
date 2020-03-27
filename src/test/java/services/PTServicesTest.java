package services;

import entities.PokemonTrainer;
import org.junit.Before;
import org.junit.Test;

public class PTServicesTest {
    PTServices test;
    PokemonTrainer one;
    @Before
    public void init(){
        test = new PTServices();
        one = new PokemonTrainer(1, 2, 3, 4, 5,
                                0, 9, 8, 7, 6);

    }

    @Test
    public void findTest(){
        Integer actualMax = test.findById(1).getMaxhp();
        System.out.println(actualMax);
    }

    @Test
    public void createTest(){
        test.create(one);
        System.out.println(test.findById(1).toString());
    }

    @Test
    public void deleteTest(){
        test.delete(test.findById(1));
    }

    @Test
    public void updateTest(){
        test.update(one);
        System.out.println(test.findById(one.getTrainerid()).toString());
    }
}