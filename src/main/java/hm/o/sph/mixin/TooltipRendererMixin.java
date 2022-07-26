package hm.o.sph.mixin;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipData;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static hm.o.sph.util.TooltipFixer.INSTANCE;

@Mixin(Screen.class)
public abstract class TooltipRendererMixin {
    @Shadow
    protected TextRenderer textRenderer;
    @Shadow
    public int width;

    @Shadow @Final private static Logger LOGGER;

    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    @Redirect(
            method = "renderTooltip(Lnet/minecraft/client/util/math/MatrixStack;Ljava/util/List;Ljava/util/Optional;II)V",
            at = @At(value = "INVOKE", target = "Ljava/util/List;stream()Ljava/util/stream/Stream;"
            ))
    public Stream<Text> fixWTTData(List<Text> list, MatrixStack matrices, List<Text> lines, Optional<TooltipData> data, int x) {
        LOGGER.info("[WTT_DATA] FIX");
        INSTANCE.set(x, width);
        return INSTANCE.fix(list, textRenderer).stream();
    }
}
