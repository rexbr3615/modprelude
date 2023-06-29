package net.rexbr.preludejurassika.prelude_tests.dinosaur;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.entity.custom.EocarchariaEntity;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.dinos.anoraptor;

public class DinoRegister {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, prelude.MODID);



    public static final RegistryObject<EntityType<anoraptor>> TESTMM =
            ENTITY_TYPES.register("testmm",
                    () -> EntityType.Builder.of(anoraptor::new, MobCategory.CREATURE)
                            .sized(0.8f, 1.5f)
                            .build(new ResourceLocation(prelude.MODID, "testmm").toString()));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
