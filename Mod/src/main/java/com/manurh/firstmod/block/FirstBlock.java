package com.manurh.firstmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class FirstBlock extends Block {

	public FirstBlock(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player,
			InteractionHand hand, BlockHitResult result) {
		// TODO Auto-generated method stub
		return super.use(state, world, pos, player, hand, result);
	}

}
