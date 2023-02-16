package io.shyam.spring.basics.movierecommendersystem.lesson14;

import org.springframework.stereotype.Component;

public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {

        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
