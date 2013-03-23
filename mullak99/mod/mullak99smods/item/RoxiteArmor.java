package mullak99.mod.mullak99smods.item;

import mullak99.mod.mullak99smods.common.mullak99;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class RoxiteArmor extends ItemArmor implements IArmorTextureProvider {

	public RoxiteArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);

	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == mullak99.RoxiteHelmet.itemID || itemstack.itemID == mullak99.RoxiteChest.itemID || itemstack.itemID == mullak99.RoxiteBoots.itemID)
		{
			return "/mods/mullak99/textures/armor/Roxite_1.png";
		}
		
		if(itemstack.itemID == mullak99.RoxiteLegs.itemID)
		{
			return "/mods/mullak99/textures/armor/Roxite_2.png";
		}
		
		else return null;
	}

}
