package bioskopApp.entities;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private int id;
    private String title;
    private String genre;
    private String duration;
    private Double rating;
    private List<String> reviews; // Changed to List for multiple reviews
    private List<String> showTime;

    // Constructor
    public Film(int id, String title, String genre, double duration, double rating, List<String> showTime) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = String.valueOf(duration);
        this.rating = rating;
        this.reviews = new ArrayList<>(); // Initialize reviews list
        this.showTime = showTime;  // Properly initialize showtimes
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getDuration() { return duration; }
    public Double getRating() { return rating; }
    public List<String> getReviews() { return reviews; } // Changed to return a list of reviews
    public List<String> getShowTime() { return showTime; }

    // Setter with validation (Encapsulation)
    public void setRating(Double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating harus antara 0-5");
        }
    }

    // Add a new review
    public void addReview(String reviewText) {
        if (reviewText == null || reviewText.isBlank()) {
            throw new IllegalArgumentException("Review tidak boleh kosong");
        }
        reviews.add(reviewText);
    }

    // Method to display all reviews
    public String getAllReviews() {
        if (reviews.isEmpty()) {
            return "Tidak ada ulasan untuk film ini.";
        }
        StringBuilder allReviews = new StringBuilder();
        for (String review : reviews) {
            allReviews.append("- ").append(review).append("\n");
        }
        return allReviews.toString();
    }
}