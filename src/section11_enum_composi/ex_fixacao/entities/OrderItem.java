package section11_enum_composi.ex_fixacao.entities;

import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(){}

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal(){
        double pricedProduct = product.getPrice();
        return pricedProduct*quantity;
    }
    public String toString(){
        return getProduct().getName() +
                ",$"
                +", Quantity: "
                + quantity
                + ", Subtotal: "
                + String.format("%.2f", subTotal());
    }
}
