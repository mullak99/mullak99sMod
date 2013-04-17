package mullak99.mod.mullak99smods.common;

import cpw.*;
import cpw.mods.*;
import cpw.mods.fml.*;
import cpw.mods.fml.client.*;
import cpw.mods.fml.client.modloader.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.modloader.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import ibxm.*;
import net.*;
import net.minecraft.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.client.texturepacks.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.packet.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.liquids.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import java.util.Map;
import java.util.Random;

public class mullak99Util extends BaseMod
{
    public void load()
    {
        ModLoader.registerEntityID(mullak99Util.Entitymullak.class, "mullak", 121,
	    (0 << 16) + (255 << 8) + 0,
	    (0 << 16) + (166 << 8) + 0);
		ModLoader.addSpawn(mullak99Util.Entitymullak.class, 5, 1, 2, EnumCreatureType.creature );
		ModLoader.addEntityTracker(this, mullak99Util.Entitymullak.class, 121, 20, 5, true);
        cpw.mods.fml.common.registry.LanguageRegistry.instance().addStringLocalization("entity.mullak.name", "en_US", "mullak99");
    }

    public void addRenderer(Map var1)
    {
        var1.put(mullak99Util.Entitymullak.class, new RenderBiped(new ModelBiped(), 0));
    }

    public Entity spawnEntity(int var1, World var2, double var3, double var5, double var7)
    {
        switch (var1)
        {
            case 121:
                return new mullak99Util.Entitymullak(var2);

            default:
                return null;
        }
    }

    public String getVersion()
    {
        return "1.0";
    }


   public static class Entitymullak extends EntityMob
	{
		World world = null;
	    public Entitymullak(World var1)
	    {
	        super(var1);
	        world = var1;
	        this.texture = "mob/mullak99.png";
			this.moveSpeed = 3.9999999999999996F;
        	this.isImmuneToFire = false;
        	
this.tasks.addTask(0, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(1, new EntityAILookIdle(this));
	    }

	    public int getAttackStrength(Entity par1Entity)
		{
		        return 10;
    	}

    	public boolean isAIEnabled()
		{
			   return false;
    	}

	    public int getMaxHealth()
	    {
	        return 20;
	    }

	    /**
	     * Drop 0-2 items of this living's type
	     */
	    protected void dropFewItems(boolean var1, int var2)
	    {
	        this.entityDropItem(new ItemStack(Item.diamond), 0.0F);
	    }

	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    public String getLivingSound()
	    {
	        return null;
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    public String getHurtSound()
	    {
	        return "damage.hurtflesh1";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    public String getDeathSound()
	    {
	        return "damage.hurtflesh2";
	    }

	    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
world.createExplosion((Entity)null, i, j, k, 10, true);
		}

		protected void fall(float l){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			super.fall(l);
			
		}

    	public void onCriticalHit(Entity entity) {
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
world.createExplosion((Entity)null, i, j, k, 1, true);
		}

		public void onKillEntity(EntityLiving entityLiving){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
		}
	}

	

}
