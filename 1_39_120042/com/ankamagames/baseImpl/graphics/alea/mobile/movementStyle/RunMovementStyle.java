package com.ankamagames.baseImpl.graphics.alea.mobile.movementStyle;

import org.apache.log4j.*;
import com.ankamagames.baseImpl.graphics.alea.mobile.*;
import com.ankamagames.framework.kernel.core.maths.*;
import com.ankamagames.baseImpl.graphics.alea.mobile.movementStyle.jump.*;

public class RunMovementStyle implements PathMovementStyle
{
    protected static Logger m_logger;
    private static final RunMovementStyle m_instance;
    private final JumpTrajectory m_jumpDown;
    private final JumpTrajectory m_jumpUp;
    
    public static RunMovementStyle getInstance() {
        return RunMovementStyle.m_instance;
    }
    
    protected RunMovementStyle() {
        super();
        this.m_jumpDown = new JumpTrajectoryDown(0.0f, 0.5f, 0.5f, 1.0f);
        this.m_jumpUp = new JumpTrajectoryUp(0.0f, 0.5f, 0.5f, 1.0f);
    }
    
    @Override
    public final int getCellSpeed(final StyleMobile actor) {
        return actor.getRunMovementSpeed().getTimeBetweenCells();
    }
    
    @Override
    public JumpTrajectory getJumpDown() {
        return this.m_jumpDown;
    }
    
    @Override
    public JumpTrajectory getJumpUp() {
        return this.m_jumpUp;
    }
    
    @Override
    public void onStandingOnLastCell(final StyleMobile actor) {
        final String currentAnimation = actor.getAnimation();
        if (currentAnimation.equals("AnimSaut") || currentAnimation.equals("AnimRelique-Saut")) {
            actor.setAnimation(actor.getStaticAnimationKey());
        }
        else {
            actor.setAnimation(actor.getMoveEndAnimationKey());
        }
    }
    
    @Override
    public void onStandingOnFirstCell(final StyleMobile actor, final Direction8 nextDirection) {
    }
    
    @Override
    public int getDelayOnFirstCell() {
        return -1;
    }
    
    @Override
    public void onMovingSpecialJump(final StyleMobile actor) {
        actor.setIsInSpecialJump(true);
        if (!actor.getDirection().isDirection4()) {
            return;
        }
        final String previousAnimation = actor.getAnimation();
        actor.setAnimation("AnimRelique-Saut");
    }
    
    @Override
    public void onMovingOnAir(final StyleMobile actor, final int deltaZ, final Phase jumpPhase) {
        actor.setIsInSpecialJump(false);
        final String previousAnimation = actor.getAnimation();
        JumpHelper.setJumpAnimation(actor, deltaZ, jumpPhase, false);
    }
    
    @Override
    public void onMovingOnGround(final StyleMobile actor, final int remainPathLength) {
        actor.setIsInSpecialJump(false);
        final String currentAnimation = actor.getAnimation();
        if (currentAnimation.equals("AnimCourse-Fin") || !currentAnimation.startsWith("AnimCourse")) {
            if (actor.containsAnimation("AnimCourse")) {
                actor.setAnimation("AnimCourse");
            }
            else {
                actor.setAnimation("AnimMarche");
            }
        }
    }
    
    @Override
    public void onDirectionChanged(final StyleMobile actor, final Direction8 newDirection) {
        if (actor.isInSpecialJump() && newDirection.isDirection4()) {
            actor.setAnimation("AnimRelique-Saut");
        }
        actor.setDirection(newDirection);
    }
    
    @Override
    public boolean createPathOnSetPosition(final StyleMobile actor) {
        return false;
    }
    
    @Override
    public boolean isAirImpulsionNeeded(final StyleMobile actor, final int z) {
        return Math.abs(z) > 2;
    }
    
    @Override
    public String getStyleName() {
        return MovementStyleManager.RUN_STYLE;
    }
    
    static {
        RunMovementStyle.m_logger = Logger.getLogger((Class)RunMovementStyle.class);
        m_instance = new RunMovementStyle();
    }
}
