package net.nuxvar.modlearning.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nuxvar.modlearning.ModLearning;
import net.minecraft.world.item.Item;
import net.nuxvar.modlearning.block.custom.JumpyBlock;
import net.nuxvar.modlearning.block.custom.NuvxariumLampBlock;
import net.nuxvar.modlearning.block.custom.PeachCropBlock;
import net.nuxvar.modlearning.item.ModCreativeModTab;
import net.nuxvar.modlearning.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ModLearning.MOD_ID);

    public static final RegistryObject<Block> NUXVARIUM_BLOCK = registerBlock("nuxvarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModTab.LEARNING_TAB);

    public static final RegistryObject<Block> NUXVARIUM_ORE = registerBlock("nuxvarium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModTab.LEARNING_TAB);
    public static final RegistryObject<Block> DEEPSLATE_NUXVARIUM_ORE = registerBlock("deepslate_nuxvarium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModTab.LEARNING_TAB);

    public static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
            () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModTab.LEARNING_TAB);
    public static final RegistryObject<Block> NUXVARIUM_LAMP = registerBlock("nuxvarium_lamp",
            () -> new NuvxariumLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(NuvxariumLampBlock.LIT) ? 15 : 0)), ModCreativeModTab.LEARNING_TAB);
    public static final RegistryObject<Block> PEACH_CROP = BLOCKS.register("peach_crop",
            () -> new PeachCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
    }
}

