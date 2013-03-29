package mullak99.mod.mullak99smods.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class mullak99FuelHandler implements IFuelHandler {

		public int getBurnTime(ItemStack fuel) {
			if(fuel.itemID == mullak99.EnderBattery.itemID){
				return 200;
		}
			if(fuel.itemID == mullak99.ItemCoalDust.itemID){
				return 1600;
}
			else
			return 0;

}
}