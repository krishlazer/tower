package krish.retail.prods;

public class Store 
{
	private int StoreID;
	private String StoreName;
	private String StoreCity;
	private String StoreURL;
	private int StorePIN;
	private int StoreDepartments;
	private int StoreLevels;
	
	public int getStoreID() 
	{
		return StoreID;
	}
	public void setStoreID(int StoreID) 
	{
		this.StoreID = StoreID;
	}
	public String getStoreName() 
	{
		return StoreName;
	}
	public void setStoreName(String StoreName) 
	{
		this.StoreName = StoreName;
	}
	public String getStoreCity() 
	{
		return StoreCity;
	}
	public void setStoreCity(String StoreCity) 
	{
		this.StoreCity = StoreCity;
	}
	public String getStoreURL() 
	{
		return StoreURL;
	}
	public void setStoreURL(String StoreURL) 
	{
		this.StoreURL = StoreURL;
	}
	public int getStorePIN() 
	{
		return StorePIN;
	}
	public void setStorePIN(int StorePIN) 
	{
		this.StorePIN = StorePIN;
	}
	public int getStoreDepartments() 
	{
		return StoreDepartments;
	}
	public void setStoreDepartments(int StoreDepartments) 
	{
		this.StoreDepartments = StoreDepartments;
	}
	public int getStoreLevels() 
	{
		return StoreLevels;
	}
	public void setStoreLevels(int StoreLevels) 
	{
		this.StoreLevels = StoreLevels;
	}
	
	public Store()
	{
		
		
	}
	
	public Store(int StoreID, String StoreName, String StoreCity, String StoreURL, int StorePIN, int StoreDepartments, int StoreLevels) 
	{
		//super();
		this.StoreID = StoreID;
		this.StoreName = StoreName;
		this.StoreCity = StoreCity;
		this.StoreURL = StoreURL;
		this.StorePIN = StorePIN;
		this.StoreDepartments = StoreDepartments;
		this.StoreLevels = StoreLevels;
	}
}
