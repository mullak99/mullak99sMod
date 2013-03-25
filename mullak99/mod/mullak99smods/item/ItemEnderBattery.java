package mullak99.mod.mullak99smods.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ItemEnderBattery extends Item {

	
	public ItemEnderBattery(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}

	public void func_94581_a(IconRegister iconRegister)
	{
	         iconIndex = iconRegister.registerIcon("mullak99:EnderBattery");
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	par3List.add("Unlimited Fuel");
	}
}
