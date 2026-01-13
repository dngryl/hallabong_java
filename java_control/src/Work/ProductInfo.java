package Work;

public class ProductInfo {

    //상품정보 저장할수 있는 클래스 (  상품명,  상품 가격, 카테고리 , 수량)
	
    public String name;
    public int price;
    public String category;
    public int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductInfo(String name, int price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}