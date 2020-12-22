package com.higherlight.knowledgebooks;

import com.higherlight.knowledgebooks.registry.ModItems;
import net.fabricmc.api.ModInitializer;


public class KnowledgeBooks implements ModInitializer {
    public static final String MOD_ID = "knowledgebooks";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
