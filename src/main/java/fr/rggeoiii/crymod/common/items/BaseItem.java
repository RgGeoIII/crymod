package fr.rggeoiii.crymod.common.items;

import fr.rggeoiii.crymod.Crymod;
import fr.rggeoiii.crymod.common.init.CryTabInit;
import fr.rggeoiii.crymod.common.init.ItemsInit;
import fr.rggeoiii.crymod.utils.models.IModels;
import net.minecraft.item.Item;

public class BaseItem extends Item implements IModels {

    public BaseItem(String name){

        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CryTabInit.cryzen);
        ItemsInit.ITEMS.add(this);
    }

    @Override
    public void IModels() {
        Crymod.proxy.modelRender(this,0, "inventory");

    }
}
