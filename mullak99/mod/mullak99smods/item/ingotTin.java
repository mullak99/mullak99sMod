package mullak99.mod.mullak99smods.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;


public class ingotTin extends Item {

	
	public ingotTin(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}

	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("mullak99:ingotTin");
	}
}
