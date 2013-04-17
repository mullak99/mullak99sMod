package mullak99.mod.mullak99smods.common;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import com.*;

public class ClientProxy extends CommonProxy
{
	
	
	@Override	
public void init()
	{
		
	}

	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
}

