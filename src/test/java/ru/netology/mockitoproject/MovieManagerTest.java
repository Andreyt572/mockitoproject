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
}
