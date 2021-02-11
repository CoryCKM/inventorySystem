package Data;

import javax.print.DocFlavor;
import java.util.List;

/**
 * this class will represent an item in the inventory
 */
public class InventoryItem {

    private Long id;
    private String productName;
    private String productDescritpion;
    private double productPrice;
    private int quantityOnHand;
    private List<String> images; //this will be a list because a item can have multiple images and they will be url's to get an image
    private List<ProductReview> productReviews; //the list of reviews for the product;

    public InventoryItem(Long id, String productName, String productDescritpion, double productPrice, int quantityOnHand, List<String> images, List<ProductReview> productReviews) {
        this.id = id;
        this.productName = productName;
        this.productDescritpion = productDescritpion;
        this.productPrice = productPrice;
        this.quantityOnHand = quantityOnHand;
        this.images = images;
        this.productReviews = productReviews;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescritpion() {
        return productDescritpion;
    }

    public void setProductDescritpion(String productDescritpion) {
        this.productDescritpion = productDescritpion;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<ProductReview> getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(List<ProductReview> productReviews) {
        this.productReviews = productReviews;
    }
}
