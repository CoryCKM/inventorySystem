package Data;

/**
 * this class will represent a product review for an item
 */
public class ProductReview {

    private Long id;
    private String reviewText;
    private Customer writtenBy;
    private InventoryItem associatedItem;
    private int rating;

    public ProductReview(String reviewText, Customer writtenBy, InventoryItem associatedItem, int rating) {
        this.reviewText = reviewText;
        this.writtenBy = writtenBy;
        this.associatedItem = associatedItem;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Customer getWrittenBy() {
        return writtenBy;
    }

    public void setWrittenBy(Customer writtenBy) {
        this.writtenBy = writtenBy;
    }

    public InventoryItem getAssociatedItem() {
        return associatedItem;
    }

    public void setAssociatedItem(InventoryItem associatedItem) {
        this.associatedItem = associatedItem;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
