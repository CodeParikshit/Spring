package model;

import java.util.Arrays;
import java.util.Map;

public class Product {
	Map<Integer, String> productInfo;
	String[] categegory;
	public Map<Integer, String> getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(Map<Integer, String> productInfo) {
		this.productInfo = productInfo;
	}
	public String[] getCategegory() {
		return categegory;
	}
	public void setCategegory(String[] categegory) {
		this.categegory = categegory;
	}
	@Override
	public String toString() {
		return "Product [productInfo=" + productInfo + ", categegory=" + Arrays.toString(categegory) + "]";
	}
	
	

}
