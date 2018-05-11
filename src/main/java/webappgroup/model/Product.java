package webappgroup.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity(name = "product")
public class Product {
	@Id
	private long productId;
	@ManyToMany
	@JoinColumn(name="categoryId")
	private Category category;
	private String productName;
	private String productImage;
	private String productPrice;
	private String productDescription;
	
	public Product() {
		super();
	}
	
	public Product(long productId, Category category, String productName, String productImage, String productPrice,
			String productDescription) {
		super();
		this.productId = productId;
		this.category = category;
		this.productName = productName;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
}
