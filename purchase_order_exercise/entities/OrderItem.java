package purchase_order_exercise.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price){
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public void setPrice (Double price){
        this.price = price;
    }

    public Double subTotal(){
        Double total = this.quantity * this.price;
        return total;
    }

}
