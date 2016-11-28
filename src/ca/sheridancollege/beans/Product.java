package ca.sheridancollege.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private String productId;
	private String productName;
	private Double productPrice;
	private String productDetail;
	private int productQuantity;
	private int storeId;
	private String productWeight;
	private String productBrand;
	private String productSKU;
	private String productReviews;
	private String productImage;

	public Product() {
		super();
	}

	public Product(String productId, String productName, Double productPrice, String productDetail, int productQuantity,
			int storeId, String productWeight, String productBrand, String productSKU, String productReviews,
			String productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDetail = productDetail;
		this.productQuantity = productQuantity;
		this.storeId = storeId;
		this.productWeight = productWeight;
		this.productBrand = productBrand;
		this.productSKU = productSKU;
		this.productReviews = productReviews;
		this.productImage = productImage;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductSKU() {
		return productSKU;
	}

	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}

	public String getProductReviews() {
		return productReviews;
	}

	public void setProductReviews(String productReviews) {
		this.productReviews = productReviews;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

}
