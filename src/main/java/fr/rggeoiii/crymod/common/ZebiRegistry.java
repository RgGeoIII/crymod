package fr.rggeoiii.crymod.common;

import fr.rggeoiii.crymod.common.init.ItemsInit;
import fr.rggeoiii.crymod.utils.models.IModels;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class ZebiRegistry {

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemsInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModel(ModelRegistryEvent event){

        for (Item item : ItemsInit.ITEMS){

            if(item instanceof IModels){

                ((IModels) item).IModels();

            }

        }

    }

}
