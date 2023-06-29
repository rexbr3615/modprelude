package net.rexbr.preludejurassika.prelude_tests.dinosaur;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.rexbr.preludejurassika.prelude_tests.dinosaur.dinos.anoraptorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RendererRegister {
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(DinoRegister.TESTMM.get(), anoraptorRenderer::new);
    }

}
