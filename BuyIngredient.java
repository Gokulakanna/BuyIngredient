class Ingredient
{
	private int itemQuantity;
	private String itemName;

	public void setItemName(String itemName)
	{
		this.itemName=itemName;
	}
	public String getItemName()
	{
		return this.itemName;
	}

	public void availQuantity()
	{
		System.out.println("---Available "+this.getItemName()+" quantity---"+this.itemQuantity);
	}
	public void buyItem(int buyingQuantity)
	{
		this.itemQuantity=this.itemQuantity+buyingQuantity;
	}
}
public class BuyIngredient
{
	public static void main(String[] args)
	{
		System.out.println("---Igredients changed");
		Ingredient ingredient = new Ingredient();
		ingredient.buyItem(500);
		ingredient.setItemName("chocolate");
		ingredient.availQuantity();
	}
}
