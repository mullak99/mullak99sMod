package mullak99.mod.mullak99smods.item;

import mullak99.mod.mullak99smods.common.mullak99;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemRoxitePickaxe extends ItemPickaxe {


	public ItemRoxitePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	
	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("mullak99:RoxitePickaxe");
	}
}
