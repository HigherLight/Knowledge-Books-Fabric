package com.higherlight.knowledgebooks.registry;

import com.higherlight.knowledgebooks.KnowledgeBooks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BOOK_OF_KNOWLEDGE = new Item(new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(KnowledgeBooks.MOD_ID, "book_of_knowledge"), BOOK_OF_KNOWLEDGE);
    }

}