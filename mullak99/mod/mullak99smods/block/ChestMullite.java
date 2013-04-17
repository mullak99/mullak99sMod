package mullak99.mod.mullak99smods.block;

import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import mullak99.mod.mullak99smods.common.CommonProxy;
import mullak99.mod.mullak99smods.common.mullak99;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import mullak99.mod.mullak99smods.common.mullak99;
import mullak99.mod.mullak99smods.gui.ContainerMulliteChest;
import mullak99.mod.mullak99smods.gui.GUIMulliteChest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class ChestMullite extends Block {
	
	private String blockTexture;
	
	public ChestMullite(int par1, Material par2Material, String par3String)
    {
        super(par1, par2Material);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        
        this.blockTexture = par3String;
    }
	
	
	

	public void func_94332_a(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("mullak99/" + this.blockTexture);
		//this.blockIcon = par1IconRegister.registerIcon("mod/" + this.blockTexture);
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) {
		
		if(player instanceof EntityPlayerMP) {
			ModLoader.serverOpenWindow((EntityPlayerMP) player, new ContainerMulliteChest(), 0, x, y, z);
		} 
		
		else {
			ModLoader.openGUI((EntityPlayerSP) player, new GUIMulliteChest(player.inventory, x, y, z));
			
		}
		return true;
	}
	
	public TileEntity createNewTileEntity(World par1World) {
		return new TileEntityMulliteChest();
	}
	
	public int idDropped(int par1, Random random, int par2) {
        return mullak99.ChestMullite.blockID;
}
	
}
