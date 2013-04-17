package mullak99.mod.mullak99smods.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemMullite extends Item {

	
	public ItemMullite(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}

	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("mullak99:Mullite");
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		
		
		entityplayer.addChatMessage("-------------------------------------");
		entityplayer.addChatMessage("------------Secret Found!------------");
		entityplayer.addChatMessage("-Email me:  mullak99@mullak99.co.uk -");
		entityplayer.addChatMessage("- PS. Sorry the message shows twice -");
		entityplayer.addChatMessage("-------------------------------------");
		
		
		return itemstack;	
	}	


}
