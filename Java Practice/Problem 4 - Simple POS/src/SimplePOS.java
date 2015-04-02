import java.util.ArrayList;


/**
 *
 * @author Meghan
 */
public class SimplePOS {
	private static ArrayList<Item> inventory = null;
	private Cart cart = null;
	public SimplePOS() {
		inventory = new ArrayList<>();
		cart = Cart.getInstance();
	}
	// Singleton shopping cart
	private static class Cart {
		private static Cart instance = null;
		private ArrayList<CartItem> contents = new ArrayList<>();
		// Constructor to avoid instantiation
		protected Cart() {}
		// Provides a single Cart instance
		public static Cart getInstance() {
			if (instance == null) {
				instance = new Cart();
			}
			return instance;
		}
		public ArrayList<CartItem> getContents() {
			return contents;
		}
		private void setContents(ArrayList<CartItem> contents) {
			this.contents = contents;
		}
		// Add a single item, assume quantity is 1
		public void addItem(Item itm) {
			addItem(itm, 1);
		}
		// Add a single item in the given quantity
		public void addItem(Item itm, Integer qty) {
			getContents().add(new CartItem(itm,qty));
		}

		// Add a single item by name in the given quantity
		public void addItem(String name, Integer quantity) {
			try {
				Item itm = null;
				// Locate the item in the inventory
				for (Item i : inventory) {
					if (i.getName().equals(name)) {
						itm = i;
						break;
					}
				}
				if (itm == null) {
					throw new Exception("Cannot add item to cart - does not exist.");
				} else {
					// Add the item to the cart
					getContents().add(new CartItem(itm, quantity));
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		// Add a single item by name, assume quantity is 1		
		public void addItem(String name) {
			addItem(name, 1);
		}
		// Represents a line item in a cart, consisting of an
		// item and its corresponding quantity
		private class CartItem {
			private final Item item;
			private Integer quantity;
			protected CartItem(Item itm, Integer qty) {
				item = itm;
				quantity = qty;
			}
			protected Item getItem() {
				return item;
			}
			protected void setQuantity(Integer qty) {
				quantity = qty;
			}
			protected Integer getQuantity() {
				return quantity;
			}
		}
	}
	
	public class Item {
		private String name = null;
		private Integer price = null;
		public Item(String name, Integer price) {
			this.name = name;
			this.price = price;
		}
		public Item(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
	}
    
	public void addItemToCart(String name, Integer quantity) {
		try {
			if (itemExists(name)) {
				cart.addItem(name, quantity);
			} else {
				throw new ItemNotExistException();
			}
		} catch (ItemNotExistException e) {
			System.out.println(e.getMessage());
		}
	}

	public void addItemToCart(String name) {
		addItemToCart(name, 1);
	}
	
	public void addItemToInventory(String name, Integer price) {
		try {
			if (!itemExists(name)) {
				inventory.add(new Item(name, price));
			} else if (price == null) {
				throw new Exception("Item price must be defined.");
			} else {
				throw new ItemExistException();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private boolean itemExists(String name) {
		boolean exists = false;
		for (Item i : inventory) {
			if (i.getName().equals(name)) {
				exists = true;
				break;
			}
		}
		return exists;
	}
	public class ItemNotExistException extends Exception {
		private static final long serialVersionUID = 1L;
		public ItemNotExistException() {
			super("Item does not exist in inventory.");
		}
	}
	public class ItemExistException extends Exception {
		public ItemExistException() {
			super("Duplicate item exists in inventory.");
		}
	}
}
