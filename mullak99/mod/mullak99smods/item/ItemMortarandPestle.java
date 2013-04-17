package mullak99.mod.mullak99smods.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemMortarandPestle extends Item {

	
	public ItemMortarandPestle(int par1) {
		super(par1);
		
		
		this.maxStackSize = 1;
		this.setMaxDamage(10);
		
		
	}

	public ItemStack onItemCraft(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		
		
		
		
		itemstack.damageItem(1,  entityplayer);
		
		
		return itemstack;	
	}
	
	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("mullak99:MortarandPestle");
	}
}
