package net.aepherastudios.ninefold.item;

import net.aepherastudios.ninefold.Ninefold;
import net.aepherastudios.ninefold.block.NinefoldBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class NinefoldCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ninefold.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EMPYREAN = CREATIVE_MODE_TABS.register("empyrean",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NinefoldItems.HARPY_FEATHER.get()))
                    .title(Component.translatable("creativetab.harpy_feather"))
                    .displayItems((pParameters, pOutput) -> {



                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
