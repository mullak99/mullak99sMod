package mullak99.mod.mullak99smods.item;

import mullak99.mod.mullak99smods.common.mullak99;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;






public class MulliteArmor extends ItemArmor implements IArmorTextureProvider
{

public MulliteArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4){
	
super(par1, par2EnumArmorMaterial, par3, par4);

}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == mullak99.MulliteHelmet.itemID || itemstack.itemID == mullak99.MulliteChest.itemID || itemstack.itemID == mullak99.MulliteBoots.itemID)
		{
			return "/mods/mullak99/textures/armor/Mullite_1.png";
		}
		
		if(itemstack.itemID == mullak99.MulliteLegs.itemID)
		{
			return "/mods/mullak99/textures/armor/Mullite_2.png";
		}
		
		else return null;
	}

}
