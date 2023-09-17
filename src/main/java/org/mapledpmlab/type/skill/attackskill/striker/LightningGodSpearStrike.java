package org.mapledpmlab.type.skill.attackskill.striker;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class LightningGodSpearStrike extends AttackSkill {
    public LightningGodSpearStrike() {
        this.setName("뇌신창격");
        this.setAttackCount(6L);
        this.setDamage(330.0);
        this.setCooldown(7.0);
        this.setRelatedSkill(new LightningGodSpearStrikeDot());
        this.addFinalDamage(1.6);       // 코어강화
        this.addFinalDamage(1.71);          // 축뢰
    }
}
