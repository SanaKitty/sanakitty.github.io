package io.github.sanakitty.loyaltypointsmarket.Inventories;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class ShopkeeperShopHolder implements InventoryHolder{

	private Inventory inv;
	String name;
	
	@Override
	public Inventory getInventory() {
		return inv;
	}

}
