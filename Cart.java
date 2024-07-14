/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPractice01;

class Cart
{
	int index = -1;
	Product[] pdt; 
	Cart(int cart_size)
	{
		pdt = new Product[cart_size];
	}

	public void addProduct(Product pdt)
	{
		if(isCartFull())
			System.out.println("Cart is Full");
		else 
		{
			index++;
			this.pdt[index] = pdt;
			System.out.println("Product added successfully");
		}
	}

	public boolean isCartFull()
	{
		return index==this.pdt.length-1;
	}

	public void removeProduct()
	{
		if(isCartEmpty())
			System.out.println("Cart is empty");
		else 
		{
			this.pdt[index] = null;
			index--;
			System.out.println("Product removed successfully");
		}
	}

	public boolean isCartEmpty()
	{
		return index==-1;
	}

	public void display()
	{
		System.out.println();
		for(int i=0; i<pdt.length && pdt[i]!=null ;i++)
		{
			System.out.println("Product number "+(i+1));
			System.out.println("************************************");
			System.out.println("\tName of product is :"+pdt[i].pdt_name);
			System.out.println("\tProduct id is :"+pdt[i].pdt_id);
			System.out.println("\tProduct Price is :"+pdt[i].price);
			System.out.println("************************************");
		}
	}


}


