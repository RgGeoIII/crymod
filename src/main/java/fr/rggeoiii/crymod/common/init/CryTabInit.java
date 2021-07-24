package fr.rggeoiii.crymod.common.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CryTabInit {

    public static CreativeTabs cryzen = new CreativeTabs("crymod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.FISH);
        }
    };

}
