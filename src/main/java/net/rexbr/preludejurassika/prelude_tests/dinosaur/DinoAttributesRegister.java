package net.rexbr.preludejurassika.prelude_tests.dinosaur;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
import net.rexbr.preludejurassika.entity.custom.EocarchariaEntity;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.DinoRegister;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.dinos.anoraptor;

@Mod.EventBusSubscriber(modid = prelude.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DinoAttributesRegister {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {

        event.put(DinoRegister.TESTMM.get(), anoraptor.registerAttributes().build());

    }

}
