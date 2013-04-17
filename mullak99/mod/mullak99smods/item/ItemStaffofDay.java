package mullak99.mod.mullak99smods.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;


public class ItemStaffofDay extends Item {
	
	
	public static final String[] bowPullIconNameArray = new String[] {"bow_pull_0", "bow_pull_1", "bow_pull_2"};
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;
	boolean active = false;
	
	public ItemStaffofDay(int par1) {
		
		super(par1);
		this.maxStackSize = 1;
		this.setMaxDamage(100);
		
		
	}
	
	
	

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		
		if (world.getWorldTime() < 13000)
		{
		return itemstack;
		}
		
		active = true;
		
		itemstack.damageItem(1,  entityplayer);
		
		
		return itemstack;
		
	}
	
	public void onUpdate(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		if (active && world.getWorldTime() > 24000)
		{
			world.setWorldTime(world.getWorldTime() - 24000);
		}
		
		if (world.getWorldTime() < 13000)
		{
			active = false;
		}
		
		
		if (active)
		{
			world.setWorldTime(1000);
		}
		else
		{
			entityplayer.addChatMessage("ERROR: Staff failed to work!");
		}
		
	}
	
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        return par1ItemStack;
    }
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
	
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }
	
	
	
	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("mullak99:StaffofDay");
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	par3List.add("Not Working at the moment!");
	}
	
	
}
