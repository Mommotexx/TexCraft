package com.mommotexx.texcraft.item;


import com.mommotexx.texcraft.TexCraft;
import com.mommotexx.texcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TexCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEXCRAFT_TAB =
            CREATIVE_MODE_TABS.register("texcraft_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                            .title(Component.translatable("creativetab.texcraft_tab"))
                            .displayItems((displayParameters, output) -> {
                                ModBlocks.BLOCKS.getEntries().forEach(e -> output.accept(e.get()));
                                ModItems.ITEMS.getEntries().forEach(e -> output.accept(e.get()));
                            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
