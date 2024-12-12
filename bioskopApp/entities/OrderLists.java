package bioskopApp.entities;

public class OrderLists {
    private String id;
    private String customerName;
    private String userId;
    private String phone;
    private String movieTitle;
    private String seatNumber;
    private String showTime;
    private String studioType;
    private String paymentMethod;
    private int rating; // Use a scale of 1-5 for rating
    private String review;

    public OrderLists(String id, String customerName, String userId, String phone, String movieTitle,
                 String seatNumber, String showTime, String studioType, String paymentMethod,
                 int rating, String review) {
        this.id = id;
        this.customerName = customerName;
        this.userId = userId;
        this.phone = phone;
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.showTime = showTime;
        this.studioType = studioType;
        this.paymentMethod = paymentMethod;
        this.rating = rating;
        this.review = review;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getStudioType() {
        return studioType;
    }

    public void setStudioType(String studioType) {
        this.studioType = studioType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", userId='" + userId + '\'' +
                ", phone='" + phone + '\'' +
                ", movieTitle='" + movieTitle + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", showTime='" + showTime + '\'' +
                ", studioType='" + studioType + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", rating=" + rating +
                ", review='" + review + '\'' +
                '}';
    }
}
