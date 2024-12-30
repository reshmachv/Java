package ComparatorComparable;
public class Movies implements Comparable<Movies>{
    private String name;
    private float rating;
    private int year;

    @Override
    public int compareTo(Movies m){
        return m.name.compareTo(this.name);
    }
    public Movies(String name, float rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name +
                ", rating=" + rating +
                ", year=" + year +
                '}'+'\n';
    }
}
