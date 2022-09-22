package net.rexbr.preludejurassika.screen;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.screen.slots.AnalyzerMenu;
import net.rexbr.preludejurassika.screen.slots.CultureMenu;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, prelude.MODID);

    public static final RegistryObject<MenuType<AnalyzerMenu>> ANALYZER_MENU =
            registerMenuType(AnalyzerMenu::new, "analyzer_menu");
    public static final RegistryObject<MenuType<CultureMenu>> CULTURE_MENU =
            registerMenuType(CultureMenu::new, "culture_menu");


    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
