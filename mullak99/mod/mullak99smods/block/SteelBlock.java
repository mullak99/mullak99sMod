package mullak99.mod.mullak99smods.block;

import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import mullak99.mod.mullak99smods.common.CommonProxy;
import mullak99.mod.mullak99smods.common.mullak99;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class SteelBlock extends Block
{

	
	 private String blockTexture;

	 public SteelBlock(int par1, Material par2Material, String par3String)
	    {
	        super(par1, par2Material);
	        this.CreativeTab(CreativeTabs.tabBlock);
	        
	        
	       
	    	
	    	
	    	this.blockTexture = par3String;
	    	
	    }
 
	
	private void CreativeTab(CreativeTabs tabblock) {
		// TODO Auto-generated method stub
	
			
	}

	public void func_94332_a(IconRegister par1IconRegister)
	{
	         this.blockIcon = par1IconRegister.registerIcon("mod/" + this.blockTexture);
	}
	
	public int idDropped(int par1, Random random, int par2) {
        return mullak99.SteelBlock.blockID;
}
}