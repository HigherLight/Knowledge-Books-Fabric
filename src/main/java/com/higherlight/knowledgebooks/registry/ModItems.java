package com.higherlight.knowledgebooks.registry;

import com.higherlight.knowledgebooks.KnowledgeBooks;
import com.higherlight.knowledgebooks.items.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {



    public static final Item BOOK_OF_KNOWLEDGE = new Item(new Item.Settings().group(ModItemGroups.KNOWLEDGE_TAB));
    public static final Item ENCHANTMENT_SHARD = new Item(new Item.Settings().group(ModItemGroups.KNOWLEDGE_TAB));
    public static final Item TITANIUM = new Item(new Item.Settings().group(ModItemGroups.KNOWLEDGE_TAB));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(KnowledgeBooks.MOD_ID, "book_of_knowledge"), BOOK_OF_KNOWLEDGE);
        Registry.register(Registry.ITEM, new Identifier(KnowledgeBooks.MOD_ID, "enchantment_shard"), ENCHANTMENT_SHARD);
        Registry.register(Registry.ITEM, new Identifier(KnowledgeBooks.MOD_ID, "titanium"), TITANIUM);
    }
}