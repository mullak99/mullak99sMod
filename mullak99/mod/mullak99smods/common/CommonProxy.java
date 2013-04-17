package mullak99.mod.mullak99smods.common;

import cpw.mods.fml.client.registry.RenderingRegistry;



public class CommonProxy
{
	public void init()
	{
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}

