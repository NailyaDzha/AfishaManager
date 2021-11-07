package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishaManagerTest {

    @Test
    void shouldAddMovie() {
        AfishaManager manager = new AfishaManager(1);
        Afisha Bloodshot = new Afisha(1, "Bloodshot", "action");
        manager.add(Bloodshot);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{Bloodshot};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAll() {
        AfishaManager manager = new AfishaManager(10);
        Afisha one = new Afisha(1, "First movie", "action");
        Afisha two = new Afisha(2, "Second movie", "horror");
        Afisha three = new Afisha(3, "Third movie", "action");
        Afisha four = new Afisha(4, "Fourth movie", "drama");
        Afisha five = new Afisha(5, "Fifth movie", "action");
        Afisha six = new Afisha(6, "Sixth  movie", "cartoon");
        Afisha seven = new Afisha(7, "Seventh  movie", "action");
        Afisha eight = new Afisha(8, "Eighth movie", "thriller");
        Afisha nine = new Afisha(9, "Ninth movie", "action");
        Afisha ten = new Afisha(10, "Tenth movie", "horror");
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{ten, nine, eight, seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetLessThenTen() {
        AfishaManager manager = new AfishaManager(10);
        Afisha one = new Afisha(1, "First movie", "action");
        Afisha two = new Afisha(2, "Second movie", "horror");
        Afisha three = new Afisha(3, "Third movie", "action");
        Afisha four = new Afisha(4, "Fourth movie", "drama");
        Afisha five = new Afisha(5, "Fifth movie", "action");
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetMoreThenTen() {
        AfishaManager manager = new AfishaManager(10);
        Afisha one = new Afisha(1, "First movie", "action");
        Afisha two = new Afisha(2, "Second movie", "horror");
        Afisha three = new Afisha(3, "Third movie", "action");
        Afisha four = new Afisha(4, "Fourth movie", "drama");
        Afisha five = new Afisha(5, "Fifth movie", "action");
        Afisha six = new Afisha(6, "Sixth  movie", "cartoon");
        Afisha seven = new Afisha(7, "Seventh  movie", "action");
        Afisha eight = new Afisha(8, "Eighth movie", "thriller");
        Afisha nine = new Afisha(9, "Ninth movie", "action");
        Afisha ten = new Afisha(10, "Tenth movie", "horror");
        Afisha eleven = new Afisha(11, "Eleventh movie", "comedy");
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{eleven, ten, nine, eight, seven, six, five, four, three, two,};
        assertArrayEquals(expected, actual);
    }
}