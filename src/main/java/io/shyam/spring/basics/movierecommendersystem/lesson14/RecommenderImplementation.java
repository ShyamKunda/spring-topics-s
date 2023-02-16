package io.shyam.spring.basics.movierecommendersystem.lesson14;


public class RecommenderImplementation {

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    private Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public String [] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
