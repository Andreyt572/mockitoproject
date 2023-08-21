package ru.netology.mockitoproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();
        manager.add("Film 1");
        String[] expected ={ "Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovieManager manager = new MovieManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        String[] expected ={ "Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
