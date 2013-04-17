package mullak99.mod.mullak99smods.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import universalelectricity.components.common.BasicComponents;
import universalelectricity.core.item.ItemElectric;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMulliteBattery extends ItemElectric
{
	public ItemMulliteBattery(int id)
	{
		super(id);
		this.setUnlocalizedName("EnderBattery");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public double getMaxJoules(ItemStack itemStack)
	{
		return 1000000000;
	}

	@Override
	public double getVoltage(ItemStack itemStack)
	{
		return 25;
	}



	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("mullak99:MulliteBattery");
	}
}
