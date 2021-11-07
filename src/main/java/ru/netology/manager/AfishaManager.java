package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
    private Afisha[] movies = new Afisha[0];
    private int lastMoviesToShow = 10;

    public AfishaManager() {
    }

    public AfishaManager(int lastMoviesToShow) {
        this.lastMoviesToShow = lastMoviesToShow;
    }


    public void add(Afisha item) {
        int length = movies.length + 1;
        Afisha[] tmp = new Afisha[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public Afisha[] getAll() {
        int length = lastMoviesToShow;
        if (length > movies.length) {
            length = movies.length;
        }
        if (lastMoviesToShow <= 0) {
            length = movies.length;
        }
        Afisha[] result = new Afisha[length];
        for (int i = 0; i < length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }


}
