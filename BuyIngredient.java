class Ingredient
{
	private int itemQuantity;

	public void availQuantity()
	{
		System.out.println("---Available ingredient quantity---"+itemQuantity);
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
		System.out.println("---Buying ingredients---");
		Ingredient biscuit = new Ingredient();
		biscuit.buyItem(500);
		biscuit.availQuantity();
	}
}