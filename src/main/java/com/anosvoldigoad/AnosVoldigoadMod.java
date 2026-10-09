
package com.anosvoldigoad;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(AnosVoldigoadMod.MOD_ID)
public class AnosVoldigoadMod {
    public static final String MOD_ID = "anosvoldigoad";
    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    public AnosVoldigoadMod() {
        LOGGER.info("Mod Anos Voldigoad carregado!");
    }
}
