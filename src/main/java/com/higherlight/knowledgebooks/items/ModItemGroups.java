package com.higherlight.knowledgebooks.items;

import com.higherlight.knowledgebooks.KnowledgeBooks;
import com.higherlight.knowledgebooks.registry.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroups extends KnowledgeBooks {
    public static final ItemGroup KNOWLEDGE_TAB = FabricItemGroupBuilder.build(
            new Identifier("knowledgebooks", "general"),
            () -> new ItemStack(ModItems.BOOK_OF_KNOWLEDGE));

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier("tutorial", "other"))
            .icon(() -> new ItemStack(Items.BOWL))
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(ModItems.BOOK_OF_KNOWLEDGE));
                itemStacks.add(new ItemStack(ModItems.ENCHANTMENT_SHARD));
            })
            .build();
}
