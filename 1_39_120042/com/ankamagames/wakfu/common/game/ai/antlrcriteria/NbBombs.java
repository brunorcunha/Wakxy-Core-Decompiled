package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import com.ankamagames.framework.ai.criteria.antlrcriteria.*;
import com.ankamagames.wakfu.common.game.effect.*;
import com.ankamagames.wakfu.common.datas.*;
import com.ankamagames.baseImpl.common.clientAndServer.game.effectArea.*;
import com.ankamagames.wakfu.common.game.effectArea.*;
import com.ankamagames.wakfu.common.game.fight.*;
import java.util.*;

public final class NbBombs extends FunctionValue
{
    private static ArrayList<ParserType[]> signatures;
    private boolean target;
    
    @Override
    protected List<ParserType[]> getSignatures() {
        return NbBombs.signatures;
    }
    
    @Override
    public boolean isInteger() {
        return true;
    }
    
    public NbBombs(final ArrayList<ParserObject> args) {
        super();
        this.target = true;
        final short paramType = this.checkType(args);
        if (paramType == 0) {
            this.target = false;
        }
        if (paramType == 1) {
            this.target = args.get(0).getValue().equalsIgnoreCase("target");
        }
    }
    
    @Override
    public long getLongValue(final Object criterionUser, final Object criterionTarget, final Object criterionContent, final Object criterionContext) {
        if (criterionContext == null) {
            throw new CriteriaExecutionException("Pas de contexte...");
        }
        final boolean isFight = criterionContext instanceof AbstractFight;
        final boolean isFightContext = criterionContext instanceof WakfuFightEffectContext;
        if (!isFight && !isFightContext) {
            throw new CriteriaExecutionException("On essaie de compter les invocations en dehors d'un combat...");
        }
        if (!(criterionUser instanceof BasicCharacterInfo)) {
            throw new CriteriaExecutionException("On essaie de compter les invocations d'un caster qui n'est pas un perso");
        }
        final BasicCharacterInfo targetCharacter = CriteriaUtils.getTargetCharacterInfoFromParameters(this.target, criterionUser, criterionTarget, criterionContext, criterionContent);
        if (targetCharacter == null) {
            return -1L;
        }
        final BasicFight<?> basicFight = (BasicFight<?>)targetCharacter.getCurrentFight();
        if (basicFight == null) {
            return 0L;
        }
        int total = 0;
        final Collection<BasicEffectArea> activeEffectAreas = basicFight.getActiveEffectAreas();
        for (final BasicEffectArea activeEffectArea : activeEffectAreas) {
            if (activeEffectArea.getOwner() != targetCharacter) {
                continue;
            }
            if (!(activeEffectArea instanceof AbstractBombEffectArea)) {
                continue;
            }
            ++total;
        }
        return super.getSign() * total;
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.NB_BOMBS;
    }
    
    static {
        NbBombs.signatures = new ArrayList<ParserType[]>();
        ParserType[] sig = new ParserType[0];
        NbBombs.signatures.add(sig);
        sig = new ParserType[] { ParserType.STRING };
        NbBombs.signatures.add(sig);
    }
}
