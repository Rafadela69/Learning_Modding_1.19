package net.nuxvar.modlearning.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab LEARNING_TAB = new CreativeModeTab("learningtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NUXVARIUM.get());
        }
    };
}
