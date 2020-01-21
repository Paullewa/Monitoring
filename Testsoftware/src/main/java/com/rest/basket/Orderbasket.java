package com.rest.basket;

import java.util.List;

import com.rest.order_product.Order;
import com.sun.xml.txw2.annotation.XmlElement;

public class Orderbasket {

  protected  Order orderbasket;
  //Id for the item inside our badket
  protected int Item_id;
  // Informe us about the situation our Basket
  public String Status;
public Orderbasket() {
	
	orderbasket = null;
	Item_id = -1;
	Status = " ";
}
public Orderbasket(Order _orderbasket, int _item_id, String _status) {
	
	orderbasket = _orderbasket;
	Item_id = _item_id;
	Status = _status;
	
}
//need to collect all index
@XmlElement
public Order getOrderbasket(Order Orderb) {
	 {
		for(var index =0; index< Orderb.getId().indexOf(Item_id); ++index )
		{
			 ;
		}
	}
	return orderbasket;
}

public void setOrderbasket(Order orderbasket) {
	orderbasket = orderbasket;
}
// collect all Item_id an set it inside a array
@XmlElement
public int getItem_id(int items[]) {
	 for(int i= 0; i<= items.length;i++) {
		Item_id = items[i]; 
	 }
	return Item_id;
	
}

public void setItem_id(int item_id) {
	Item_id = item_id;
}

public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}   
 
private static List<Order>Listoder;
 

public static void addOder(Order a){
	
	 Listoder.add(a);
	
}

  
}
